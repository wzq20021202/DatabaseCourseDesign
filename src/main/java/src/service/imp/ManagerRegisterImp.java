package src.service.imp;

import org.springframework.stereotype.Service;
import src.bean.Managers;
import src.dao.ManagerRepository;
import src.service.ManagerRegisterService;

import javax.annotation.Resource;



@Service
public class ManagerRegisterImp implements ManagerRegisterService{

	@Resource
	private ManagerRepository managerRepository;
	@Override
	public int Register(Managers manager) {
		managerRepository.save(manager);
		return 0;
	}

}
