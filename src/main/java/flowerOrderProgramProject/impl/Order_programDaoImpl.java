package flowerOrderProgramProject.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import flowerOrderProgramProject.dao.Order_programDao;
import flowerOrderProgramProject.dto.Customer_information;
import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.dto.Order_program;
import flowerOrderProgramProject.util.JdbcUtil;

public class Order_programDaoImpl implements Order_programDao {
	private static final Order_programDaoImpl instance = new Order_programDaoImpl();
	
	public static Order_programDaoImpl getInstance() {
		return instance;
	}
	private Order_programDaoImpl() {
		 
	} 
	 
	 
	@Override
	public List<Order_program> selectorder_programByAll() {
		String sql = "select ono, order_number, order_date, id, flower_code, order_count, choice, sale_price from order_program";
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			if (rs.next()) {
				List<Order_program> list = new ArrayList<>();
				do {
					list.add(getorder_program(rs));
				} while(rs.next());
				System.out.println(list.size());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Order_program getorder_program(ResultSet rs) throws SQLException {
		int ono = rs.getInt("ono");
		String order_number = rs.getString("order_number");
		Date order_date = rs.getDate("order_date");
		String id = rs.getString("id");
		Flower_information flower_code = new Flower_information(rs.getString("flower_code"));
		int order_count = rs.getInt("order_count");
		String choice = rs.getString("choice");
		int sale_price = rs.getInt("sale_price");
		
		return new Order_program(ono, order_number, order_date, new Customer_information(id), flower_code, order_count, choice, sale_price);
	}
	
	@Override
	public Order_program selectorder_programByNo(Order_program order_program) {
		String sql = "select ono, order_number, order_date, id, flower_code, order_count, choice, sale_price from order_program ord where id = ?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, order_program.getId().getId());

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return getorder_program(rs);
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertorder_program(Order_program order_program) {
		String sql = "insert into order_program values(null, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, order_program.getOrder_number());
			pstmt.setTimestamp(2, new Timestamp(order_program.getOrder_date().getTime()));
			pstmt.setString(3, order_program.getId().getId());
			pstmt.setString(4, order_program.getFlower_code().getFlower_code());
			pstmt.setInt(5, order_program.getOrder_count());
			pstmt.setString(6, order_program.getChoice());
			pstmt.setInt(7, order_program.getSale_price());
			
			return pstmt.executeUpdate();
 
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}


	
	
	
	@Override
	public int updateorder_program(Order_program order_program) {
		String sql = "update order_program set order_number = ?, order_date = ?, flower_code = ?, order_count = ?, choice = ?, sale_price = ? where id = ?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
		
		pstmt.setString(1, order_program.getOrder_number());
		pstmt.setTimestamp(2, new Timestamp(order_program.getOrder_date().getTime()));
		pstmt.setString(3, order_program.getFlower_code().getFlower_code());
		pstmt.setInt(4, order_program.getOrder_count());
		pstmt.setString(5, order_program.getChoice());
		pstmt.setInt(6, order_program.getSale_price());
		pstmt.setString(7, order_program.getId().getId());
		System.out.println(pstmt);
		return pstmt.executeUpdate();

	} catch (SQLException e) {

		e.printStackTrace();
	}

		return 0;
	}

	@Override
	public int deleteorder_program(Order_program order_program) {
		String sql = "delete from order_program where id = ?";
		try (Connection con = JdbcUtil.getConnection(); 
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, order_program.getId().getId());
			System.out.println(order_program.getId());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
}
