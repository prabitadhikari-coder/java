import java.util.Scanner;
public class controlSta {
    //Control statements
    /*
    Selection Statement

    if statement
        simple if
        if else
        if else if else
        nested if

    Switch case


    Looping/Iterative
    
    While loop
        normal while loop
        do while loop

    For loop
        normal for loop
        for each loop



    Jumping statement/Transfer
        Break
        Continue
    
    */
   public class ResultWithDistinction {
    public static void main(String[] args) {

        // Default marks
        int s1 = 85;
        int s2 = 78;
        int s3 = 92;
        int s4 = 88;
        int s5 = 81;

        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5.0;

        System.out.println("Marks:");
        System.out.println("Subject 1: " + s1);
        System.out.println("Subject 2: " + s2);
        System.out.println("Subject 3: " + s3);
        System.out.println("Subject 4: " + s4);
        System.out.println("Subject 5: " + s5);

        System.out.println("\nTotal = " + total);
        System.out.println("Percentage = " + percentage + "%");

        // Pass condition: all subjects must be >= 40
        if (s1 >= 40 && s2 >= 40 && s3 >= 40 && s4 >= 40 && s5 >= 40) {
            System.out.println("Result: PASS");

            if (percentage >= 80)
                System.out.println("Grade: DISTINCTION");
            else if (percentage >= 60)
                System.out.println("Grade: FIRST DIVISION");
            else if (percentage >= 50)
                System.out.println("Grade: SECOND DIVISION");
            else
                System.out.println("Grade: THIRD DIVISION");

        } else {
            System.out.println("Result: FAIL");
        }
    }
}


//Switch case
public class ResultSwitchCase {
    public static void main(String[] args) {

        // Default marks
        int s1 = 85;
        int s2 = 78;
        int s3 = 92;
        int s4 = 88;
        int s5 = 81;

        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5.0;

        System.out.println("Marks:");
        System.out.println("Subject 1: " + s1);
        System.out.println("Subject 2: " + s2);
        System.out.println("Subject 3: " + s3);
        System.out.println("Subject 4: " + s4);
        System.out.println("Subject 5: " + s5);

        System.out.println("\nTotal = " + total);
        System.out.println("Percentage = " + percentage + "%");

        // Pass/Fail check
        if (s1 >= 40 && s2 >= 40 && s3 >= 40 && s4 >= 40 && s5 >= 40) {
            System.out.println("Result: PASS");

            // Convert percentage to a grade code
            int gradeCode;

            if (percentage >= 80)
                gradeCode = 1;        // Distinction
            else if (percentage >= 60)
                gradeCode = 2;        // First Division
            else if (percentage >= 50)
                gradeCode = 3;        // Second Division
            else
                gradeCode = 4;        // Third Division

            // Switch block
            switch (gradeCode) {
                case 1:
                    System.out.println("Grade: DISTINCTION");
                    break;

                case 2:
                    System.out.println("Grade: FIRST DIVISION");
                    break;

                case 3:
                    System.out.println("Grade: SECOND DIVISION");
                    break;

                case 4:
                    System.out.println("Grade: THIRD DIVISION");
                    break;

                default:
                    System.out.println("Invalid grade");
            }

        } else {
            System.out.println("Result: FAIL");
        }


        //Menu Driven


        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int a = 20;   // default number 1
        int b = 10;   // default number 2
        int choice;

        System.out.println("==== Arithmetic Menu ====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition = " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("Division = " + (a / b));
                else
                    System.out.println("Cannot divide by zero!");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
    }
}

