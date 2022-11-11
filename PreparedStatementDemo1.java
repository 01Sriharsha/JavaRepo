package com.jdbc.demo;

import java.sql.*;

public class PreparedStatementDemo1 {

	public static void main(String[] args) {
		try {
String url , username , password;
			
			url = "jdbc:mysql://localhost:3307/harsha";
			username = "root";
			password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			
			String query = "insert into employee(fname , lname , id , salary , age) values(?,?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, "Akash");
			pstmt.setString(2, "S");
			pstmt.setInt(3, 109);
			pstmt.setInt(4, 150000);
			pstmt.setInt(5, 18);
			
			pstmt.executeUpdate(); 
			
			System.out.println("Data added Successfully...");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
