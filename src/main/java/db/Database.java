package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	public static Connection openConnection() {
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DB_Ontap2", "sa", "1234$");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return con;
	}
	
	public static void main(String[] args) {
		System.out.println(openConnection());
	}
}
