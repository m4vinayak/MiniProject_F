package com.miniproject.adminlogin;

import java.util.Scanner;

public class AdminLogin {
	static final String adminUsername  = "admin";  // Define admin credentials
	static final String adminPassword = "password";

	public static void adminLogin() {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter username");
		String username = scanner.next();
		
		System.out.println("Enter password");
		String password = scanner.next();
		
		if(username.equals(adminUsername) && password.equals(adminPassword)) {
			System.out.println("Admin login successful");
		}else {
			System.out.println("Admin login failed.Please try again");
		}
	}

}



