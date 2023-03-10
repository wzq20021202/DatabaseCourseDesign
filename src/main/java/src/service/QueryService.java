package src.service;

import java.util.Map;

import src.bean.Customer;
import src.bean.Goods;
import src.bean.Suppliers;
import src.exception.ServiceException;

public interface QueryService {

	public Goods findGoodsByName(String name)throws ServiceException;

	public Customer findCustomerByName(String name)throws ServiceException;

	public Suppliers findSuppliersByName(String name)throws ServiceException;

	public Long findGoodsOrderByTimeAndName(String min, String max, String orderName)throws ServiceException;

	public Map<String, Long> findAllOrderCount(String min, String max)throws ServiceException;


}
