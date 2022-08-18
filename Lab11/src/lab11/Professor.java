import java.util.ArrayList;

public class Professor extends Person
{
    private String department;
    private double salary;
    private ArrayList<Student> advisees;

    public Professor(String firstName, String lastName, int id, String department, double salary){
        super(firstName, lastName, id);
        this.department = department;
        this.salary = salary;
        this.advisees = new ArrayList<Student>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<Student> getAdvisees() {
        return this.advisees;
    }

    public void addAdvisee(Student advisee) {
        this.advisees.add(advisee);
    }
    
    public boolean removeAdvisee(int adviseeId) {
        for(Student s: this.advisees){
            if(s.getId() == adviseeId)
                return this.advisees.remove(s);
        }
        return false;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println(
            "Department: " + this.department + "\n" +
            "Salary: " + this.salary + "\n" +
            "Advisees: " + this.advisees
        );
    }
}
