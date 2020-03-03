package soru3;

import java.util.Random;

public class Soru3 {
		
	public static void main(String[] args) {
		int array[]=new int[100];
		array= generateRandomNumbers(array);		//generates random numbers with Random class
		showArray(array);
		calculateAverage(array);
	}

	public static int[] generateRandomNumbers(int[] array) {
		Random random=new Random();
		
		for(byte i=0;i<100;i++) {
			array[i]= random.nextInt(100);
		}
		System.out.println("Array generated");
		return array;
	}

	public static void showArray(int[] array) {
		for(byte i=0;i<100;i++) {
			System.out.print("" +array[i]+ " ");
		}
	}

	public static void calculateAverage(int[] array) {
		
		System.out.println("\nCalculating...");
		
		int sum=0; 					//initial value
		float average;
		
		for(byte i=0;i<100;i++) {
			sum= sum+ array[i];
		}
		System.out.println("Sum of numbers: " +sum);
		System.out.println("Array lenght: " +array.length);
		average=Float.valueOf(sum)/array.length;
		System.out.println("Average: " +average);
	}

}
