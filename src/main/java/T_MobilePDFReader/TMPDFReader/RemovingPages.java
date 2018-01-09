package T_MobilePDFReader.TMPDFReader;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class RemovingPages {

   public static void main(String args[]) throws IOException {

      //Loading an existing document
      File file = new File("D:/CSWorkSpaceFiles/TMobileFiles/Sample.pdf");
      PDDocument document = PDDocument.load(file);
       
      //Listing the number of existing pages
      int numPages= document.getNumberOfPages();
      System.out.print(numPages);
       
      //Removing the pages
      document.removePage(1);
      
      System.out.println("page removed");

      //Saving the document
      document.save("D:/CSWorkSpaceFiles/TMobileFiles/Sample.pdf");

      //Closing the document
      document.close();

   }
}