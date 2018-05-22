package com.cnttctu.mywebmvc.ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionDB {
	public static Connection GetConection() {
		 Connection cons = null;
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
	            cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useUnicode=yes&characterEncoding=UTF-8", "root", "");
		 }catch(SQLException e) {
			 System.out.println(e);
		 }
		 catch (ClassNotFoundException e) {
			// TODO: handle exception
			 System.out.println(e);
		}
		return cons;
	}

}
