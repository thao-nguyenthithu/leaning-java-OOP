package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCUtil;


public class TestJDBCUtil {
	public static void main(String[] args) throws SQLException {
		
		try {
			//Bước 1: tạo kết nối
			Connection connection = JDBCUtil.getConnection(); 
			JDBCUtil.printInfo(connection);

			
			//Bước 2: Tạo ra đối tượng statement ( co 3 doi tuong )
			Statement st = connection.createStatement();
			
			
			//Bước 3: Thực thi 1 câu lệnh SQL
			String sql ="";
			st.executeUpdate(sql);
			
			
			//Bước 4: Xử lý kết quả
			int check = st.executeUpdate(sql);
			if(check > 0) {
				System.out.println("Them du lieu thanh cong!");
			}else {
				System.out.println("Them du lieu that bai!");
			}
			
			
			//Bước 5: Ngắt kết nối
			JDBCUtil.closeConnection(connection);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
