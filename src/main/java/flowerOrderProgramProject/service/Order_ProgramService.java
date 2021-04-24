package flowerOrderProgramProject.service;

import java.util.List;

import flowerOrderProgramProject.dao.Customer_informationDao;
import flowerOrderProgramProject.dao.Flower_informationDao;
import flowerOrderProgramProject.dao.Order_programDao;
import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.dto.Order_program;
import flowerOrderProgramProject.impl.Customer_informationDaoImpl;
import flowerOrderProgramProject.impl.Flower_informationDaoImpl;
import flowerOrderProgramProject.impl.Order_programDaoImpl;

public class Order_ProgramService {
	private Flower_informationDao flDao = Flower_informationDaoImpl.getInstance();
	private Customer_informationDao cusDao = Customer_informationDaoImpl.getInstance();
	private Order_programDao ordDao = Order_programDaoImpl.getInstance();
	
	public List<Flower_information> showfList(Flower_information fInformation){
		return flDao.selectflower_informationByAll();
	}
	
	public List<Customer_information> showCList(Customer_information cInformation){
		return cusDao.selectcustomer_informationByAll();
		
	}
	 
	public List<Order_program> showOList(Order_program oProgram){
		return ordDao.selectorder_programByAll();
	}
	
	public void removeOrder_program(Order_program oProgram) {
		ordDao.deleteorder_program(oProgram);
	}
	
	public void modifyOrder_program(Order_program oProgram) {
		ordDao.updateorder_program(oProgram);
	}
	
	public void addOrder_program(Order_program oProgram) {
		ordDao.insertorder_program(oProgram);
	} 
	public Order_program showByOno(Order_program oProgram){
		return ordDao.selectorder_programByOno(oProgram);
	}
}
