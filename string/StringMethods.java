class StringMethods {
	@SuppressWarnings("unused")
	public void main() {
		String s = new String("Bishal KPatel from Kathmandu Lbef College");
		String s1 = s.toLowerCase();
		String s2 = s.toUpperCase();
		String city = s.substring(18, 27);
		System.out.println("index of K: " + s.indexOf('K', 8, s.length()));
		System.out.println("index of K: " + s.charAt(5));

		String s5 = "Bishal";
		String s6 = "BISHAL";
		System.out.println("s5 and s6 are same: " + s5.equals(s6));
		System.out.println("s5 and s6 are same: " + s5.equalsIgnoreCase(s6));

	}
}