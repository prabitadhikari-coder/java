import java.util.Scanner;

class Array1DExample1 {
	@SuppressWarnings("resource")
	public static void main(String... args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element of Size: " + a.length);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(a); // [I@251a69d7
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(a.getClass().getName());

	}
}