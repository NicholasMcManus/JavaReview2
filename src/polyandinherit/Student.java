/*
 * file name: Student.java
 * programmer name: Nick McManus
 * date created: 09-26-2019
 * date of last revision: 9-30-2019
 * details of last revision: Add comments
 * short description: Describe a student, a child of the class person
 */

package polyandinherit;

public class Student extends Person{
    
    //Class variables
    private final String CLASS_STATUS;
    
    
    //Constructors
    //No-Argument
    public Student()
    {
        super();
        CLASS_STATUS = "Freshman";
    }

    //Full Argument
    public Student(String classStatus, String name, String address, String email, long phoneNumber) {
        super(name, address, email, phoneNumber);
        this.CLASS_STATUS = classStatus;
    }

    //Getters
    public String getClassStatus() {
        return CLASS_STATUS;
    }

    //toString Override
    @Override
    public String toString() {
        return "Student: " + this.getName();
    }
    
    
    
}
