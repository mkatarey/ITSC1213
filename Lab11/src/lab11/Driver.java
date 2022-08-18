import java.util.*;

public class Driver
{
    public static void main(String [] args) {
        Person p1 = new Person("Raya", "Whitaker", 800555555);
        p1.display();
        
        Student s1 = new Student("Xavier", "Cato", 900111222, "CS", 3.5, 75);
        s1.setTransfer(true);
        s1.setBalance(100);
        s1.addCourse("Java Programming");
        s1.addCourse("Calculus");
        
        // System.out.println(s1.isTransfer());
        // System.out.println(s1.getBalance());
        // System.out.println(s1.getCredits());
        // System.out.println(s1.getEnrolledCourses());
        // System.out.println(s1.dropCourse("Calculus"));
        // System.out.println(s1.dropCourse("J"));
        // System.out.println(s1.getEnrolledCourses());
        
        s1.display();
        
        Student s2 = new Student("Katherine", "Johnson", 900, "CS", 4.0, 100);
        Student s3 = new Student("Roy", "Clay", 901, "Biology", 3.2, 85);
        Student s4 = new Student("Kimberly", "Bryant", 902, "Electrical Engineering", 3.0, 80);
        Professor prof1 = new Professor("Mary", "Castro", 300, "CS", 80000);
        prof1.addAdvisee(s2);
        prof1.addAdvisee(s3);
        prof1.addAdvisee(s4);
        prof1.display();
        // System.out.println(prof1.getSalary());
        // System.out.println(prof1.getDepartment());
        // System.out.println(prof1.getAdvisees());
        // System.out.println(prof1.removeAdvisee(900));
        // System.out.println(prof1.removeAdvisee(5));
        // System.out.println(prof1.getAdvisees());
        if (prof1.removeAdvisee(902)) {
            System.out.println("The advisee has been removed");
        } else {
            System.out.println("This student is not an advisee of Professor " 
                + prof1.getFirstName() + " " + prof1.getLastName());
        }
        
        ArrayList<Person> list = new ArrayList();
        
        list.add(p1);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(prof1);
        
        Person p2 = new Person("Elle", "Kambol", 800);
        list.add(p2);
        
        Professor prof2 = new Professor("Frank", "Black", 801, "Math", 85000);
        list.add(prof2);
        
        Student s5 = new Student("Grace", "Maxeem", 903, "Psychology", 3.4, 95);
        list.add(s5);
        
        for (Person person : list) {
            person.display();
        }
        
        for (Person person : list) {
            matchId(person, 903);
        }
        
        /*
        Person p3 = new Student("Maya", "Adams", 700, "Music", 3.5, 105);
        System.out.println(((Student)p3).getGpa());
        
        Person p4 = new Person("Bob", "Lowe", 701);
        if (p4 instanceof Student) {
            System.out.println(((Student)p4).getGpa());
        }
        */
        
        System.out.println("*** Part F ***");
        System.out.println("Students eligible for scholarship: ");
        for (Person person : list) {
            if (person instanceof Student && ((Student) person).getGpa() > 3.5) {
                System.out.println("\t" + person.getFirstName() + " " + person.getLastName());
            }
        }
        System.out.println("Professors in CS: ");
        for (Person person : list) {
            if (person instanceof Professor && ((Professor) person).getDepartment().equals("CS")) {
                System.out.println("\t" + person.getFirstName() + " " + person.getLastName());
            }
        }
    }
    
    public static boolean matchId(Person p, int id) {
        if (p.getId() == id) {
            return true;
        }
        else {
            return false;
        }
    }
}
