
public class SignedShift {
    public static void main(String... args) {
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5^6);
        System.out.println(10<<2);
        System.out.println(-10<<2);
        System.out.println(10>>2);
        System.out.println(-10>>2);
        System.out.println(10>>>2);
        System.out.println(-10>>>2);
        System.out.println(~10);
        System.out.println(~-10);
        /*
         * Difference of >>> and >>
         * In Java, both >> and >>> are right shift operators, but they differ in how they handle the sign bit during the shift operation:
1. Signed Right Shift (>>)
Preserves the sign bit: When shifting bits to the right, the most significant bit (MSB), which represents the sign (0 for positive, 1 for negative in two's complement), is copied into the newly vacated positions on the left.
Arithmetic shift: It behaves as an arithmetic right shift, meaning it effectively divides the number by powers of two while maintaining the sign.
Example: Shifting a negative number right will continue to fill the leftmost bits with 1s, keeping the number negative. Shifting a positive number right will fill the leftmost bits with 0s, keeping it positive.
2. Unsigned Right Shift (>>>)
Does not preserve the sign bit: When shifting bits to the right, the newly vacated positions on the left are always filled with 0s, regardless of the original sign of the number.
Logical shift: It behaves as a logical right shift, treating the number as an unsigned value.
Example: Shifting a negative number right using >>> will eventually result in a positive number because the 0s filled on the left will change the sign bit from 1 to 0.
In essence:
>> is used when you want to perform a right shift that maintains the sign of the number.
>>> is used when you want to perform a right shift that treats the number as unsigned and fills with zeros, effectively making a negative number positive if shifted enough.
         */
    }
}
