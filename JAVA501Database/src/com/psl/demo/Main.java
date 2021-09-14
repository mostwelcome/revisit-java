package com.psl.demo;

import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		java.sql.Connection con = Connections.getConnection();
		System.out.println("Got connections");
	}

}
