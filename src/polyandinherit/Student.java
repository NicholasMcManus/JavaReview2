/*
 * file name: Student.java
 * programmer name: Nick McManus
 * date created: 09-26-2019
 * date of last revision: 
 * details of last revision:
 * short description: 
 */

package polyandinherit;

public class Student extends Person{
    
    private final String CLASS_STATUS;
    
    public Student()
    {
        super();
        CLASS_STATUS = "Freshman";
    }

    public Student(String classStatus, String name, String address, String email, int phoneNumber) {
        super(name, address, email, phoneNumber);
        this.CLASS_STATUS = classStatus;
    }

    public String getClassStatus() {
        return CLASS_STATUS;
    }

    @Override
    public String toString() {
        return "Student: " + this.getName();
    }
    
    
    
}
