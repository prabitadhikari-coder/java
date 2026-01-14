class Human
{
	String name="Dikshita",color="WHite";
	int height=5,leg,hand;
	
	void walk()
	{
		System.out.println("human can walk..");
	}
	void eat()
	{
		System.out.println("human can eat..");
	}
	void sleep()
	{
		System.out.println("human can sleep..");
	}
	void dance()
	{
		System.out.println("human can dance..");
	}
}
class HumanMain{
	public static void main(String... args)
	{
		Human h1=new Human();
		h1.name="Laptop";
		System.out.println("Name: "+h1.name);
		System.out.println("Height: "+h1.height);
		
		h1.sleep();
	}
}






