package com.miniproject.application;

import com.miniproject.database.DatabaseConnection;

public class QuizApplication {

	public static void main(String[] args) {
		
		System.out.println("START\n");
		
		DatabaseConnection connection = new DatabaseConnection();
		connection.getConnection();
		
		System.out.println("\nEND");
	}
}
