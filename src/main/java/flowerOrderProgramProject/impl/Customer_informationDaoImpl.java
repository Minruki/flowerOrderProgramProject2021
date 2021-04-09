package flowerOrderProgramProject.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import flowerOrderProgramProject.dao.Customer_informationDao;
import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.util.JdbcUtil;

public class Customer_informationDaoImpl implements Customer_informationDao {
	private static final Customer_informationDaoImpl instance = new Customer_informationDaoImpl();

	public static Customer_informationDaoImpl getInstance() {
		return instance;
	}

	private Customer_informationDaoImpl() {

	}

	@Override
	public List<Customer_information> selectcustomer_informationByAll() {
		String sql = "select id, member_name, phone_number, cumulative_amount, membership_title from customer_information";
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			if (rs.next()) {
				List<Customer_information> list = new ArrayList<>();
				do {
					list.add(getcustomer_information(rs));
				} while (rs.next());
				System.out.println(list.size());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private Customer_information getcustomer_information(ResultSet rs) throws SQLException {
		int cumulative_amount = 0;
		String membership_title = null;
		
		String id = rs.getString("id");
		String member_name = rs.getString("member_name");
		String phone_number = rs.getString("phone_number");
		try {
			cumulative_amount = rs.getInt("cumulative_amount");
		}catch(SQLException e) {}
		try {
			membership_title = rs.getString("membership_title");
		}catch(SQLException e) {}
		

		return new Customer_information(id, member_name, phone_number, cumulative_amount, membership_title);
	}

	@Override
	public Customer_information selectcustomer_informationByNo(Customer_information customer_information) {
		String sql = "select id, member_name, phone_number from customer_information cus where id = ?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, customer_information.getId());
			
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return getcustomer_information(rs);
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int insertcustomer_information(Customer_information customer_information) {
		String sql = "insert into customer_information values(?, ?, ?, ?, ?)";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, customer_information.getId());
			pstmt.setString(2, customer_information.getMember_name());
			pstmt.setString(3, customer_information.getPhone_number());
			pstmt.setInt(4, customer_information.getCumulative_amount());
			pstmt.setString(5, customer_information.getMembership_title());
			return pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updatecustomer_information(Customer_information customer_information) {
		String sql = "update customer_information set member_name = ?, phone_number = ?, cumulative_amount = ?, membership_title =? where id = ? ";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			
			pstmt.setString(1, customer_information.getMember_name());
			pstmt.setString(2, customer_information.getPhone_number());
			pstmt.setInt(3, customer_information.getCumulative_amount());
			pstmt.setString(4, customer_information.getMembership_title());
			pstmt.setString(5, customer_information.getId());
			
			System.out.println(pstmt);
			return pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public int deletecustomer_information(Customer_information customer_information) {
		String sql = "delete from customer_information where id = ?";
		try (Connection con = JdbcUtil.getConnection(); 
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, customer_information.getId());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}


}
