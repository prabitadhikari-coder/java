class StringConstructors
{
	public void main(){
		
		// Empty String
		String s=new String();
		System.out.println("Empty String: "+s);
		System.out.println("Empty String Length: "+s.length());
		
		// Using Literals
		String s1=new String("Bishal");
		System.out.println("Empty String: "+s1);
		System.out.println("Empty String Length: "+s1.length());
		
		// Using char array
		char[] a={'a','e','i','o','u','l'};
		String s2=new String(a,2,3);
		System.out.println("Empty String: "+s2);
		System.out.println("Empty String Length: "+s2.length());
		
		// Using byte array
		byte[] b={100,101,102,103,104,105};
		String s3=new String(b);
		System.out.println("Empty String: "+s3);
		System.out.println("Empty String Length: "+s3.length());
		
		// Using StringBuffer class
		StringBuffer s4=new StringBuffer("Lbef College");
		String s5=new String(s4);
		System.out.println("Empty String: "+s5);
		System.out.println("Empty String Length: "+s.length());
		
		// Using StringBuilder class
		StringBuilder s6=new StringBuilder("Pcps College");
		String s7=new String(s6);
		System.out.println("Empty String: "+s7);
		System.out.println("Empty String Length: "+s7.length());
		
	}
}