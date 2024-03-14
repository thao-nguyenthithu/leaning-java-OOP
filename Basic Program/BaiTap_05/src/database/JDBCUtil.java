package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.DatabaseMetaData;

public class JDBCUtil {
    public static Connection getConnection() throws SQLException{
        Connection c = null;

        try {
        	// Đăng kí MýQL Driver với DriverManager
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           
            // Cac thong so
            String url = "jdbc:mySQL://localhost:3306/nhasach";
            String username = "root";
            String password = "";

            //Tao ket noi
            c = DriverManager.getConnection(url, username, password);
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;
    }

    public static void closeConnection(Connection c){
    	try {
			if(c != null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

    }
    
    public static void printInfo(Connection c) {
    	try {
			if(c != null) {
				DatabaseMetaData mtdt = (DatabaseMetaData) c.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
