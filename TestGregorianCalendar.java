import java.util.GregorianCalendar;

public class TestGregorianCalendar {
    public static void main(String[] args) {
        // Create a GregorianCalendar object for current date
        GregorianCalendar calendar = new GregorianCalendar();
        
        // Get year, month and day
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // Month is 0-based
        int day = calendar.get(GregorianCalendar.DATE);
        
        // Display the current date
        System.out.println("Current Date:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        
        // Display in MM/DD/YYYY format
        System.out.printf("Date (MM/DD/YYYY): %02d/%02d/%d\n", month, day, year);
    }
}

/*
SAMPLE OUTPUT (will vary based on current date):
Current Date:
Year: 2024
Month: 11
Day: 12
Date (MM/DD/YYYY): 11/12/2024

NOTE: If run on January 5th, 2025:
Current Date:
Year: 2025
Month: 1
Day: 5
Date (MM/DD/YYYY): 01/05/2025
*/