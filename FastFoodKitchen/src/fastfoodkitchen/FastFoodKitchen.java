/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;
import java.util.ArrayList;

/**
 *
 * @author manavkatarey
 */
public class FastFoodKitchen {
    private ArrayList<BurgerOrder> orderList = new ArrayList<BurgerOrder>();
    private static int nextOrderNum;
    
    //nextOrderNum getter method
    public int getNextOrderNum() {
        return this.nextOrderNum;
    }
    
    //incrementNextOrderNum method
    private static void incrementNextOrderNum() {
        nextOrderNum++;
    }
    
    //FastFoodKitchen constructor
    public FastFoodKitchen() {
        BurgerOrder order1 = new BurgerOrder(3, 5, 4, 10, false, this.getNextOrderNum());
        orderList.add(order1);
        incrementNextOrderNum();
        BurgerOrder order2 = new BurgerOrder(0, 0, 3, 3, true, this.getNextOrderNum());
        orderList.add(order2);
        incrementNextOrderNum();
        BurgerOrder order3 = new BurgerOrder(1, 1, 0, 2, false, this.getNextOrderNum());
        orderList.add(order3);
        incrementNextOrderNum();
    }
    
    //addOrder method
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo) {
        BurgerOrder order = new BurgerOrder(ham, cheese, veggie, soda, toGo, this.getNextOrderNum());
        orderList.add(order);
        incrementNextOrderNum();
        return order.getOrderNum();
    }
    
    //cancelLastOrder method
    public boolean cancelLastOrder() {
        if (orderList.size() > 0) {
            orderList.remove(orderList.size() - 1);
            nextOrderNum--;
            return true;
        }
        else {
            System.out.println("No previous orders");
            return false;
        }
    }
    
    //getNumOrdersPending method
    public int getNumOrdersPending() {
        return orderList.size();
    }
    
    //isOrderDone method
    public int isOrderDone(int orderID) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderID == orderList.get(i).getOrderNum()){
                return 1;
            }
            else {
                return 0;
            }
        }
        return -99;
    }
    
    //cancelOrder method
    public boolean cancelOrder(int orderID) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderID == orderList.get(i).getOrderNum()) {
                orderList.remove(i);
                nextOrderNum--;
                return true;
            }
        }
        return false;
    }
    
    //Sequential Search
    public int findOrderSeq(int orderID) {
        for (int j = 0; j < orderList.size(); j++) {
            if (orderList.get(j).getOrderNum() == orderID) {
                return j;
            }
        }
        return -1;
    }
    
    //Selection Sort
    public void selectionSort() {
        for (int j = 0; j < orderList.size() - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < orderList.size(); k++) {
                if ((orderList.get(k).getNumHamburgers() + orderList.get(k).getNumCheeseburgers() + orderList.get(k).getNumVeggieburgers()) < (orderList.get(minIndex).getNumHamburgers() + orderList.get(minIndex).getNumCheeseburgers() + orderList.get(minIndex).getNumVeggieburgers())) {
                minIndex = k;
                }
            }
            BurgerOrder temp = orderList.get(j);
            orderList.set(j, orderList.get(minIndex));
            orderList.set(minIndex, temp);
        }
    }
    
    //Insertion Sort
    public void insertionSort() {
        for (int j = 1; j < orderList.size() - 1; j++) {
            int temp = (orderList.get(j).getNumHamburgers() + orderList.get(j).getNumCheeseburgers() + orderList.get(j).getNumVeggieburgers());
            int possibleIndex = j - 1;
            int jtemp = (orderList.get(possibleIndex).getNumCheeseburgers() + orderList.get(possibleIndex).getNumHamburgers() + orderList.get(possibleIndex).getNumVeggieburgers());
            while ((possibleIndex > 0) && (jtemp > temp)) {
                orderList.set(possibleIndex + 1, orderList.get(possibleIndex));
                possibleIndex--;
            }
            orderList.set(possibleIndex + 1, orderList.get(j));
        }
    }
    
    //Binary Search
    public int findOrderBin(int orderID) {
        int left = 0;
        int right = orderList.size() - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (orderID < orderList.get(middle).getOrderNum()) {
                right = middle - 1;
            }
            else if (orderID > orderList.get(middle).getOrderNum()) {
                left = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
    
    //Getter for ArrayList
    public ArrayList<BurgerOrder> getOrderList() {
        return orderList;
    }

    @Override
    public String toString() {
        return "FastFoodKitchen{" + "orderList=" + orderList + '}';
    }
}