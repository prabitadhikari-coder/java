import java.util.Scanner;
public class Array2DExample3 {
    public static void main(String[] args) {

        // Create a 3x* 2D array
        int[][] arr = new int[3][];
		arr[0]=new int[5];
		arr[1]=new int[1];
		arr[2]=new int[2];
		@SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array ELement");
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
		}
		

        // Display the array
          System.out.println("2D Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
			System.out.println();
		}
	}
}
