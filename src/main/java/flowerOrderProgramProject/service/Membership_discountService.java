package flowerOrderProgramProject.service;

import java.util.List;

import flowerOrderProgramProject.dao.Customer_informationDao;
import flowerOrderProgramProject.dao.Membership_discountDao;
import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.dto.Membership_discount;
import flowerOrderProgramProject.impl.Customer_informationDaoImpl;
import flowerOrderProgramProject.impl.Membership_discountDaoImpl;

public class Membership_discountService {
	
	private Customer_informationDao cusDao = Customer_informationDaoImpl.getInstance();
	private Membership_discountDao memDao = Membership_discountDaoImpl.getInstance();
	
	public List<Customer_information> showCusList(){
		return cusDao.selectcustomer_informationByAll();
	}
	
	public List<Membership_discount> showMemList(){
		return memDao.selectmembership_discountByAll();
	}
	
	public void addMembership_discount(Membership_discount mDiscount) {
		memDao.insertmembership_discount(mDiscount);
		
	}
	
	public void removeMembership_discount(Membership_discount mDiscount) {
		memDao.deletemembership_discount(mDiscount);
	}
	
	public void modifyMembership_discount(Membership_discount mDiscount) {
		memDao.updatemembership_discount(mDiscount);
	}



}
