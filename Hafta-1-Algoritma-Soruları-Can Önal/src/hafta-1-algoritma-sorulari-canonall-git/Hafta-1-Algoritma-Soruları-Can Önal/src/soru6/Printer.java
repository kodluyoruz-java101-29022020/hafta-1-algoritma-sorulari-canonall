package soru6;

public class Printer {
	
	public static void printPDFDocument(String body) {
		System.out.println(body);			//Print as PDF
		
	}
	public static void printWordDocument(String body) {
		System.out.println(body);			//Print as Word
	}
	
	//Static methods can be called from other classes without object reference
	//like utility methods
	//We can use Printer.printPDFDocument instead of creating a Printer object
	//This helps us use memory more effectively
}
