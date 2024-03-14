package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.KhachHang;

public class KhachHangDAO implements DAOInterface<KhachHang> {

	public static KhachHangDAO getInstance() {
		return new KhachHangDAO();
	}
	
	@Override
	public int insert(KhachHang t) {
		int ketQua = 0; 
		try {
			Connection con = JDBCUtil.getConnection(); 
			
			Statement st = con.createStatement(); 
			 
			String sql = "INSERT INTO khachhang(id, hoVaTen, ngaySinh, diaChi)" 
					+ " VALUES (" + t.getId() + " , '" + t.getHoVaTen() + "' ,  "  + t.getNgaySinh() + " , '" + t.getDiaChi() + "')";
			
			System.out.println(sql);
			ketQua = st.executeUpdate(sql);
			
			System.out.println("Ban dan thuc thi: " + sql);
			System.out.println("Co " + ketQua + " dong bi thay doi");
			
			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int update(KhachHang t) {
		int ketQua = 0; 
		try {
			Connection con = JDBCUtil.getConnection(); 
			
			Statement st = con.createStatement(); 
			 
			String sql = "UPDATE khachhang " + 
					" SET " + 
					" hoVaTen = '" + t.getHoVaTen() + "'" + 
					", ngaySinh =" + t.getNgaySinh() + 
					", diaChi = '" + t.getDiaChi() + "'" +
					" WHERE id = " + t.getId() ;
		
			System.out.println(sql);
			ketQua = st.executeUpdate(sql);
			
			System.out.println("Ban dan thuc thi: " + sql);
			System.out.println("Co " + ketQua + " dong bi thay doi");
			
			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int delete(KhachHang t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection(); 
			
			// Bước 2: tạo đối tượng statement
			Statement st = con.createStatement(); 
			
			//B3: thực thi câu lệnh SQL; 
			
			String sql = "DELETE from khachhang " + 
						" WHERE id = " + t.getId();
			System.out.println(sql);			
						
			
			ketQua = st.executeUpdate(sql);// so luong dong bi thay doi 
			
			//Buoc 4: 
			System.out.println("Ban dan thuc thi: " + sql);
			System.out.println("Co " + ketQua + " dong bi thay doi");
			
			//Buoc 5: 
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
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
