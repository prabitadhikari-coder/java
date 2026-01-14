import java.util.Scanner;

public class Lab_2_2 {
    public void av(double l, double r) {
        double a = r*r*3.1415;
        double v = a*l;
        System.out.printf("The Cross-sectional area is: %.4f%n", a);
        System.out.printf("The volume is: %.4f%n", v);
    }
    public static void main(String[] args) {
        // User input scanner start
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length/height of a cylinder: "); // Input for user
        double length = scanner.nextDouble();
        System.out.print("Enter the radius of a cylinder: "); // Input for user
        double radius = scanner.nextDouble();
        Lab_2_2 converter = new Lab_2_2();// create an object for method
        converter.av(length, radius);
        scanner.close();
    }
}