import java.util.Scanner;

public class Lab_2_3 {
    public void SumOfDigits(int number) {
        // Check if number is within valid range
        if (number < 0 || number > 1000) {
            System.out.println("Enter a number between 0 and 1000.");
            return;
        }
        int sum = 0;
        int temp = number;
        
        // Calculate sum of digits
        while (temp > 0) {
            sum += temp % 10;  // Get last digit
            temp /= 10;        // Remove last digit
        }
        
        System.out.printf("Sum of digits of %d is: %d%n", number, sum);
    }
    
    public static void main(String[] args) {
        // User input scanner start
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 1000: "); // Input for user
        int number = scanner.nextInt();// Read the input from user
        // Create an instance of the class to call the instance method
        Lab_2_3 calculator = new Lab_2_3();
        calculator.SumOfDigits(number);
        
        // Close the scanner
        scanner.close();
    }
}