/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author manavkatarey
 */
public class Bookstore extends Goodbye implements Greeting {
    private ArrayList<Inventory> bookList = new ArrayList<Inventory>();
    private ArrayList<Inventory> cdList = new ArrayList<Inventory>();
    private ArrayList<Inventory> dvdList = new ArrayList<Inventory>();
    
    private ArrayList<regularMember> regularMemberList = new ArrayList<regularMember>();
    private ArrayList<premiumMember> premiumMemberList = new ArrayList<premiumMember>();
    
    Scanner scnr = new Scanner(System.in);
    
    public void showImportedFile(String filename) throws FileNotFoundException, IOException {
        File file = new File(filename);
        Scanner scnr = new Scanner(file);
        while(scnr.hasNext()) {
            System.out.println(scnr.nextLine());
        }
        
    }
    
    /**
     * This method is a unit test for the regular member ArrayList
     * 
     * @return Returning a Boolean if there are 2 members in Regular Member List
     */
    public boolean regularMemberUnitTest() {
        int numOfRegularMembers = 2;
        regularMemberJoin();
        regularMemberJoin();
        if (numOfRegularMembers == regularMemberList.size()) {
            return true;
        }
        
        return false;
    }
    /**
     * This method is a unit test for the premium member ArrayList
     * 
     * @return Returning a Boolean if there are no members in Regular Member List and 2 members in Premium Member List
     */
    public boolean premiumMemberUnitTest() {
        int numOfPremiumMembers = 2;
        regularMemberJoin();
        regularMemberJoin();
        premiumMemberJoin();
        premiumMemberJoin();
        if (regularMemberList.size() == 0 && numOfPremiumMembers == premiumMemberList.size()) {
            return true;
        }
        
        return false;
    }    
    
    public Bookstore() {
        Inventory harryPotter = new Inventory("Harry Potter", 5.00, true, false, false, 1, 100);
        Inventory mahabharata = new Inventory("Mahabharata", 5.00, true, false, false, 2, 100);
        Inventory magicTreeHouse = new Inventory("Magic Tree House", 5.00, true, false, false, 3, 100);
        
        Inventory snoopDogg = new Inventory("The Next Episode", 3.00, false, true, false, 4, 50);
        Inventory drDre = new Inventory("Still DRE", 3.00, false, true, false, 5, 50);
        Inventory motleyCrue = new Inventory("Home Sweet Home", 3.00, false, true, false, 6, 50);
        
        Inventory theAvengers = new Inventory("The Avengers", 4.00, false, false, true, 7, 30);
        Inventory dieHard = new Inventory("Die Hard", 4.00, false, false, true, 8, 30);
        Inventory velocipastor = new Inventory("Velocipastor", 4.00, false, false, true, 9, 30);
        
        bookList.add(harryPotter);
        bookList.add(mahabharata);
        bookList.add(magicTreeHouse);
        cdList.add(snoopDogg);
        cdList.add(drDre);
        cdList.add(motleyCrue);
        dvdList.add(theAvengers);
        dvdList.add(dieHard);
        dvdList.add(velocipastor);
    }
    
    public void showInventory() {
        for(int i = 0; i < bookList.size(); i++) {
            System.out.println("Order ID #" + bookList.get(i).getId() + ": " + bookList.get(i).getName() + " - $" + bookList.get(i).getPrice() + " - Num Copies Available: " + bookList.get(i).getNumCopies());
        }
        for(int i = 0; i < cdList.size(); i++) {
            System.out.println("Order ID #" + cdList.get(i).getId() + ": " + cdList.get(i).getName() + " - $" + cdList.get(i).getPrice() + " - Num Copies Available: " + cdList.get(i).getNumCopies());
        }
        for(int i = 0; i < dvdList.size(); i++) {
            System.out.println("Order ID #" + dvdList.get(i).getId() + ": " + dvdList.get(i).getName() + " - $" + dvdList.get(i).getPrice() + " - Num Copies Available: " + dvdList.get(i).getNumCopies());
        }
    }
    
    public String displayGreeting() {
        return "Welcome to Manav's Bookstore!";
    }
    /**
     * Purchasing books, CD's, and DVD's, shifts the inventory as necessary, and checks if you are a regular or premium member,
     * 
     * @return Makes your order and returns the total price
     */
    public double purchase() {
        showInventory();
        System.out.println("Our available books are (1) Harry Potter, (2) the Mahabharata, and (3) the Magic Tree House");
        System.out.println("What book would you like to buy? Enter book ID number (number in parentheses)");
        int whichBook = scnr.nextInt();
        double totalPrice = 0.0;
        for (int i = 0; i < bookList.size(); i++) {
            if (whichBook == bookList.get(i).getId()) {
                System.out.println("How many copies would you like to buy?");
                int numBooksToBuy = scnr.nextInt();
                totalPrice += (numBooksToBuy * bookList.get(i).getPrice());
                bookList.get(i).setNumCopies(bookList.get(i).getNumCopies() - numBooksToBuy);
            }
        }
        System.out.println("Our available CDs are (4) Snoop Dogg, (5) Dr. Dre, and (6) Motley Crue");
        System.out.println("What CD would you like to buy? Enter CD ID number (number in parentheses)");
        int whichCD = scnr.nextInt();
        for (int i = 0; i < cdList.size(); i++) {
            if (whichCD == cdList.get(i).getId()) {
                System.out.println("How many copies would you like to buy?");
                int numCDToBuy = scnr.nextInt();
                totalPrice += (numCDToBuy * cdList.get(i).getPrice());
                cdList.get(i).setNumCopies(cdList.get(i).getNumCopies() - numCDToBuy);
            }
        }
        System.out.println("Our available DVDs are (7) The Avengers, (8) Die Hard, and (9) Velocipastor");
        System.out.println("What DVD would you like to buy? Enter CD ID number (number in parentheses)");
        int whichDVD = scnr.nextInt();
        for (int i = 0; i < dvdList.size(); i++) {
            if (whichDVD == dvdList.get(i).getId()) {
                System.out.println("How many copies would you like to buy?");
                int numDVDToBuy = scnr.nextInt();
                totalPrice += (numDVDToBuy * dvdList.get(i).getPrice());
                dvdList.get(i).setNumCopies(dvdList.get(i).getNumCopies() - numDVDToBuy);
            }
        }
        System.out.println("Are you a regular or premium member? Enter R or P");
        String regOrPre = scnr.next();
        System.out.println("What is your ID number?");
        int idNum = scnr.nextInt();
        if (regOrPre.equals("R")) {
            for (regularMember i : regularMemberList) {
                if (i.getPersonalMemberID() == idNum) {
                    i.setMoneySpent(totalPrice + i.getMoneySpent());
                    System.out.println("Your money spent so far is: $" + i.getMoneySpent());
                }
            }
        }
        else if (regOrPre.equals("P")) {
            for (premiumMember i : premiumMemberList) {
                if (i.getPersonalPremiumMemberID() == idNum) {
                    i.setPremiumMoneySpent(totalPrice + i.getPremiumMoneySpent());
                    System.out.println("Your money spent so far is: $" + i.getPremiumMoneySpent());
                }
            }
        }
        return totalPrice;
    }
    
