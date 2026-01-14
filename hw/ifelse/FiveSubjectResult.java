import java.util.Scanner;

public class FiveSubjectResult {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks of Subject 1: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        double s2 = sc.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        double s3 = sc.nextDouble();

        System.out.print("Enter marks of Subject 4: ");
        double s4 = sc.nextDouble();

        System.out.print("Enter marks of Subject 5: ");
        double s5 = sc.nextDouble();

        // Calculate total and percentage
        double total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5;

        // Determine result
        boolean pass = (s1 >= 40 && s2 >= 40 && s3 >= 40 && s4 >= 40 && s5 >= 40);

        // Output
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (pass) {
            System.out.println("Status: PASS");
        } else {
            System.out.println("Status: FAIL");
        }
    }
}