package src.service.imp;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import src.bean.SaleItem;
import src.bean.SaleOrder;
import src.bean.SaleReturnItem;
import src.bean.SaleReturnOrder;
import src.dao.SaleReturnItemRepository;
import src.dao.SaleReturnOrderRepository;
import src.exception.ServiceException;
import src.service.SaleReturnService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SaleReturnServiceImp implements SaleReturnService{
	private List<SaleReturnItem> list = new ArrayList<SaleReturnItem>();
	@Resource
	private SaleReturnOrderRepository saleReturnOrderResipotory;
	@Resource
	private SaleReturnItemRepository saleReturnItemResipotory;
	@Override
	public List<SaleReturnItem> addSaleReturnOrder(SaleOrder saleOrder, List<SaleItem> saleItem)
			throws ServiceException {
		SaleReturnOrder saleReturnOrder = new SaleReturnOrder();
		saleReturnOrder.setCustomerId(saleOrder.getCustomerId());
		saleReturnOrder.setPay(saleOrder.getPay());
		saleReturnOrder.setReturnDate(new Date());
		saleReturnOrder.setTotal(saleOrder.getTotal());
		SaleReturnOrder saleReturnOrder2 = saleReturnOrderResipotory.save(saleReturnOrder);
		SaleReturnItem saleReturnItem;
		for(SaleItem saleitem:saleItem){
			saleReturnItem = new SaleReturnItem();
			saleReturnItem.setCount(saleitem.getCount());
			saleReturnItem.setGoodsName(saleitem.getName());
			saleReturnItem.setPrice(saleitem.getPrice());
			saleReturnItem.setSaleReturnOrderId(saleReturnOrder2.getId());
			list.add(saleReturnItem);
		}
		
		return saleReturnItemResipotory.save(list);
	}
	@Override
	public List<SaleReturnOrder> findReturnOrderByPage(int i) throws ServiceException {
		Pageable pageable = new PageRequest(i,10);
		List<SaleReturnOrder> lists = new ArrayList<SaleReturnOrder>();
		Page<SaleReturnOrder> page = saleReturnOrderResipotory.findAll(pageable);
		for(SaleReturnOrder p:page){
			lists.add(p);
		}
		return lists;
	}
	@Override
	public Long findReturnOrderCount() throws ServiceException {
		
		return saleReturnOrderResipotory.count();
	}
	@Override
	public Long getTotalPage() throws ServiceException {
		Long count = findReturnOrderCount();
		Long totalPage;
		if(count%10==0){
			totalPage = count/10;
		}else{
			totalPage = count/10 +1;
		}
		return totalPage;
	}

}
