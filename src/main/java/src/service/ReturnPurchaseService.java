package src.service;

import src.bean.PurchaseItem;
import src.bean.PurchaseOrder;
import src.bean.ReturnItem;
import src.bean.ReturnOrder;
import src.exception.ServiceException;

import java.util.List;

public interface ReturnPurchaseService {
	public List<ReturnItem> addReturnOrder(PurchaseOrder purchaseOrder,List<PurchaseItem> purchaseItem)throws ServiceException;
	public List<ReturnOrder> findAllReturnOrder()throws ServiceException;
	public List<ReturnOrder> findReturnOrderByPage(int pageNum)throws ServiceException;
	public Long findReturnOrderCount()throws ServiceException;
	public Long getTotalPage()throws ServiceException;
}
