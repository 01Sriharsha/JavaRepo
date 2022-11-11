package com.jdbc.demo;

import java.sql.*;
import java.util.*;

public class PreparedStatementDemo2 {

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
			

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter First name : ");
			String fname = sc.nextLine();
			System.out.print("Enter Last name : ");
			String lname = sc.nextLine();
			System.out.print("Enter the ID : ");
			int id = sc.nextInt();
			System.out.print("Enter Salary : ");
			int salary = sc.nextInt();
			System.out.print("Enter Age : ");
			int age = sc.nextInt();
			
			
			pstmt.setString(1, fname);
			pstmt.setString(2, lname);
			pstmt.setInt(3, id);
			pstmt.setInt(4, salary);
			pstmt.setInt(5, age);
			
			pstmt.executeUpdate(); 
			
			System.out.println("Data added Successfully...");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
