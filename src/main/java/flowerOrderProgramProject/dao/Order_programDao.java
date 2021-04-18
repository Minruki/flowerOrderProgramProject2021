package flowerOrderProgramProject.dao;

import java.util.List;

import flowerOrderProgramProject.dto.Order_program;

public interface Order_programDao {
	List<Order_program> selectorder_programByAll();
	Order_program selectorder_programByNo(Order_program order_program);
	
	int insertorder_program(Order_program order_program);
	int updateorder_program(Order_program order_program);
	int deleteorder_program(Order_program order_program); 

	
	
}
