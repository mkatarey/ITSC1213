/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package itsc1213lab6;

/**
 *
 * @author manavkatarey
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** Part A ***");
        
        Person p = new Person("Raya", "Whitaker", 800555555);
        p.display();
        
        Student s1 = new Student("Xavier", "Cato", 900111222, "CS", 3.5, 75);
        System.out.println(s1);
        s1.setTransfer(true);
        s1.setBalance(100);
        s1.addCourse("Java Programming");
        s1.addCourse("Calculus");
        
        s1.display();
        
        Student s2 = new Student("Kathrine", "Johnson", 900, "CS", 4.0, 100);
        Student s3 = new Student("Roy", "Clay", 901, "Biology", 3.2, 85);
        Student s4 = new Student("Kimberly", "Bryant", 902, "Electric Engineering", 3.0, 80);
        Professor prof1 = new Professor("Mary", "Castro", 300, "CS", 80000);
        System.out.println(prof1);
        prof1.addAdvisee(s2);
        prof1.addAdvisee(s3);
        prof1.addAdvisee(s4);
        if (prof1.removeAdvisee(902)) {
            System.out.println("The advisee has been removed");
        } else {
            System.out.println("This student is not an advisee of Professor "
                    + prof1.getFirstName() + " " + prof1.getLastName());
        }
        
        prof1.display();
        
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(prof1));
        
        Person[] personArray = {s1, s2, prof1};
        ArrayList<Person> personList = new ArrayList();
        personList.add(s1);
        personList.add(s2);
        personList.add(prof1);
        
        System.out.println("Content of personList:");
        
        for(Person person : personList) {
            System.out.println(person);
        }
    }
}