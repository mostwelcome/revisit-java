package com.psl.demo;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	static java.sql.Connection con=null;
	public static java.sql.Connection getConnection() throws ClassNotFoundException, SQLException {
		
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");	
		return con;
	}
}
