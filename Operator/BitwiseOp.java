

class BitwiseOp {
	public static void main(String... args) {

		IO.println(5 & 6);
		IO.println(5 | 6);
		System.out.println(5 ^ 6);
		System.out.println(10 << 3);
		System.out.println(-10 << 3);
		System.out.println(10 >> 2);
		System.out.println(-10 >> 2);
		System.out.println(10 >>> 2);
		System.out.println(-10 >>> 2);
		System.out.println(~10);
		System.out.println(~-10);
	}
}