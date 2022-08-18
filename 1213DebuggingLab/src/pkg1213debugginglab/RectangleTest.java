package pkg1213debugginglab;


import java.awt.Rectangle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author manavkatarey
 */
public class RectangleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle box1 = new Rectangle(10, 10, 40, 30);
        System.out.println("box 1: " + box1);
        Rectangle box2 = new Rectangle(100,50);
        System.out.println("box 2: " + box2);
        box1.move(20,20);
        box2.resize(50,30);
        System.out.println("box 1: " + box1);
        System.out.println("box 2: " + box2);
        Rectangle box3 = box1.intersection(box2);
        double width = box3.getWidth();
        double height = box3.getHeight();
        double areabox3 = width * height;
        System.out.println("Area of intersecting rectangle: " + areabox3);
        System.out.println("box 3: " + box3);
    }
    
}
