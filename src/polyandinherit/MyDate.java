/*
 * file name: MyDate.java
 * programmer name: Nick McManus
 * date created: 09-25-2019
 * date of last revision: 09-25-2019
 * details of last revision: 
 * short description: Create a class to describe a date object
 */
package polyandinherit;

public class MyDate {

    private int year = 1970, month = 0, day = 0;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long mSeconds) {
        longToDate(mSeconds);
    }

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

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    
    @Override
    public String toString()
    {
        String[] monthsWritten = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        
        return monthsWritten[month] + " " + day + ", " + year;
    }
}
