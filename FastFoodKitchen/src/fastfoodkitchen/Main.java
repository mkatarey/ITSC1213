/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fastfoodkitchen;
import java.util.*;

/**
 *
 * @author manavkatarey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*BurgerOrder order1 = new BurgerOrder(3, 5, 4, 10, false, 1);
        BurgerOrder order2 = new BurgerOrder(0, 0, 3, 3, true, 2);
        BurgerOrder order3 = new BurgerOrder(1, 1, 0, 2, false, 3);
        
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        
        order1.setNumSodas(12);
        System.out.println(order1);*/
        
        FastFoodKitchen kitchen = new FastFoodKitchen();
        Scanner sc = new Scanner(System.in);

        while (kitchen.getNumOrdersPending() != 0) {
            // see what the user wants to do
            System.out.println("Please select from the following menu of options, by typing a number:");
            System.out.println("\t 1. Order food");
            System.out.println("\t 2. Cancel last order");
            System.out.println("\t 3. Show number of orders currently pending.");
            System.out.println("\t 4. Exit");
            System.out.println("\t 5. Check order");
            System.out.println("\t 6. Cancel order");

            int num = sc.nextInt();
            switch (num) {

            case 1:
                System.out.println("How many hamburgers do you want?");
                int ham = sc.nextInt();
                System.out.println("How many cheeseburgers do you want?");
                int cheese = sc.nextInt();
                System.out.println("How many veggieburgers do you want?");
                int veggie = sc.nextInt();
                System.out.println("How many sodas do you want?");
                int sodas = sc.nextInt();
                System.out.println("Is your order to go? (Y/N)");
                char letter = sc.next().charAt(0);
                boolean TOGO = false;
                if (letter == 'Y' || letter == 'y') {
                    TOGO = true;
                }
                int orderNum = kitchen.addOrder(ham, cheese, veggie, sodas, TOGO);
                System.out.println("Thank-you. Your order number is " + orderNum);
                System.out.println();
                break;
            case 2:
                boolean ready = kitchen.cancelLastOrder();
                if (ready) {
                    System.out.println("Thank you. The last order has been canceled");
                } else {
                    System.out.println("Sorry. There are no orders to cancel.");
                }
                System.out.println();
                break;
            case 3:
                System.out.println("There are " + kitchen.getNumOrdersPending() + " pending orders");
                break;
            case 4:
                System.exit(0);
                break;
            case 5:
                System.out.println("Which order would you like to check on?");
                int customerOrder = sc.nextInt();
                int num1 = kitchen.isOrderDone(customerOrder);
                if (num1 == 1) {
                    System.out.println("Your order is ready to go!");
                }
                else if (num1 == 0){
                    System.out.println("Your order is being prepared!");
                }
                else if (num1 == -99){
                    System.out.println("We can't find that order number!");
                }
                break;
            case 6:
                System.out.println("Which order would you like to cancel?");
                int orderCancellation = sc.nextInt();
                boolean isCancelled = kitchen.cancelOrder(orderCancellation);
                if (isCancelled == true) {
                    System.out.println("Your order has been cancelled!");
                }
                else {
                    System.out.println("Your order couldn't be found!");
                }
                break;
            default:
                System.out.println("Sorry, but you need to enter a 1, 2, 3 or a 4");
            }
        } // end while loop
    }
}