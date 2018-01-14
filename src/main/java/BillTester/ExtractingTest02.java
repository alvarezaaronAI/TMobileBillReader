package BillTester;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripper;

public class ExtractingTest02 {

	public static void main(String[] args) throws IOException {
		 /** 
		   * Testing Extracting Text from Tmobile Bill
		   **/
		File file = new File("D:/CSWorkSpaceFiles/TMobileFiles/BillSummaryUntouched/BillSummary--Nov14-Dec13U.pdf");
		PDDocument document = PDDocument.load(file);

		System.out.println("PDF loaded");
		
		//Counting the pages first ----------
			int numOfBillPages = document.getNumberOfPages();
			System.out.println("Bill has " + numOfBillPages + " page(s)");
			//Removing Pages to deal with one page only 
				//Pages from 0 to Size of num of Pages and we should count backwards instead 
			 for (int i = numOfBillPages - 1; i > 0; i--) {
					document.removePage(i);
					//We should have remove every page of the bill except the first one
				}
			 System.out.println("Removed every page but the first one. The document should have only one page.");
			 
		//Extracting Text from that one page.
			//Instantiate PDFTextStripper class
		      PDFTextStripper pdfStripper = new PDFTextStripper();
		      String text = pdfStripper.getText(document);
		      fileOutPut(text);
		      System.out.println("Extracted the text from the document. Converted into A Text File ");
		//-----------------------------------
		// Saving the document
		document.save("D:/CSWorkSpaceFiles/TMobileFiles/BillSummaryTouched/ExtractingTest02/BillSummary--Nov14-Dec13UT.pdf");

		// Closing the document
		document.close();
		 /** 
		   * --------------- End of extraction of Tmobile Bill 
		   **/
	}
	/**
	 * Public method that allows me to print out text that was extracted from the pdf file onto a txt file */
	public static void fileOutPut(String TextInput) throws IOException{
		try {
			File fileIn = new File("D:/CSWorkSpaceFiles/TMobileFiles/BillSummaryTouched/ExtractingTest02/BillSummary--Nov14-Dec13T.txt");
			FileWriter data = new FileWriter(fileIn);
			
			data.write(TextInput);
			
			data.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
