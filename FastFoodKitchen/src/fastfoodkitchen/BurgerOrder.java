/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;

/**
 *
 * @author manavkatarey
 */
public class BurgerOrder {
    //fields
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 134345;
    private int total = 0;
    
    //Constructor
    public BurgerOrder(int numHamburgers, int numCheeseburgers, int numVeggieburgers, int numSodas, boolean orderToGo, int orderNum) {
        this.numHamburgers = numHamburgers;
        this.numCheeseburgers = numCheeseburgers;
        this.numVeggieburgers = numVeggieburgers;
        this.numSodas = numSodas;
        this.orderToGo = orderToGo;
        this.orderNum = orderNum;
    }
    
    
    //Hamburger getter method
    public int getNumHamburgers() {
        return this.numHamburgers;
    }
    
    //Hamburger setter method
    public void setNumHamburgers(int numHamburgers) {
        if (numHamburgers >= 0) {
            this.numHamburgers = numHamburgers;
        }
        else {
            System.out.println("Invalid amount");
        }
    }
    
    //Cheeseburger getter method
    public int getNumCheeseburgers() {
        return this.numCheeseburgers;
    }
    
    //Cheeseburger setter method
    public void setNumCheeseburgers(int numCheeseburgers) {
        if (numCheeseburgers >= 0) {
            this.numCheeseburgers = numCheeseburgers;
        }
        else {
            System.out.println("Invalid amount");
        }
    }
    
    //Veggieburger getter method
    public int getNumVeggieburgers() {
        return this.numVeggieburgers;
    }
    
    //Veggieburger setter method
    public void setNumVeggieburgers(int numVeggieburgers) {
        if (numVeggieburgers >= 0) {
            this.numVeggieburgers = numVeggieburgers;
        }
        else {
            System.out.println("Invalid amount");
        }
    }
    
    //Soda getter method
    public int getNumSodas() {
        return this.numSodas;
    }
    
    //Soda setter method
    public void setNumSodas(int numSodas) {
        if (numSodas >= 0) {
            this.numSodas = numSodas;
        }
        else {
            System.out.println("Invalid amount");
        }
    }
    
    //orderToGo getter method
    public boolean isOrderToGo() {
        return this.orderToGo;
    }
    
    //orderToGo setter method
    public void setOrderToGo(boolean orderToGo) {
        this.orderToGo = orderToGo;
    }
    
    //orderNum getter method
    public int getOrderNum() {
        return this.orderNum;
    }
    
    //orderNum setter method
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "BurgerOrder{" + "numHamburgers=" + numHamburgers + ", numCheeseburgers=" + numCheeseburgers + ", numVeggieburgers=" + numVeggieburgers + ", numSodas=" + numSodas + ", orderToGo=" + orderToGo + ", orderNum=" + orderNum + '}';
    }
}