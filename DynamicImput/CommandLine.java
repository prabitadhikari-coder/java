public class CommandLine {
    public static void main(String[] args) {
		System.out.println("args Length: "+args.length);
        System.out.println(args[0]);
		System.out.println(args[1]);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("Sum: "+(a+b));
		System.out.println("args Element");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		
    }
}
