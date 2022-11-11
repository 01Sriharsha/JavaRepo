package com.jdbc.demo;

import java.sql.*;
import java.util.*;

public class DeleteDemo {

	public static void main(String[] args) {
		try {
			
			String url , username , password;
			
			url = "jdbc:mysql://localhost:3307/test";
			username = "root";
			password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the ID to delete : ");
			String id = sc.nextLine();
			
			String query = String.format("delete from formjdbc where phone=%s", id);
			
			
			stmt.executeUpdate(query);
			System.out.println("Data deleted successfully ... ");
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
