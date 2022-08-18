/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manavkatarey
 */
public class Food implements Sized {
    private String name;
    private double size;
    
    public Food(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + " Size: " + size;
    }
}