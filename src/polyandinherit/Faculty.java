/*
 * file name: Faculty.java
 * programmer name: Nick McManus
 * date created: 09-26-2019
 * date of last revision: 9/26/2019
 * details of last revision: Create and add comments
 * short description: Describe a faculty
 */

package polyandinherit;

public class Faculty extends Employee{
    
    //Declare variables
    private double officeHours;
    private String rank;

    //Constructors
    public Faculty() {
        this.officeHours = 0;
        this.rank = "Janitor";
    }

    public Faculty(double officeHours, String rank, int office, double salary, MyDate dateHired, String name, String address, String email, int phoneNumber) {
        super(office, salary, dateHired, name, address, email, phoneNumber);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    //Getters and Setters
    public double getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    //Override the toString method
    @Override
    public String toString() {
        return "Faculty: " + this.getName(); 
    }
}
