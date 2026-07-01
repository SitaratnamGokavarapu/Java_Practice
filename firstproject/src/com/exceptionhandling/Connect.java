package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step1:Loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded Succesfully");
		//step2:Establish the connection
		//Attempts to establish the connectionto the given DB url.			
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		System.out.println("Connection Established");
		//step3:Create statement object
		//Creates a statement object to send your data to your DB.		
		Statement st=con.createStatement();
		System.out.println("Statement created");
		
//		//step4:create result set
//		ResultSet rs=st.executeQuery("select * from employee");
//		//Moves the Cursor forward one row from its current position
//		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getString(3));
//			System.out.println(rs.getDouble(4));
//			System.out.println(rs.getString(5));
//			System.out.println("------------------------");
//
//		}
		st.executeUpdate("update employee set job='Non-IT' where empno=2");
		System.out.println("Updated Successfully");
		
		//step5:close connection
		con.close();
	}

}
