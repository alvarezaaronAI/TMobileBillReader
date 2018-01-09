package T_MobilePDFReader.TMPDFReader;

import java.io.IOException; 
import org.apache.pdfbox.pdmodel.PDDocument;
  
public class Document_Creation {
    
   public static void main (String args[]) throws IOException {
       
      //Creating PDF document object 
      PDDocument document = new PDDocument();   
      
      //Create some text to go into the pdf
      
      //Saving the document
      document.save("D:/CSWorkSpaceFiles/TMobileFiles/my_doc.pdf");
         
      System.out.println("PDF created");  
    
      //Closing the document  
      document.close();

   }  
}