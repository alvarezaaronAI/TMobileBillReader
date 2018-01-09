package T_MobilePDFReader.TMPDFReader;

import java.io.IOException; 
import java.util.Calendar; 
import java.util.GregorianCalendar;
  
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;

public class AddingDocumentAttributes {
   public static void main(String args[]) throws IOException {

      //Creating PDF document object
      PDDocument document = new PDDocument();

      //Creating a blank page
      PDPage blankPage = new PDPage();
       
      //Adding the blank page to the document
      document.addPage( blankPage );

      //Creating the PDDocumentInformation object 
      PDDocumentInformation pdd = document.getDocumentInformation();

      //Setting the author of the document
      pdd.setAuthor("Tutorialspoint");
       
      // Setting the title of the document
      pdd.setTitle("Sample document"); 
       
      //Setting the creator of the document 
      pdd.setCreator("PDF Examples"); 
       
      //Setting the subject of the document 
      pdd.setSubject("Example document"); 
       
      //Setting the created date of the document 
      Calendar date = new GregorianCalendar();
      date.set(2015, 11, 5); 
      pdd.setCreationDate(date);
      //Setting the modified date of the document 
      date.set(2016, 6, 5); 
      pdd.setModificationDate(date); 
       
      //Setting keywords for the document 
      pdd.setKeywords("sample, first example, my pdf"); 
 
      //Saving the document 
      document.save("D:/CSWorkSpaceFiles/TMobileFiles/doc_attributes.pdf");

      System.out.println("Properties added successfully ");
       
      //Closing the document
      document.close();

   }
}