public class ConstructorOfString {

    public static void main(String[] args) {

        // Empty String
        String s = new String();
        System.out.println("Empty String: " + s);
        System.out.println("Empty String Length: " + s.length());

        // Using String literal
        String s1 = new String("Prabit");
        System.out.println("String: " + s1);
        System.out.println("String Length: " + s1.length());

        // Using char array
        char[] a = { 'a', 'e', 'i', 'o', 'u' };
        String s2 = new String(a);
        System.out.println("String: " + s2);
        System.out.println("String Length: " + s2.length());

        // Using byte array (ASCII values)
        byte[] b = { 97, 101, 105, 111, 117 };
        String s3 = new String(b);
        System.out.println("String: " + s3);
        System.out.println("String Length: " + s3.length());

        // Using StringBuffer
        StringBuffer sb = new StringBuffer("LBEF");
        String s4 = new String(sb);
        System.out.println("String: " + s4);
        System.out.println("String Length: " + s4.length());

        // Using StringBuilder
        StringBuilder sb2 = new StringBuilder("LBEF");
        String s5 = new String(sb2);
        System.out.println("String: " + s5);
        System.out.println("String Length: " + s5.length());
    }
}
