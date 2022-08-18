
import java.io.*;
import java.util.*;


public class BookChapterReadWrite {
    
    public static BookChapter loadBookChapterFromFile(String filename) throws FileNotFoundException, IOException {
        
        File file = new File(filename);
        Scanner scnr = new Scanner(file);
        
        ArrayList<Page>ListOfPage = new ArrayList<Page>();
        
        ListOfPage.add( BookChapterReadWrite.getPage(scnr,3) );
        
        while( scnr.hasNext() ){
            
              ListOfPage.add( BookChapterReadWrite.getPage(scnr,3) );
        
        }
        
        BookChapter outputBookChapter = new BookChapter(3, ListOfPage );
        return outputBookChapter;
        
    }
    
    public static void writeBookChapterToFIle (BookChapter book, String fileName) throws FileNotFoundException, IOException {
        File givenFile = new File(fileName);
        PrintWriter writer = new PrintWriter(givenFile);
        
        for( Page i: book.getPages() ){
           for (String k: i.getLines() ){
               writer.write(k);
               writer.flush();
               writer.write("\n");
               writer.flush();
           }
           writer.write("\n");
           writer.flush();
           writer.write("\n");
           writer.flush();
           writer.write("\n");
           writer.flush();
           
           
        }
        writer.close();
        
        
        
        
    }
    
    public static Page getPage(Scanner scanner, int numLines) {
        
       String[] pages = new String[numLines];
       
       for(int i=0; i<numLines; i++){
           
           if(scanner.hasNextLine()){
               pages[i] = scanner.nextLine();
           }
           
       }
       
       Page outputPage = new Page(pages);
       return outputPage;
       
       
    }
    
}
