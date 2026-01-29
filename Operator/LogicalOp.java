class LogicalOp
{
	/*void main()
	{
		
	}*/
	public static void main(String... args)
	{
		 int a=10, b=20, c=30;
		 IO.println((a>b) && (a>c));
		 IO.println((b>a) && (b>c));
		 System.out.println(!((c>a) && (c>b)));
		 
		 IO.println(false);
		 char l='b';
		 IO.println(l=='a'||l=='e'||l=='o'||l=='i'||l=='u');
		 
		 IO.println();
		 
		 System.out.println(!(a>b));
		 
	}
}