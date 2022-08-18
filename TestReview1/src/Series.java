/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author manavkatarey
 */
public class Series {
    
    private ArrayList<Book> books;
    private String title;
    private String author;
    private static int numOfSeries;
    
    //Constructor
    public Series(Book book) {
        this.books = new ArrayList<Book>();
        this.books.add(book);
        this.numOfSeries++;
    }
    
    //Author 
    public void setAuthor(String author) {
        this.author = author;
    }
    
    //Title Setter
    public void setTitle(String title) {
        this.title = title;
    }
    
    //Add Book method
    public void addBook(Book book) {
        this.books.add(book);
    }
    
    //Remove Book method
    public void removeBook(int index) {
        this.books.remove(index);
    }
    
    //getBooks method
    public ArrayList<Book> getBooks() {
        return this.books;
    }
    
    //readBook method
    public void readBook(Book book) {
        for(Book element : books) {
            String temp = element.getTitle();
            if(title.equals(temp)){
                System.out.println("Reading " + temp);
                break;
            }
        }
    }
    
    //getTotalNumOfPages method
    public int getTotalNumOfPages() {
        int sum = 0;
        for(Book element : books) {
            sum = sum + element.getNumOfPages();
        }
        return sum;
    }
    
    //toString method
    @Override
    public String toString() {
        for (int i = 0; i < books.size(); i++) {
            books.get(i).toString();
        }
        return "Author: " + author + " Title: " + title;
    }
    
    //getNumOfSeries method
    public static int getNumOfSeries() {
        return numOfSeries;
    }
}