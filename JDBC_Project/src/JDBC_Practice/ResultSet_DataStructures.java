package JDBC_Practice;

import java.sql.*;
import java.util.ArrayList;
import Utility.utility;

public class ResultSet_DataStructures {
	
	public static void main(String[] args) throws SQLException {
		
		ResultSet result = utility.getResult("select * from employees");
		while(result.next()) {
			String firstName = result.getString("first_name");
			String lastName = result.getString("last_name");
			String fullname = firstName+" "+lastName;
			
		}
		
		ArrayList<String> fullName = utility.selectFrom("employees");
		for(String name: fullName) {
			System.out.println(name);
		}
		
		
	}

}
