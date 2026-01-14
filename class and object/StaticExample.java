class StaticExample {
	String name, address, email;
	int age, id;
	static String college;

	public void display() {
		System.out.println("Student Name: " + name);
		System.out.println("Student ID: " + id);
		System.out.println("Student Age: " + age);
		System.out.println("Student address: " + address);
		System.out.println("Student email: " + email);
		System.out.println("Student College: " + college);
	}

	@SuppressWarnings("static-access")
	public static void main(String... args) {
		StaticExample.college = "LBEF";
		StaticExample s1 = new StaticExample();
		s1.name = "Dikshita Shrestha";
		s1.address = "Boudha";
		s1.email = "dikshita.shrestha@gmail.com";
		s1.age = 22;
		s1.id = 501;
		StaticExample s2 = new StaticExample();
		s2.name = "Matina Shrestha";
		s2.address = "Swoyambhu";
		s2.email = "matina.shrestha@gmail.com";
		s2.age = 21;
		s2.id = 502;

		s1.display();
		s2.display();

		System.out.println(s1.name);
		System.out.println(s1.college);

	}
}
