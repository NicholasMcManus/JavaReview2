/*
 * file name: Staff.java
 * programmer name: Nick McManus
 * date created: 09-26-2019
 * date of last revision: 
 * details of last revision: Write the staff class
 * short description: Describe a class, which is the child of an employee
 */

package polyandinherit;

public class Staff extends Employee{
    //Class variables
    private String title;
    
    //Constructors
    //No Argument Constructor
    public Staff() {
        super();
        title = "Intern";
    }

    //Full Argument Construtor
    public Staff(String title, int office, double salary, MyDate dateHired, String name, String address, String email, int phoneNumber) {
        super(office, salary, dateHired, name, address, email, phoneNumber);
        this.title = title;
    }
    
    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    //Override toString
    @Override
    public String toString() {
        return "Staff: " + this.getName();
    }
}