    public boolean purchaseUnitTest() {
        double expectedValue = 60.00;
        System.out.println("Our available books are (1) Harry Potter, (2) the Mahabharata, and (3) the Magic Tree House");
        System.out.println("This unit test will buy 5 copies of Harry Potter");
        int whichBook = 1;
        double totalPrice = 0.0;
        for (int i = 0; i < bookList.size(); i++) {
            if (whichBook == bookList.get(i).getId()) {
                System.out.println("How many copies would you like to buy?");
                int numBooksToBuy = 5;
                totalPrice += (numBooksToBuy * bookList.get(i).getPrice());
                bookList.get(i).setNumCopies(bookList.get(i).getNumCopies() - numBooksToBuy);
            }
        }
        System.out.println("Our available CDs are (4) Snoop Dogg, (5) Dr. Dre, and (6) Motley Crue");
        System.out.println("This unit test will buy 5 copies of Dr. Dre");
        int whichCD = 5;
        for (int i = 0; i < cdList.size(); i++) {
            if (whichCD == cdList.get(i).getId()) {
                System.out.println("How many copies would you like to buy?");
                int numCDToBuy = 5;
                totalPrice += (numCDToBuy * cdList.get(i).getPrice());
                cdList.get(i).setNumCopies(cdList.get(i).getNumCopies() - numCDToBuy);
            }
        }
        System.out.println("Our available DVDs are (7) The Avengers, (8) Die Hard, and (9) Velocipastor");
        System.out.println("This unit test will buy 5 copies of The Avengers");
        int whichDVD = 7;
        for (int i = 0; i < dvdList.size(); i++) {
            if (whichDVD == dvdList.get(i).getId()) {
                System.out.println("How many copies would you like to buy?");
                int numDVDToBuy = 5;
                totalPrice += (numDVDToBuy * dvdList.get(i).getPrice());
                dvdList.get(i).setNumCopies(dvdList.get(i).getNumCopies() - numDVDToBuy);
            }
        }
        if (expectedValue == totalPrice) {
            return true;
        }
        
        return false;
    }
    
    public void regularMemberJoin() {
        System.out.println("Please enter your name: ");
        String memberName = scnr.nextLine();
        regularMember temp = new regularMember(memberName);
        regularMemberList.add(temp);
        System.out.println("Your new personal member ID number is: " + temp.personalMemberID);
    }
    
    public void premiumMemberJoin() {
        System.out.println("Please enter your personal member ID number: ");
        int regularPersonalMemberID = scnr.nextInt();
        String tempName;
        System.out.println("What payment method would you like to use?");
        String paymentMethod = scnr.next();
        for (regularMember i : regularMemberList) {
            if (i.getPersonalMemberID() == regularPersonalMemberID) {
                tempName = i.getName();
                premiumMember premiumTemp = new premiumMember(tempName, false, paymentMethod);
                premiumMemberList.add(premiumTemp);
                System.out.println("Your new Premium Personal ID number is: " + premiumTemp.getPersonalPremiumMemberID());
                regularMemberList.remove(i);
                System.out.println("Remember to pay your monthly membership fee from the menu!");
                break;
            }
        }
    }
    
    public void payPremiumMembership() {
        System.out.println("Please enter your Premium Personal ID number: ");
        int premiumPersonalMemberID = scnr.nextInt();
        for (premiumMember i : premiumMemberList) {
            if (i.getPersonalPremiumMemberID() == premiumPersonalMemberID) {
                if (i.isPaid()) {
                    System.out.println("You're all paid up!");
                }
                else {
                    System.out.println("Please pay the $10 membership fee. Do you agree?");
                    System.out.println("Enter Yes if you agree or No if you do not agree");
                    String agreement = "";
                    agreement = scnr.nextLine();
                    while (agreement != "Yes" || agreement != "No") {
                        agreement = scnr.nextLine();
                        if (agreement.equals("Yes")) {
                            i.setPaid(true);
                            break;
                        }
                        else if (agreement.equals("No")) {
                            i.setPaid(false);
                            break;
                        }
                        else {
                            System.out.println("Invalid entry - try again");
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void goodbye() {
        System.out.println("Goodbye! Please come back again!");
    }
}