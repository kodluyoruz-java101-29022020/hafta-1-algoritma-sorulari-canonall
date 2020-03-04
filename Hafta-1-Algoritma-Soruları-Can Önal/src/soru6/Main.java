package soru6;

public class Main {

	public static void main(String[] args) {
		PDFDocument pdfDocument=new PDFDocument("PDF Document");
		WordDocument wordDocument=new WordDocument("Word Document");
		
		//pdfDocument.setBody("PDF Document Changed");		//optional in order to change PDF body
		//wordDocument.setBody("Word Document Changed");	//optional in order to change Word body
		Printer.printPDFDocument(pdfDocument.getBody());
		Printer.printWordDocument(wordDocument.getBody());
	
		
	}

}
