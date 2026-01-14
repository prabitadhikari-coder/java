public class GradeCheck {
    public static void main(String[] args) {

        int per = 75;

        if (per >= 90)
            System.out.println("A+");
        else if (per >= 80)
            System.out.println("A");
        else if (per >= 70)
            System.out.println("B");
        else if (per >= 60)
            System.out.println("C");
        else if (per >= 50)
            System.out.println("D");
        else
            System.out.println("Fail");
    }
}
