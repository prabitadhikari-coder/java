import java.util.Scanner;
public class Array2DExample2 {
    public static void main(String[] args) {

        // Create a 3x4 2D array
        int[][] arr = new int[3][3];
		@SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array ELement of size 9");
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]=sc.nextInt();
            }
		}
		

        // Display the array
          System.out.println("2D Array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
			System.out.println();
		}
	}
}
