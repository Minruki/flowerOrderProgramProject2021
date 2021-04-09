package flowerOrderProgramProject.dao;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.impl.Flower_informationDaoImpl;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Flower_informationDaoTest {
	private static Flower_informationDao dao = Flower_informationDaoImpl.getInstance();

	

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}
	
	

	@Test
	public void test04Selectflower_information() {
		System.out.printf("%s()%n", "test04Selectflower_informationByAll");
		
		List<Flower_information> flower_informationList= dao.selectflower_informationByAll();
		System.out.println(01);
		Assert.assertNotNull(flower_informationList);
		
		for(Flower_information f : flower_informationList) {
			System.out.println(f);
		}
	}

	@Test
	public void test05Selectflower_informationByNo() {
		System.out.printf("%s()%n", "test05Selectflower_informationByNo");
		Flower_information flower = new Flower_information("A001");
		Flower_information selectedflower_information = dao.selectflower_informationByNo(flower);
		Assert.assertNotNull(selectedflower_information);
		System.out.println(selectedflower_information);
	}
//	public void test05SelectTitleByNo() {
//		System.out.printf("%s()%n", "testSelectTitleByNo");
//		Title title = new Title(5);
//		Title searchTitle = dao.selectTitleByNo(title);
//		Assert.assertNotNull(searchTitle);
//		System.out.println(searchTitle);
//	}

	@Test
	public void test01Insertflower_information() {
		System.out.printf("%s()%n", "test01Insertflower_information");
		Flower_information newflower_information = new Flower_information("A013", "수국", 5000);
		int res = dao.insertflower_information(newflower_information);
		Assert.assertEquals(1, res);
		System.out.println(dao.selectflower_informationByNo(newflower_information));
	}
	
	@Test
	public void test02Updateflower_informationByAll() {
		System.out.printf("%s()%n", "test02Updateflower_informationByAll");
		Flower_information newflower_information = new Flower_information("A013", "수국", 7000);
		int res = dao.updateflower_information(newflower_information);
		Assert.assertEquals(1, res);
		System.out.println(dao.selectflower_informationByNo(newflower_information));

	}

	@Test
	public void test03Deleteflower_informationByNo() {
		System.out.printf("%s()%n", "test03Deleteflower_information");
		Flower_information Deleteflower_information = new Flower_information("A013");
		System.out.println(Deleteflower_information);
		int res = dao.deleteflower_information(Deleteflower_information);
		Assert.assertEquals(1, res);
		dao.selectflower_informationByAll().stream().forEach(System.out::println);

	}

}
