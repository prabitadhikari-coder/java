public class StringMethod {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String s = new String("I live in Kathmandu.");
        String s1 = s.toLowerCase();
        String s2 = s.toUpperCase();
        String city = s.substring(10, 19);
        System.out.println(("Index of K: " + s.indexOf('K')));
        System.out.println(("Index of K: " + s.charAt(5)));

        String s5 = "Prabit";
        String s6 = "prabit";
        System.out.println("Are they Same?  " + s5.equals(s6));
        System.out.println("Are they Same?  " + s5.equalsIgnoreCase(s6));
    }
}
