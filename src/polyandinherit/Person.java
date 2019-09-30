/*
 * file name: Person.java
 * programmer name: Nick McManus
 * date created: 09-25-2019
 * date of last revision: 9-30-2019
 * details of last revision: Fix white space and add comments
 * short description: Describe the parent class, person
 */

package polyandinherit;

public class Person {
    //Class variables
    private String name, address, email;
    private long phoneNumber;
    
    //Constructors
    //no-argument
    public Person()
    {
        this("John Doe", "123 Somewhere St. Hometown NA", "", 1234567891);
    }
    
    //Full argument
    public Person(String name, String address, String email, long phoneNumber)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    //toString override
    @Override
    public String toString() {
        return "Person: " + name; //To change body of generated methods, choose Tools | Templates.
    }    
}

