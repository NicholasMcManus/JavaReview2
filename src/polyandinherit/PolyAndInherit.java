/*
 * file name: PolyAndInherit.java
 * programmer name: Nick McManus
 * date created: 09-24-2019
 * date of last revision: 9-30-2019
 * details of last revision: Add test 2
 * short description: Test the accompanying methods and classes
 */

package polyandinherit;

import java.util.ArrayList;

public class PolyAndInherit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test 1
        System.out.println("Test 1: MyDate Testing");
        System.out.println(new MyDate());
        System.out.println(new MyDate(34355555133101L));
        
        //Test 2
        System.out.println("\nTest 2: Testing People and Children!");
        
        //Declare variables
        ArrayList<Person> peopleList = new ArrayList();
        
        //initialize values, no-arg constructors
        System.out.println("Creating 5 people via No Arg constructors");
        peopleList.add(new Person());
        peopleList.add(new Student());
        peopleList.add(new Employee());
        peopleList.add(new Faculty());
        peopleList.add(new Staff());
        
        //Initialize using full constructors
        System.out.println("Creating 5 people via Full Argument Constructors\n");
        peopleList.add(new Person("Billy Smith", "312 Street", "email@google.com", 1234567890));
        peopleList.add(new Student("Senior", "Cynthia Youngman", "1751 Dennison Street", "darrick1993@yahoo.com", 2096498831));
        peopleList.add(new Employee(105, 65000., new MyDate(1111068000L), "Lora Vu", "1952 Kimberly Drive", "kristina.wiso@yahoo.com", 6305993943L));
        peopleList.add(new Faculty(10, "Teacher", 210, 80000., new MyDate(1470049200000L), "Malcom Howard", "648 Argon Street", "Seth1997@hotmail.com", 3023687654L));
        peopleList.add(new Staff("Chef", 1, 75000., new MyDate(1261746000000L), "Shaun Cotton", "550 Brookview Dr.", "palma_runt4@yahoo.com", 4093823052L));
        
        //Output the values from the list
        peopleList.forEach(e -> System.out.println(e));
    }

}

/*
run:
Test 1: MyDate Testing
Oct 1, 2019
Sep 7, 3058

Test 2: Testing People and Children!
Creating 5 people via No Arg constructors
Creating 5 people via Full Argument Constructors

Person: John Doe
Student: John Doe
Employee: John Doe
Faculty: John Doe
Staff: John Doe
Person: Billy Smith
Student: Cynthia Youngman
Employee: Lora Vu
Faculty: Malcom Howard
Staff: Shaun Cotton
BUILD SUCCESSFUL (total time: 0 seconds)
*/