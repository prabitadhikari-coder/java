public class arrayadd {
    public static void main(String[] args) {

        // 2D array storing two 1D arrays
        int[][] arr = {
            {1, 2, 3, 4, 5},   // first array
            {6, 7, 8, 9, 10}   // second array
        };

        int size = arr[0].length;
        int[] result = new int[size];

        // Add the two 1D arrays stored inside arr
        for (int i = 0; i < size; i++) {
            result[i] = arr[0][i] + arr[1][i];
        }

        // Display the result
        System.out.print("Resultant Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
