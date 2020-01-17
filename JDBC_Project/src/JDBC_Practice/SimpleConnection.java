package JDBC_Practice;

import java.sql.*;


public class SimpleConnection {
	
	public static void main(String[] args) throws SQLException{
		String userName ="hr";
		String passWord = "hr";
		
		// jdbc:DataBaseType:thin:@Host:port:SID
		String url = "jdbc:oracle:thin:@3.80.207.2:1521:xe";
		
		Connection connection = DriverManager.getConnection(url, userName, passWord);
		
		System.out.println("Connect Successfully!");
		
	}

}
