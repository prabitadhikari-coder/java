import java.io.*;
class BufferedExample
{
	void main() throws Exception
	{
		InputStreamReader s = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(s);
		System.out.print("Enter 1st number: ");
		int a=Integer.parseInt(br.readLine());
	
		System.out.print("Enter 2nd number: ");
		int b=Integer.parseInt(br.readLine());

		System.out.println("Sum: "+(a+b));
	}
}