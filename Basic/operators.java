
public class operators {
    public static void main(String... args) {
        //Operators used in java
        /*
         * 1. uninary operators
         * -increment(++)
         * -decrement(--)
         * -negation(')
         * 
         * 
         *  
         * 2. Binary operators
         * -Arithmetic operators(+,-,*,/,% etc...)
         * 
         * 3. Logical operators
         * - AND(&&)
         * - OR(||)
         * - NOT(!)
         */
        //uninary operators
        //Binary operators
        //Logical operators
        int a=10, b=20, c=30;
        System.out.println((a>b)&&(a>c));
        System.out.println((b>a)&&(b>c));
        System.out.println((c>b)&&(c>a));

        char l= 'i';
        System.out.println(l=='a'||l=='e'||l=='i'||l=='o'||l=='u');

        System.out.println(a > b);
    }
}
