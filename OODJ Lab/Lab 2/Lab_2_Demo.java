import java.util.Scanner;

public class Lab_2_Demo {
    public void Feet2Metre(double feet)
    {
        double metre = feet * 0.305;
        System.out.printf("%.4f feet is equal to %.4f meters%n", feet, metre);
    }
    public static void main(String[] args) {
        // User input scanner start
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length in feet: ");//Input for user
        double feet = scanner.nextDouble();// Read the input from user
        //create object and call method
        Lab_2_Demo converter = new Lab_2_Demo();
        converter.Feet2Metre(feet);
        scanner.close();
    }
}