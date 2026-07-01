package com.jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Movie {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root","root");
			
			PreparedStatement ps=con.prepareStatement("insert into Movie values(1,'Mirchi','Prabhas','Anuskha'),(2,'Darling','Prabhas','Kajal'),(3,'Radheshyam','Prabhas','Pooja')");
			
			int s=ps.executeUpdate();
			if(s>0) {
				System.out.println(s + " rows affected");
			}else {
				System.out.println("No rows affected");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
