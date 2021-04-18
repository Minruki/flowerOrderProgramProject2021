package flowerOrderProgramProject.dao;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.dto.Membership_discount;
import flowerOrderProgramProject.impl.Customer_informationDaoImpl;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Customer_informationDaoTest {
	private static Customer_informationDao dao = Customer_informationDaoImpl.getInstance();

	

	@After
	public void tearDown() throws Exception {
		System.out.println(); 
	}

//	@Test
	public void test04Selectcustomer_informationByAll() {
		System.out.printf("%s()%n", "testSelectTitleByAll");
		List<Customer_information> customer_informationList = dao.selectcustomer_informationByAll();
		Assert.assertNotNull(customer_informationList);
		
		for(Customer_information c : customer_informationList) {
			System.out.println(c);
		}
	}

//	@Test
	public void test05Selectcustomer_informationByNo() {
		System.out.printf("%s()%n", "test05Selectcustomer_informationByNo");
//		customer_information customer_information = new customer_information("min");
		Customer_information selectedcustomer_information = dao.selectcustomer_informationByNo(new Customer_information("lys6009"));
		Assert.assertNotNull(selectedcustomer_information);
		System.out.println(selectedcustomer_information);
	
	}

//	@Test
	public void test01Insertcustomer_information() {
		System.out.printf("%s()%n", "testInsertTitle");
		Customer_information newcustomer_information = new Customer_information("test2", "가나다", "010-1231-4545", 10000, new Membership_discount("소나무"));
		int res = dao.insertcustomer_information(newcustomer_information);
		Assert.assertEquals(1, res);
		System.out.println(dao.selectcustomer_informationByNo(newcustomer_information));
	}

	@Test
	public void test02Updatecustomer_information() {
		System.out.printf("%s()%n", "testUpdatecustomer_information");
		Customer_information newcustomer_information = new Customer_information("lys6009",50000);
		int res = dao.updatecustomer_information(newcustomer_information);
		Assert.assertEquals(1, res);
		System.out.println(dao.selectcustomer_informationByNo(newcustomer_information));
	}
	
		
	

//	@Test
	public void test03Deletecustomer_information() {
		System.out.printf("%s()%n", "testDeletecustomer_information");
		Customer_information Deletecustomer_information = new Customer_information("test2");
		int res = dao.deletecustomer_information(Deletecustomer_information);
		Assert.assertEquals(1, res);
		dao.selectcustomer_informationByAll().stream().forEach(System.out::println);
	}

}
