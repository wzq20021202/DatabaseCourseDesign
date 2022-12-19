package src.service;

import src.bean.SaleItem;
import src.bean.SaleOrder;
import src.bean.SaleReturnItem;
import src.bean.SaleReturnOrder;
import src.exception.ServiceException;

import java.util.List;

public interface SaleReturnService {

	public List<SaleReturnItem> addSaleReturnOrder(SaleOrder saleOrder, List<SaleItem> saleItem)throws ServiceException;

	public List<SaleReturnOrder> findReturnOrderByPage(int i)throws ServiceException;

	public Long findReturnOrderCount()throws ServiceException;

	public Long getTotalPage()throws ServiceException;

}
