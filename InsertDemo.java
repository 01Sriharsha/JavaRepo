package com.jdbc.demo;

import java.sql.*;

public class InsertDemo {

	public static void main(String[] args) {
		try {
			
//			String url , username , password;
//			
//			url = "jdbc:mysql://localhost:3307/harsha";
//			username = "root";
//			password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/harsha","root","root");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into employee values('bhuvan','A',106,300000,18)");
			System.out.println("Data inserted successfully ... ");
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
