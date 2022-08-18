/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author manavkatarey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Bookstore manavsBookstore = new Bookstore();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        //System.out.println(manavsBookstore.purchaseUnitTest());
        //System.out.println(manavsBookstore.regularMemberUnitTest());
        //System.out.println(manavsBookstore.premiumMemberUnitTest());
        
        while(num != 6) {
            // see what the user wants to do
        System.out.println(manavsBookstore.displayGreeting());
        System.out.println("You must be at least a regular member to make a purchase!");
        System.out.println("Please select from the options below!");
        System.out.println("\t 1. Make a Purchase");
        System.out.println("\t 2. Join the Free Membership Program");
        System.out.println("\t 3. Already a Free Member? Try Joining our Premium Membership");
        System.out.println("\t 4. Pay your monthly premium membership fee");
        System.out.println("\t 5. Show Inventory");
        System.out.println("\t 6. Show imported file");
        System.out.println("\t 7. Exit");
        
        num = sc.nextInt();
        switch (num) {
            
            case 1:
                System.out.println(manavsBookstore.purchase());
                break;
            
            case 2:
                manavsBookstore.regularMemberJoin();
                break;
                
            case 3:
                manavsBookstore.premiumMemberJoin();
                break;
            
            case 4:
                manavsBookstore.payPremiumMembership();
                break;
                
            case 5:
                manavsBookstore.showInventory();
                break;
            
            case 6:
                manavsBookstore.showImportedFile("bookstoreText.txt");
                break;
                
            case 7:
                manavsBookstore.goodbye();
                System.exit(0);
                break;
            
        
            default:
                System.out.println("Invalid entry - please enter a number from the menu");
                break;
            
            }
        }
    }
}