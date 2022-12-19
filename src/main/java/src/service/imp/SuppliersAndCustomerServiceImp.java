package src.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import src.bean.Customer;
import src.bean.Employee;
import src.bean.Suppliers;
import src.dao.CustomerRepository;
import src.dao.EmployeeRepository;
import src.dao.SuppliersRepository;
import src.exception.ServiceException;
import src.service.SuppliersAndCustomerService;

@Service
public class SuppliersAndCustomerServiceImp implements SuppliersAndCustomerService{
	
	@Resource
	private SuppliersRepository suppliersRepository;
	@Resource
	private CustomerRepository customerRepository;
	@Resource
	private EmployeeRepository employeeRepository;

	@Override
	public int saveSuppliers(Suppliers suppliers) throws ServiceException {
		suppliersRepository.save(suppliers);
		return 1;
	}


	@Override
	public List<Suppliers> findSuppliersByPage(int i) throws ServiceException {
		Pageable pageable = new PageRequest(i,10); 
		Page<Suppliers> page = suppliersRepository.findAll(pageable);
		List<Suppliers> list = new ArrayList<Suppliers>();
		for(Suppliers s:page){
			list.add(s);
		}
		return list;
	}


	@Override
	public Long findSuppliersCount() throws ServiceException {
		
		return suppliersRepository.count();
	}


	@Override
	public Long getTotalPage() throws ServiceException {
		Long count = findSuppliersCount();
		Long totalPage;
		if(count%10==0){
			totalPage = count/10;
		}else{
			totalPage = count/10 +1;
		}
		return totalPage;
	
	}


	@Override
	public int delSuppliersById(Long id) throws ServiceException {
		suppliersRepository.delete(id);
		return 1;
	}


	@Override
	public List<Customer> findCustomerByPage(int i) throws ServiceException {
		Pageable pageable = new PageRequest(i,10); 
		Page<Customer> page = customerRepository.findAll(pageable);
		List<Customer> list = new ArrayList<Customer>();
		for(Customer s:page){
			list.add(s);
		}
		return list;
	}


	@Override
	public Long findCustomerCount() throws ServiceException {
		
		return customerRepository.count();
	}


	@Override
	public Long getCustomerTotalPage() throws ServiceException {
		Long count = findCustomerCount();
		Long totalPage;
		if(count%10==0){
			totalPage = count/10;
		}else{
			totalPage = count/10 +1;
		}
		return totalPage;
	
	}


	@Override
	public int saveCustomer(Customer customer) throws ServiceException {
		customerRepository.save(customer);
		return 1;
	}


	@Override
	public int delCustomerById(Long id) throws ServiceException {
		customerRepository.delete(id);
		return 0;
	}


	@Override
	public List<Employee> findEmplyeeByPage(int i) throws ServiceException {
		Pageable pageable = new PageRequest(i,10); 
		Page<Employee> page = employeeRepository.findAll(pageable);
		List<Employee> list = new ArrayList<Employee>();
		for(Employee s:page){
			list.add(s);
		}
		return list;
	}


	@Override
	public Long findEmployeeCount() throws ServiceException {
		
		return employeeRepository.count();
	}


	@Override
	public Long getEmployeeTotalPage() throws ServiceException {
		Long count = findEmployeeCount();
		Long totalPage;
		if(count%10==0){
			totalPage = count/10;
		}else{
			totalPage = count/10 +1;
		}
		return totalPage;
	}


	@Override
	public int delEmployeeById(Long id) throws ServiceException {
		employeeRepository.delete(id);
		return 1;
	}

}
