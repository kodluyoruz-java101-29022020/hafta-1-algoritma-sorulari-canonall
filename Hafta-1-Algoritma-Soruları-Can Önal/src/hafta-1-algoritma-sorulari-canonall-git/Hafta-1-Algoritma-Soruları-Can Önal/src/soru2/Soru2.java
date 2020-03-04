package soru2;

import java.util.Scanner;

public class Soru2 {
	public static void main(String[] args) {
		openMenu();
	}

	private static void openMenu() {
		System.out.println("1-Addition");
		System.out.println("2-Subtraction");
		System.out.println("3-Multiplication");
		System.out.println("4-Division");
		System.out.print("Please select an operation: ");
		
		Scanner scanner=new Scanner(System.in);
		byte operationNumber=scanner.nextByte();
		
		callOperation(operationNumber);
	}
	
	private static void callOperation(byte operationNumber) {
		switch (operationNumber) {
		case 1:
			addition();
			break;
		case 2:
			subtraction();
			break;
		case 3:
			multiplication();
			break;
		case 4:
			division();
			break;
		default:
			System.out.println("Please select a valid operation\n");
			openMenu();
			break;
		}
	}
	private static void addition() {
		int firtNumber,secondNumber;
		firtNumber=getFirstNumber();
		secondNumber=getSecondNumber();
		
		int result= firtNumber + secondNumber;
		System.out.println("" +firtNumber+ " + " +secondNumber+ "= " +result+ "\n");
		
		openMenu();
	}

	private static void subtraction() {
		int firtNumber,secondNumber;
		firtNumber=getFirstNumber();
		secondNumber=getSecondNumber();
		
		int result= firtNumber - secondNumber;
		System.out.println("" +firtNumber+ " - " +secondNumber+ "= " +result+ "\n");
		
		openMenu();
	}

	private static void multiplication() {
		int firtNumber,secondNumber;
		firtNumber=getFirstNumber();
		secondNumber=getSecondNumber();
		
		int result= firtNumber * secondNumber;
		System.out.println("" +firtNumber+ " * " +secondNumber+ "= " +result+ "\n");	
		
		openMenu();
	}

	private static void division() {
		int firtNumber,secondNumber;
		firtNumber=getFirstNumber();
		secondNumber=getSecondNumber();
		
		float result= Float.valueOf(firtNumber) / Float.valueOf(secondNumber);
		System.out.println("" +firtNumber+ " / " +secondNumber+ "= " +result+ "\n");
		
		openMenu();
	}
	
	private static int getFirstNumber() {
		int firstNumber;
		
		System.out.print("Please enter first number: ");
		Scanner scanner1=new Scanner(System.in);
		firstNumber=scanner1.nextInt();
		
		return firstNumber;
	}
	private static int getSecondNumber() {
		int secondNumber;
		
		System.out.print("Please enter second number: ");
		Scanner scanner2=new Scanner(System.in);
		secondNumber=scanner2.nextInt();
		
		return secondNumber;
	}

}
