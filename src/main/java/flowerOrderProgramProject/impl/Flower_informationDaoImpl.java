package flowerOrderProgramProject.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import flowerOrderProgramProject.dao.Flower_informationDao;
import flowerOrderProgramProject.dto.Flower_information;
import flowerOrderProgramProject.util.JdbcUtil;

public class Flower_informationDaoImpl implements Flower_informationDao {

	private static Flower_informationDaoImpl instance = new Flower_informationDaoImpl();

	public static Flower_informationDaoImpl getInstance() {
		if (instance == null) {
			instance = new Flower_informationDaoImpl();
		}
		return instance;
	}
	 
	private Flower_informationDaoImpl() {}

	@Override
	public List<Flower_information> selectflower_informationByAll() {
		String sql = "select flower_code, flower_name, flower_price from flower_information";
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			if (rs.next()) {
				List<Flower_information> list = new ArrayList<>();
				do {
					list.add(getflower_information(rs));
				} while (rs.next());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Flower_information getflower_information(ResultSet rs) {
		String flower_code = null;
		String flower_name = null;
		int flower_price = 0;
		try {
			flower_code = rs.getString("flower_code");
		} catch (SQLException e) {}
		try {
			flower_name = rs.getString("flower_name");
		} catch (SQLException e) {}
		try {
			flower_price = rs.getInt("flower_price");
		} catch (SQLException e) {}
		
		return new Flower_information(flower_code, flower_name, flower_price);
	}

	@Override 
	public Flower_information selectflower_informationByNo(Flower_information flower_information) {
		String sql = "select flower_code, flower_name, flower_price from flower_information where flower_code =?";
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, flower_information.getFlower_code());
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return getflower_information(rs);
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int insertflower_information(Flower_information flower_information) {
		String sql = "insert into flower_information values(?, ?, ?)";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, flower_information.getFlower_code());
			pstmt.setString(2, flower_information.getFlower_name());
			pstmt.setInt(3, flower_information.getFlower_price());
			return pstmt.executeUpdate();
		
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateflower_information(Flower_information flower_information) {
		String sql = "update flower_information set flower_name = ?, flower_price = ? where flower_code = ?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1, flower_information.getFlower_name());
			pstmt.setInt(2, flower_information.getFlower_price());
			pstmt.setString(3, flower_information.getFlower_code());
			
			System.out.println(pstmt);
			return pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public int deleteflower_information(Flower_information flower_information) {
		String sql = "delete from flower_information where flower_code = ?";
		try (Connection con = JdbcUtil.getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, flower_information.getFlower_code());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Flower_information selectFlower_informationByCode(Flower_information flower_information) {
		String sql = "select flower_price from flower_information where flower_code = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, flower_information.getFlower_code());
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getflower_information(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	
	}

	@Override
	public int updateFlower_Detail_Information(Flower_information flower_information) {
		String sql = "update flower_information set flower_name = ?, flower_price = ? where flower_code = ?";
		try(Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, flower_information.getFlower_name());
			pstmt.setInt(2, flower_information.getFlower_price());
			pstmt.setString(3, flower_information.getFlower_code());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	
	
}
