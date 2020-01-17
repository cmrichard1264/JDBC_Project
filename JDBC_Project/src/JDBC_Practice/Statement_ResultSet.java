package JDBC_Practice;

import java.sql.*;



public class Statement_ResultSet {
	
	public static void main(String[] args) throws Exception{
		String userName ="hr";
		String passWord = "hr";
		
		// jdbc:DataBaseType:thin:@Host:port:SID
		String url = "jdbc:oracle:thin:@3.80.207.2:1521:xe";
		
		//Connection step
		Connection connection = DriverManager.getConnection(url, userName, passWord);
		System.out.println("Connection completed!");
		
		//Statement:
		Statement statement = connection.createStatement();
		
	    System.out.println("Statement is created!");
		
		//Result Set:
		ResultSet result = statement.executeQuery("Select * from employees");
		System.out.println("Result set is completed!");
		
		String update = "Update developers set names = 'Madina' where names = 'Suna'";
		statement.executeUpdate(update);
		
		
		
	}

}
