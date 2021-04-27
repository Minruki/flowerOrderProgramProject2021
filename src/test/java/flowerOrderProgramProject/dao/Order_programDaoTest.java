package flowerOrderProgramProject.dao;


import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.dto.Order_program;
import flowerOrderProgramProject.impl.Order_programDaoImpl;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Order_programDaoTest {
	private static Order_programDao dao = Order_programDaoImpl.getInstance();
	
	@After
	public void tearDown() throws Exception {
	}
 
	@Test
	public void test04Selectorder_programByAll() {
		System.out.printf("%s()%n", "testSelectorder_programByAll");
		List<Order_program> order_programList = dao.selectorder_programByAll();
		Assert.assertNotNull(order_programList);
		for (Order_program O : order_programList) {
		System.out.println(O); 
		} 
	}
	@Test
	public void test05Selectorder_programByNo() {
		System.out.printf("%s()%n", "testSelectorder_programByNo");
		Order_program order = new Order_program(new Customer_information("lys6009"));
		
		Order_program searchorder_program = dao.selectorder_programByNo(order);
		Assert.assertNotNull(searchorder_program);
		System.out.println(searchorder_program);
	}

	@Test
	public void test01Insertorder_program() {
		System.out.printf("%s()%n", "testInsertorder_program");
		Date d = new Date(121, 2, 29);
		
		// 년도-1900
		// 월 -1
		// 일 >> 그대로 들어가도 됨
		
		Order_program neworder_program = new Order_program(0, "00/210421", d ,new Customer_information("ABCDE"), new Flower_information("A002"), 2, "꽃바구니", 0);
		int res = dao.insertorder_program(neworder_program);
		Assert.assertEquals(1, res);
		System.out.println(dao.selectorder_programByNo(neworder_program));
	}

	@Test
	public void test02Updateorder_program() {
		System.out.printf("%s()%n", "test02Updatemembership_discount");
		Date d = new Date(121, 2, 29);
		
		
		Order_program neworder_program = new Order_program(0, "02/210423", d ,new Customer_information("ABCDE"), new Flower_information("A002"), 3, "꽃다발", 0);
		int res = dao.updateorder_program(neworder_program);
		Assert.assertEquals(1, res);
		System.out.println(dao.selectorder_programByNo(neworder_program));
	}

	@Test
	public void test03Deleteorder_programByNo() {
		System.out.printf("%s()%n", "test03Deletemembership_discount");
		Order_program Deleteorder_program = new Order_program(new Customer_information("ABCDE"));
		System.out.println(Deleteorder_program);
		int res = dao.deleteorder_program(Deleteorder_program);
		Assert.assertEquals(1, res);
	
	}

}
