import java.util.Scanner;

public class Lab_2_1 {
    public void F2C(double f) {
        double c = (f - 32) * 5 / 9;
        System.out.printf("%.4f Fahrenheit is equal to %.4f Celsius%n", f, c);
    }
    
    public static void main(String[] args) {
        // User input scanner start
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit scale: "); // Input for user
        double fahrenheit = scanner.nextDouble();// Read the input from user
        Lab_2_1 converter = new Lab_2_1();// create an object for method
        converter.F2C(fahrenheit);
        scanner.close();
    }
}