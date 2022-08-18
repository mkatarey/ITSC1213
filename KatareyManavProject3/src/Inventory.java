    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manavkatarey
 */
public class Inventory {
    private boolean isBook;
    private boolean isCD;
    private boolean isDVD;
    private String name;
    private double price;
    private int id;
    private int numCopies;
    
    public Inventory(String name, double price, boolean isBook, boolean isCD, boolean isDVD, int id, int numCopies) {
        this.name = name;
        this.price = price;
        this.isBook = isBook;
        this.isCD = isCD;
        this.isDVD = isDVD;
        this.id = id;
        this.numCopies = numCopies;
    }

    public boolean isIsBook() {
        return isBook;
    }

    public void setIsBook(boolean isBook) {
        this.isBook = isBook;
    }

    public boolean isIsCD() {
        return isCD;
    }

    public void setIsCD(boolean isCD) {
        this.isCD = isCD;
    }

    public boolean isIsDVD() {
        return isDVD;
    }

    public void setIsDVD(boolean isDVD) {
        this.isDVD = isDVD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }
}