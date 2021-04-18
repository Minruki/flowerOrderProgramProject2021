package flowerOrderProgramProject.service;

import java.util.List;

import flowerOrderProgramProject.dao.Customer_informationDao;
import flowerOrderProgramProject.dao.Flower_informationDao;
import flowerOrderProgramProject.dao.Membership_discountDao;
import flowerOrderProgramProject.dao.Order_programDao;
import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.dto.Membership_discount;
import flowerOrderProgramProject.dto.Order_program;
import flowerOrderProgramProject.impl.Customer_informationDaoImpl;
import flowerOrderProgramProject.impl.Flower_informationDaoImpl;
import flowerOrderProgramProject.impl.Membership_discountDaoImpl;
import flowerOrderProgramProject.impl.Order_programDaoImpl;

public class Customer_informationService {
	private Order_programDao ordDao = Order_programDaoImpl.getInstance();
	private Membership_discountDao memDao = Membership_discountDaoImpl.getInstance();
	private Customer_informationDao cusDao = Customer_informationDaoImpl.getInstance();
	private Flower_informationDao floDao = Flower_informationDaoImpl.getInstance();
	
	public List<Order_program> showOList(){
		return ordDao.selectorder_programByAll();
	}
	
	public List<Membership_discount> showmemList(){
		return memDao.selectmembership_discountByAll();
	}
	
	public List<Customer_information> showCList(){
		return cusDao.selectcustomer_informationByAll();
	}

	public List<Flower_information> showFList() {
		return floDao.selectflower_informationByAll();
	
	}
	
	public void addCustomer_information(Customer_information cInformation) {
		cusDao.insertcustomer_information(cInformation);
		
	}
	
	public void removeCustomer_information(Customer_information cInformation) {
		cusDao.deletecustomer_information(cInformation);
		
	}
	
	public void cumulativeCustomer_information(Customer_information cInformation) {
		cusDao.updatecustomer_information(cInformation);
	}


}
