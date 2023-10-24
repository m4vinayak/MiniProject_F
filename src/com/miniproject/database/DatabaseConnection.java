package com.miniproject.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.miniproject.interfaces.DatabaseConnectionInterface;

public class DatabaseConnection implements DatabaseConnectionInterface{
	Connection con = null;
	
	@Override
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12656072","sql12656072","c8Dz5Is25B");
			System.out.println("Database Connected\n");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con; 
	}

}
