package src.service;

import src.bean.Goods;
import src.exception.ServiceException;

import java.util.List;

public interface SystemService {

	public List<Goods> findGoodsByPage(int i)throws ServiceException;

	public Long findGoodsCount()throws ServiceException;

	public Long getTotalPage()throws ServiceException;


}
