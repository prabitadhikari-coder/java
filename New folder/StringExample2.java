class StringExample2
{
	public static void main(String... args){
		String s1 = new String("Lbef");
		String s2 = new String("Lbef");
		String s3="Lbef";
		String s4="Lbef";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
	}
	
}