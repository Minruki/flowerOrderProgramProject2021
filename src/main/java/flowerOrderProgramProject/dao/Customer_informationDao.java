package flowerOrderProgramProject.dao;

import java.util.List;

import flowerOrderProgramProject.dto.Customer_information;

public interface Customer_informationDao {
	List<Customer_information> selectcustomer_informationByAll();
	Customer_information selectcustomer_informationByNo(Customer_information customer_information);
	
	int insertcustomer_information(Customer_information customer_information);
	int updatecustomer_information(Customer_information customer_information);
	int deletecustomer_information(Customer_information customer_information);
	
	////회원 수정용
	int updatecustomer_Detail_Information(Customer_information customer_information);

}
