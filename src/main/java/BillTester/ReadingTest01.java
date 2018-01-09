package BillTester;

import java.io.File;
import java.io.IOException;
 
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.pdmodel.PDPage;

public class ReadingTest01 {

	public static void main(String args[]) throws IOException {
		  /** 
		   * Testing Loading Up Document 
		   **/
			//This is a hard coded path test out path reading.
	      //Loading an existing document 
	      File file = new File("D:/CSWorkSpaceFiles/TMobileFiles/BillSummaryUntouched/BillSummary--Oct14-Nov13U.pdf"); 
	      PDDocument document = PDDocument.load(file); 
	        
	      System.out.println("PDF loaded"); 
	        
	      //Adding a blank page to the document 
	      document.addPage(new PDPage());  

	      //Saving the document 
	      document.save("D:/CSWorkSpaceFiles/TMobileFiles/BillSummaryTouched/ReadingTest01/BillSummary--Oct14-Nov13UT.pdf");

	      //Closing the document  
	      document.close(); 
	      /** 
		   * ---------------------- End of Loading Page and Creating a new Page
		   **/
	      
	   }  
}
