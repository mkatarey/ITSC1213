import java.util.ArrayList;
public class Student extends Person
{

    private String major;
    private double gpa;
    private int credits;
    private double balance;
    private boolean transfer;
    private ArrayList<String> enrolledCourses;

    public Student(String firstName, String lastName, int id, String major, double gpa, int credits){
        super(firstName, lastName, id);
        this.major = major;
        this.gpa = gpa;
        this.credits = credits;
        this.balance = 0.0;
        this.transfer = false;
        this.enrolledCourses = new ArrayList<String>();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isTransfer() {
        return transfer;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    public ArrayList<String> getEnrolledCourses() {
        return this.enrolledCourses;
    }

    public void addCourse(String course) {
        this.enrolledCourses.add(course);
    }
    
    public boolean dropCourse(String course) {
        return this.enrolledCourses.remove(course);
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println(
            "Major: " + this.major + "\n" +
            "Credits: " + this.credits + "\n" +
            "Balance: " + this.balance + "\n" +
            "isTransfer: " + this.transfer + "\n" + 
            "Enrolled Courses: " + this.enrolledCourses
        );
    }
    
    @Override
    public String toString() {
        return super.getId() + " - " + super.getFirstName() + " " + super.getLastName();
    }
}
