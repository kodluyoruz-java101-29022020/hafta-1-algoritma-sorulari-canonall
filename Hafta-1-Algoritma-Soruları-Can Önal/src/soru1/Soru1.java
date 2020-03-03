package soru1;

import java.util.Scanner;

public class Soru1 {
	
	private static String userPassword="12345";				//user's password
	
	public static void main(String[] args) {
		String password;
		
		System.out.print("Please enter your password:");
		Scanner scanner=new Scanner(System.in);
		password=scanner.nextLine();
		
		checkPassword(password);
	}
	public static void checkPassword(String password) {		//static methods can be called without object reference
								
		if(password.equals(userPassword)) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login Failed");
		}
	}
}
