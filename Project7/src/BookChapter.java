
import java.util.*;
public class BookChapter {
    
    private int linesPerPage;
    private ArrayList<Page> page;
    private String title;
    private String author;

    public int getLinesPerPage() {
        return linesPerPage;
    }

    public void setLinesPerPage(int linesPerPage) {
        this.linesPerPage = linesPerPage;
    }

    public ArrayList<Page> getPages() {
        return page;
    }

    public void setPages(ArrayList<Page> page) {
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    
    public BookChapter(int linesPerPage){
        this.linesPerPage = linesPerPage;
    }
    
     public BookChapter(int linesPerPage, ArrayList<Page> page ){
        this.linesPerPage = linesPerPage;
        this.page = page;
    }
     
      public BookChapter(int linesPerPage, ArrayList<Page> page, String title, String author){
        this.linesPerPage = linesPerPage;
        this.page = page;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author + " has " + page.size() +" page, and " + linesPerPage + " lines per page" ;
    }
    
    
}
