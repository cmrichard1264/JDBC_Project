package JDBC_Practice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import Utility.utility;

public class ResultSet_Map {
	
	public static void main(String[] args) throws SQLException{
		
		ResultSet result = utility.getResult("select * from employees");
		Map<String, Integer> employeeInfo = new LinkedHashMap<>();
		
			while(result.next()) {
				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				String fullName = firstName+" "+lastName;
				Integer salary = result.getInt("salary");
				
				employeeInfo.put(fullName, salary);
			}
				
				System.out.println(employeeInfo);
				System.out.println(employeeInfo.get("Steven King")==24000);
				
				
				
				
		
		
		
	}

}
