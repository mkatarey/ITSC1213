/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manavkatarey
 */
public class Book {
    private String author;
    private String title;
    private int numOfPages;
    
    //Constructor
    public Book(String title, String author, int numOfPages) {
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
    }
    
    //Num Of Pages Getter
    public int getNumOfPages() {
        return this.numOfPages;
    }
    
    //Title Getter
    public String getTitle() {
        return this.title;
    }
    
    //Author Getter
    public String getAuthor() {
        return this.author;
    }
    
    @Override
    public String toString() {
        //execute code
        return "Author: " + this.author + "\ntitle: " + this.title;
    }
}