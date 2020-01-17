package JDBC_Practice;

import java.sql.*;

import Utility.utility;

public class MetaData {
	
	public static void main(String[] args) throws Exception{
		
		System.out.println("User: "+utility.metadata.getUserName());
		System.out.println("Version: "+utility.metadata.getDriverMajorVersion());
		System.out.println("Data Base Type: "+utility.metadata.getDatabaseProductName());
		
        ResultSet rs = utility.getResult("select * from employees");
        
        
        ResultSetMetaData resultData = rs.getMetaData();
        
        System.out.println( resultData.getColumnCount() ); // 11  total number of columns
        System.out.println(resultData.getColumnName(5));
        
        System.out.println("====================================");
        for(int i = 1; i <= resultData.getColumnCount() ; i++ ) {
            System.out.println(resultData.getColumnName(i));
        }
		
		
	}

}
