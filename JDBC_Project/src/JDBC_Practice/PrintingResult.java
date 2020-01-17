package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintingResult {
	
	public static void main(String[] args) throws SQLException{
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
		
		
		//Printing
		while (result.next()) {
			String firstname = result.getString(2);
			String lastname = result.getString(3);
			int salary = result.getInt("salary");
			
			System.out.println(firstname+" "+lastname+"     $"+salary);
		}
		
	}

}
