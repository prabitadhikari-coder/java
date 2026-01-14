class MainMethodOverloading {

    // Overloaded main method with int parameter
    public static void main(int a) {
        System.out.println("Overloaded main method with int: " + a);
    }

    // Overloaded main method with String parameter
    public static void main(String message) {
        System.out.println("Overloaded main method with String: " + message);
    }
	public static void main(double a)
	{
		System.out.println("Overloaded main method with double: " + a);
	}
	public static void main(String... args)
	{
		MainMethodOverloading.main(10);
		MainMethodOverloading.main("Bishal");
	}
}
