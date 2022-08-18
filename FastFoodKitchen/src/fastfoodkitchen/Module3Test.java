/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;
import java.util.*;

/**
 *
 * @author manavkatarey
 */
public class Module3Test {
    public static void main(String[] args) {
        FastFoodKitchen kitchen = new FastFoodKitchen();
        //int orderPosition = kitchen.findOrderSeq(2);
        //System.out.println("Using sequential search >> order position is " + orderPosition);*/
        kitchen.selectionSort();
        //kitchen.insertionSort();
        
        ArrayList<BurgerOrder> sortedOrders = kitchen.getOrderList();
        int orderSize = 0;
        for (BurgerOrder order: sortedOrders) {
            orderSize = order.getNumCheeseburgers() + order.getNumHamburgers() + order.getNumVeggieburgers();
            System.out.println(order.getOrderNum() + " has " + orderSize + " burgers.");
        }
        int orderPosition = kitchen.findOrderBin(2);
        System.out.println("Using binary search >> order position is " + orderPosition);
    }
}
