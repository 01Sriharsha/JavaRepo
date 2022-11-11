package com.jdbc.demo;

import java.sql.*;

public class SelectDemo {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/harsha", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " +rs.getInt(4) + " " + rs.getInt(5));

//				System.out.print("First Name : " + rs.getString("fname"));
//				System.out.print(", Last Name : " + rs.getString("lname"));
//				System.out.print(", ID : " + rs.getInt("id"));
//				System.out.print(", Salary : " + rs.getInt("salary"));
//				System.out.println(", Age : " + rs.getInt("age"));
			}
//			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}