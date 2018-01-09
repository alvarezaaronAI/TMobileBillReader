package T_MobilePDFReader.TMPDFReader;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class Adding_Pages {

   public static void main(String args[]) throws IOException {
       
      //Creating PDF document object 
      PDDocument document = new PDDocument();

      for (int i=0; i<10; i++) {
         //Creating a blank page 
         PDPage tempblankPage = new PDPage();
         	//We may add some text into the tempBlankPage
         
         //Adding the blank page to the document
         document.addPage( tempblankPage );
      } 
     
      //Saving the document
      document.save("D:/CSWorkSpaceFiles/TMobileFiles/my_doc.pdf");
      System.out.println("PDF created");
      
      //Closing the document
      document.close();

   }  
} 