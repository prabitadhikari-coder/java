public class Array2DExample1 {
    public static void main(String[] args) {

        // Create a 3x4 2D array
        int[][] arr = new int[3][4];

        // Initialize index-wise (no shortcuts, assign each element manually)
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[0][3] = 40;

        arr[1][0] = 50;
        arr[1][1] = 60;
        arr[1][2] = 70;
        arr[1][3] = 80;

        arr[2][0] = 90;
        arr[2][1] = 100;
        arr[2][2] = 110;
        arr[2][3] = 120;

        // Display the array
          System.out.println("2D Array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]+" ");
            }
			System.out.println();
		}
	}
}
