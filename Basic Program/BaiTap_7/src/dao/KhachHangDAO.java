package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.KhachHang;
import model.Sach;

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
		ArrayList<KhachHang> ketQua = new ArrayList<KhachHang>();
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection(); 
			
			// Bước 2: tạo đối tượng statement
			Statement st = con.createStatement(); 
			
			//B3: thực thi câu lệnh SQL; 
			String sql = "SELECT * FROM khachhang ";
			
			System.out.println(sql);		
			
			ResultSet rs = st.executeQuery(sql);
			
			//Buoc 4: 
			while(rs.next()) {
				int id = rs.getInt("id"); 
				String hoVaTen = rs.getString("hoVaTen"); 
				Date ngaySinh = rs.getDate("ngaySinh"); 
				String diaChi = rs.getString("diaChi");
				
				KhachHang kh = new KhachHang(id, hoVaTen, ngaySinh, diaChi);
				ketQua.add(kh);
			}
			
			//Buoc 5: 
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
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
