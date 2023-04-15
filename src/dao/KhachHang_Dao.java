
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import connectDB.ConnectDB;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.KhachHang;

import java.sql.PreparedStatement;
/**
 *
 * @author My PC
 * @param <T>
 */
public class KhachHang_Dao implements DAOInterface<KhachHang>{
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<KhachHang> getAllKhachHang(){
		String sql = "Select * from KhachHang";
		try {
			List<KhachHang> dsKhachHang = new ArrayList<>();
			con = new ConnectDB().getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				dsKhachHang.add(new KhachHang(
						rs.getString("maKH"),
						rs.getString("tenKH"),
						rs.getString("diaChi"),
						rs.getString("soDT")));
			}
			return dsKhachHang;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static KhachHang_Dao getInstance() {
		return new KhachHang_Dao();
	}

	@Override
	public void them(KhachHang t) {
		try {
			con = new ConnectDB().getConnection();
			ps = con.prepareStatement("insert into KhacHang  value(?, ?, ?, ?)");
			ps.setString(1, t.getMaKH());
			ps.setString(2, t.getTenKH());
			ps.setString(3, t.getDiaChi());
			ps.setString(4, t.getSoDT());
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}

	@Override
	public void xoa(KhachHang t) {
		String sql = "de";
	}

	@Override
	public void sua(KhachHang t) {
		
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KhachHang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
