/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionslab1213;
import java.util.*;

/**
 *
 * @author manavkatarey
 */
public class ExceptionsLab1213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(divideUserInput());
    }
    
    public static int addUserInput() {
        Scanner scnr = new Scanner(System.in);
        int first = 0;
        int second = 0;
        while (true) {
            try {
                System.out.println("Please enter an integer.");
                first = scnr.nextInt();
                break;
            }
            catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            scnr.next();
            }
        }
        while (true) {
            try {
                System.out.println("Please enter an integer.");
                second = scnr.nextInt();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                scnr.next();
            }
        }
        System.out.print("The sum is: ");
        return first + second;
    }
    
    public static int divideUserInput() {
        Scanner scnr = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int quotient = 0;
        while (true) {
            try {
                System.out.println("Please enter an integer.");
                first = scnr.nextInt();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter an integer divisor.");
                scnr.next();
            }
        }
        while (true) {
            try {
                System.out.println("Please enter an integer.");
                second = scnr.nextInt();
                quotient = first / second;
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter an integer dividend.");
                scnr.next();
            }
            catch (ArithmeticException e) {
                System.out.println("Invalid arithmetic.");
                //scnr.next();
            }
        }
        System.out.print("The quotient is: ");
        return quotient;
    }
}