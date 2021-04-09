package flowerOrderProgramProject.dao;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import flowerOrderProgramProject.dto.Membership_discount;
import flowerOrderProgramProject.impl.Membership_discountDaoImpl;

public class Membership_discountDaoTest {
	private static Membership_discountDao dao = Membership_discountDaoImpl.getInstance();

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test04Selectmembership_discountByAll() {
		System.out.printf("%s()%n", "testSelectMembership_discountByAll");
		List<Membership_discount> membership_discount = dao.selectmembership_discountByAll();
		Assert.assertNotNull(membership_discount);

		for (Membership_discount M : membership_discount) {
			System.out.println(M);
		}
	}

	@Test
	public void test05Selectmembership_discountByNo() {
		System.out.printf("%s()%n", "testSelectmembership_discountByNo");
		Membership_discount membership = new Membership_discount("꽃", "20%");
		Membership_discount searchmembership_discount = dao.selectmembership_discountByNo(membership);
		Assert.assertNotNull(searchmembership_discount);
		System.out.println(searchmembership_discount);

	}

	@Test
	public void test01Insertmembership_discount() {
		System.out.printf("%s()%n", "testInsertmembership_discount");
		Membership_discount newmembership_discount = new Membership_discount("씨앗", "2%");
		int res = dao.insertmembership_discount(newmembership_discount);
		Assert.assertEquals(1, res);
		System.out.println(dao.selectmembership_discountByNo(newmembership_discount));
	}

	@Test
	public void test02Updatemembership_discountByAll() {
		System.out.printf("%s()%n", "test02Updatemembership_discount");

		Membership_discount newmembership_discount = new Membership_discount("씨앗", "3%");

		int res = dao.updatemembership_discount(newmembership_discount);

		Assert.assertEquals(1, res);

		System.out.println(dao.selectmembership_discountByNo(newmembership_discount));

	}

	@Test
	public void test03Deletemembership_discountByNo() {
		System.out.printf("%s()%n", "test03Deletemembership_discount");
		Membership_discount Deletemembership_discount = new Membership_discount("씨앗", "3%");
		System.out.println(Deletemembership_discount);
		int res = dao.deletemembership_discount(Deletemembership_discount);
		Assert.assertEquals(1, res);
		dao.selectmembership_discountByAll().stream().forEach(System.out::println);

	}

}
