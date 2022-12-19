package src.service.imp;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import src.bean.Customer;
import src.bean.Goods;
import src.bean.Suppliers;
import src.dao.CustomerRepository;
import src.dao.GoodsRepository;
import src.dao.SaleItemRepository;
import src.dao.SaleOrderRepository;
import src.dao.SuppliersRepository;
import src.exception.ServiceException;
import src.service.QueryService;

@Service
public class QueryServiceImp implements QueryService{

	@Resource
	private GoodsRepository goodsRepository;
	@Resource
	private CustomerRepository customerRepository;
	@Resource
	private SuppliersRepository suppliersRepository;
	@Resource
	private SaleItemRepository saleItemRepository;
	@Resource
	private SaleOrderRepository saleOrderRepository;
	@Override
	public Goods findGoodsByName(String name) throws ServiceException {
		
		return goodsRepository.findGoodsByName(name);
	}
	@Override
	public Customer findCustomerByName(String name) throws ServiceException {
		
		return customerRepository.findCustomerByName(name);
	}
	@Override
	public Suppliers findSuppliersByName(String name) throws ServiceException {
		
		return suppliersRepository.findSuppliersByName(name);
	}
	@Override
	public Long findGoodsOrderByTimeAndName(String min, String max, String orderName) throws ServiceException {
		List<Long> list = saleOrderRepository.fingOrderIdByTime(min,max);
		Long counts = 0L;
		if(list.size()>0){
			List<BigInteger > countList = saleItemRepository.findCountByName(orderName,list);
			for(BigInteger l:countList){
				counts+=(l.longValue());
			}
		}
		return counts;
	}
	@Override
	public Map<String, Long> findAllOrderCount(String min, String max) throws ServiceException {
		List<Long> list = saleOrderRepository.fingOrderIdByTime(min,max);
		List<String> nameList = saleItemRepository.findAllName();
		Map<String,Long> map = new HashMap<String,Long>();
		if(list.size()>0){
			for(String s:nameList){
				Long counts = 0L;
				List<BigInteger > countList = saleItemRepository.findCountByName(s,list);
				for(BigInteger l:countList){
					counts+=(l.longValue());
				}
				map.put(s, counts);
			}
		}
		return map;
	}

}
