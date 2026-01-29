// TestTimeArray.java

import java.sql.Time;

public class TestTimeArray {
    public static void main(String[] args) {
        // Create an array to store 5 Time objects
        Time[] timeArray = new Time[5];
        
        System.out.println("Creating Time objects with 5-second intervals:");
        
        for (int i = 0; i < timeArray.length; i++) {
            // Create a new Time object
            timeArray[i] = new Time(i);
            
            // Display the time
            System.out.println("Time " + (i + 1) + ": " + timeArray[i].toString());
            
            // Wait for 5 seconds before creating the next Time object
            if (i < timeArray.length - 1) {
                try {
                    Thread.sleep(5000); // 5000 milliseconds = 5 seconds
                } catch (InterruptedException e) {
                    System.out.println("Sleep interrupted");
                }
            }
        }
        
        // Display all times at the end
        System.out.println("\nAll Time objects in the array:");
        System.out.println("==============================");
        for (int i = 0; i < timeArray.length; i++) {
            System.out.println("Time " + (i + 1) + ": " + timeArray[i].toString());
        }
    }
}