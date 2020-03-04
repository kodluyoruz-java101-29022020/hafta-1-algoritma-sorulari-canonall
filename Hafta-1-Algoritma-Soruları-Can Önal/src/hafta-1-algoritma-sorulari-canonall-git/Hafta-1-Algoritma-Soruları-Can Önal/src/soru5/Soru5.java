package soru5;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Soru5 {

	public static void main(String[] args) {
		int[] array= new int[100];						//100=array length
		array= generateRandomNumbers(array);
		showArray(array);
		checkPrimeOrOdd(array);
	}

	public static int[] generateRandomNumbers(int[] array) {
		Random random=new Random();
		for(byte i=0; i<array.length; i++) {
			array[i]=random.nextInt(100);				//100=range of random numbers
		}
		System.out.println("Random array generated");
		return array;
	}
	
	public static void showArray(int[] array) {
		for (byte i = 0; i < array.length; i++) {
			System.out.print("" +array[i]+ " ");
		}
	}
	
	public static void checkPrimeOrOdd(int[] array) {
		System.out.println("\nChecking numbers...");
		
		List<Integer> evenNumbersList= new ArrayList<>();
		List<Integer> oddNumbersList= new ArrayList<>();
		
		for (byte i = 0; i < array.length; i++) {
			if(array[i]%2==0) {
				evenNumbersList.add(array[i]);
			}else {
				oddNumbersList.add(array[i]);
			}
		}
		System.out.print("Even numbers: ");
		showList(evenNumbersList);				
		System.out.println();
		System.out.print("Odd numbers: ");
		showList(oddNumbersList);					
	}

	public static void showList(List<Integer> list) {		
		for (byte i = 0; i < list.size(); i++) {
			System.out.print("" +list.get(i)+ " ");
		}
		
	}
}
