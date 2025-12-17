public class start_str {
    public static void main(String... args) {
        String s1="LBEF COLLEGE";
        System.out.println(s1);
        //String object is immutable but if we try to change an existing object, with those object a new object is created.
        s1=s1.concat(" MAITIDEVI");
        System.out.println(s1);
    }
}
