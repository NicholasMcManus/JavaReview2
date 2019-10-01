/*
 * file name: MyDate.java
 * programmer name: Nick McManus
 * date created: 09-25-2019
 * date of last revision: 09-30-2019
 * details of last revision: Add setDate(Long) method
 * short description: Create a class to describe a date object
 */
package polyandinherit;

public class MyDate {

    //Initialize class variables
    private int year = 1970, month = 0, day = 0;
    public static final String[] MONTHS_WRITTEN = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    
    //Constructors
    //No-Arg Constructor
    public MyDate() {
        this(System.currentTimeMillis());
    }

    //Full arg constructor
    public MyDate(long mSeconds) {
        longToDate(mSeconds);
    }
    
    //Add constructor using day, month, and year
    public MyDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Setters
    public void setDate(long milliseconds)
    {
        this.longToDate(milliseconds);
    }
    
    //Useful internal method
    private void longToDate(long milliseconds) {
        
        //Declare variables
        int[] monthOfYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        double seconds = Math.floor(milliseconds / 1000.0);
        double minutes = Math.floor(seconds / 60.0);
        double hours = Math.floor(minutes / 60.0);
        day = (int) Math.ceil(hours / 24.0);

        
        //Calculate the current 
        while (day > monthOfYear[month]) {
            day -= monthOfYear[month];

            //With leap year calculation, we are off by 1 day
            //Fixed by rounding days up insetead of floor
            //Without: 20 Days
            if (month == 1) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) //System.out.print('{} is a leap year'.format(years))
                {
                    day -= 1;
                }
            }

            if (++month == 12) {
                month = 0;
                year += 1;
            }
        }
    }

    //Getters
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    //Setters
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    //Override toString
    @Override
    public String toString()
    {      
        return MONTHS_WRITTEN[month] + " " + day + ", " + year;
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