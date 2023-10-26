package com.miniproject.application;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.miniproject.database.DatabaseConnection;
import com.miniproject.methods.AddQuestionMethod;
import com.miniproject.methods.GetStudentList;

public class QuizApplication {

	public static void main(String[] args) {

		System.out.println("START\n");

		DatabaseConnection connection = new DatabaseConnection();
		connection.getConnection();

		Scanner scan = new Scanner(System.in);
		System.out.println("What you want to do:");
		System.out.println("Press 1: for add question ");
		System.out.println("Press 2: for view student List");

		int choice = scan.nextInt();
		switch (choice) {

		case 1:
			AddQuestionMethod addQuestion = new AddQuestionMethod();
			try {
				addQuestion.addQuestionMethod();
			} catch (ClassNotFoundException | IOException | SQLException e) {
				System.out.println(e);
			}
			break;

		case 2:
			GetStudentList getStudentList = new GetStudentList();
			try {
				getStudentList.getStudentList();
			} catch (Exception e) {
				System.out.println(e);
			}
			break;
		}

		System.out.println("\nEND");
	}
}
