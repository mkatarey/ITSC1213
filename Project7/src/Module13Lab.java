
import java.io.*;


public class Module13Lab {


    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        BookChapter one = BookChapterReadWrite.loadBookChapterFromFile("game_of_thrones_chapter_1.txt");
        
        BookChapter two = BookChapterReadWrite.loadBookChapterFromFile("slaughterhouse_five_chapter_1.txt");
        
        System.out.println(one.toString());
        String sampleBook = "sampleBook.txt";
        
        BookChapterReadWrite.writeBookChapterToFIle(two, sampleBook);
        
        
        
        
    }
    
}