package flowerOrderProgramProject.service;

import java.util.List;

import flowerOrderProgramProject.dao.Flower_informationDao;
import flowerOrderProgramProject.dao.Order_programDao;
import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.dto.Order_program;
import flowerOrderProgramProject.impl.Flower_informationDaoImpl;
import flowerOrderProgramProject.impl.Order_programDaoImpl;

public class Flower_informationService {
	private Flower_informationDao dao = Flower_informationDaoImpl.getInstance();
	private Order_programDao orDao = Order_programDaoImpl.getInstance();
	
	public List<Flower_information> showFList(){
		return dao.selectflower_informationByAll();
		
	}
	
	public List<Order_program> showOList(){
		return orDao.selectorder_programByAll();
	}
	
	public void addFlower_information(Flower_information fInformation) {
		dao.insertflower_information(fInformation);
	}
	
	public void removeFlower_information(Flower_information fInformation) {
		dao.deleteflower_information(fInformation);
	}
	
	public void modifyFlower_information(Flower_information fInformation) {
		dao.updateflower_information(fInformation);
	}

	public Flower_information showFlowerPriceByCode(Flower_information fInformation) {
		return dao.selectFlower_informationByCode(fInformation);
	}
	
}
