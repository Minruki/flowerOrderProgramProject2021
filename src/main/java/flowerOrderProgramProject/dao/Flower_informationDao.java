package flowerOrderProgramProject.dao;

import java.util.List;

import flowerOrderProgramProject.dto.Flower_information;

public interface Flower_informationDao {
	List<Flower_information> selectflower_informationByAll();
	Flower_information selectflower_informationByNo(Flower_information flower_information);
	
	int insertflower_information(Flower_information flower_information);
	int updateflower_information(Flower_information flower_information);
	int deleteflower_information(Flower_information flower_information);

	
	Flower_information selectFlower_informationByCode(Flower_information flower_information);
	int updateFlower_Detail_Information(Flower_information flower_information);
}
