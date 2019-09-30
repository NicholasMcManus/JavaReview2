/*
 * file name: Employee.java
 * programmer name: Nick McManus
 * date created: 09-26-2019
 * date of last revision: 9-30-2019
 * details of last revision: Add comments and setters
 * short description: Describe an employee
 */

package polyandinherit;

public class Employee extends Person{
    //Class variables
    private int office;
    private double salary;
    private MyDate dateHired;
    
    //Constructors
    //No Arg constructor
    public Employee()
    {
        super();
        this.office = 0;
        this.salary = 0.0;
        this.dateHired = new MyDate();
    }

    //Full argument constructor
    public Employee(int office, double salary, MyDate dateHired, String name, String address, String email, int phoneNumber) {
        super(name, address, email, phoneNumber);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    //Getters
    public int getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    //Setters
    public void setOffice(int office)
    {
        this.office = office;
    }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    //Override toString
    @Override
    public String toString() {
        return "Employee: " + this.getName();
    }
}
