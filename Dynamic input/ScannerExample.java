import java.util.Scanner;

class ScannerExample {
	@SuppressWarnings("resource")
	void main() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = s.nextInt();
		s.nextLine();
		System.out.print("Enter Your name: ");
		String name = s.nextLine();

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}