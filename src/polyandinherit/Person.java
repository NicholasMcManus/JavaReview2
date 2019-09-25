/*
 * file name: Person.java
 * programmer name: Nick McManus
 * date created: 09-25-2019
 * date of last revision: 
 * details of last revision:
 * short description: 
 */

package polyandinherit;

public class Person {
    private String name, address, email;
    private int phoneNumber;
    
    public Person()
    {
        this("John Doe", "123 Somewhere St. Hometown NA", "", 1234567891);
    }
    
    public Person(String name, String address, String email, int phoneNumber)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}

