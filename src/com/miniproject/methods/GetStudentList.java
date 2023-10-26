package com.miniproject.methods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.miniproject.database.DatabaseConnection;
import com.miniproject.interfaces.GetStudentListInterface;

public class GetStudentList implements GetStudentListInterface {

	Connection con = null;
	PreparedStatement psmt = null;

	@Override
	public void getStudentList() throws Exception {

		DatabaseConnection connection = new DatabaseConnection();
		con = connection.getConnection();
		System.out.println("Database connected\n");
		psmt = con.prepareStatement("select * from student");
		ResultSet set = psmt.executeQuery();
		while (set.next()) {
			System.out.println("Student Id: " + set.getInt(1));
			System.out.println("First Name: " + set.getString(2));
			System.out.println("Last Name: " + set.getString(3));
			System.out.println("User Name: " + set.getString(4));
			System.out.println("Password: " + set.getString(5));
			System.out.println("City: " + set.getString(6));
			System.out.println("email Id: " + set.getString(7));
			System.out.println("Mobile number: " + set.getString(8) + "\n\n");
		}
	}
}
