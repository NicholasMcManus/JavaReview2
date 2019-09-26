/*
 * file name: Employee.java
 * programmer name: Nick McManus
 * date created: 09-26-2019
 * date of last revision: 
 * details of last revision:
 * short description: 
 */

package polyandinherit;

public class Employee extends Person{
    private int office;
    private double salary;
    private MyDate dateHired;
    
    public Employee()
    {
        super();
        this.office = 0;
        this.salary = 0.0;
        this.dateHired = new MyDate();
    }

    public Employee(int office, double salary, MyDate dateHired, String name, String address, String email, int phoneNumber) {
        super(name, address, email, phoneNumber);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public int getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + this.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
