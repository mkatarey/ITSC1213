
public class Person
{
    private String firstName;
    private String lastName;
    private int id;
    
    public Person(){
        this.firstName = "";
        this.lastName = "";
        this.id = 0;
    }
    
    public Person(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void display() {
        System.out.println(
            "Name: " + this.firstName + " " +
            this.lastName + "\n" +
            "ID: " + this.id
        );
    }
}
