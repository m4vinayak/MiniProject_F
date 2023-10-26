package com.miniproject.methods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.miniproject.database.DatabaseConnection;
import com.miniproject.interfaces.AddQuestionInterface;

public class AddQuestionStatement implements AddQuestionInterface {

	Connection con = null;
	PreparedStatement psmt = null;

	@Override
	public void addQuestion(String question, String option_1, String option_2, String option_3, String option_4,
			String answers) throws SQLException {
		DatabaseConnection connection = new DatabaseConnection();
		con = connection.getConnection();
		psmt = con.prepareStatement(
				"insert into question(question, option_1, option_2, option_3, option_4, answers) values(?,?,?,?,?,?)");

		psmt.setString(1, question);
		psmt.setString(2, option_1);
		psmt.setString(3, option_2);
		psmt.setString(4, option_3);
		psmt.setString(5, option_4);
		psmt.setString(6, answers);
		psmt.executeUpdate();

		System.out.println("\none question added");
	}

}
