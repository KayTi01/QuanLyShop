package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public Connection getConnection() throws SQLException{
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSHOP";
			String user = "sa";
			String password = "sapassword";
			return DriverManager.getConnection(url, user, password);	
	}
}
