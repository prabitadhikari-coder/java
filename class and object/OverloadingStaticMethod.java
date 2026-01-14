class OverloadingStaticMethod {

    // show()
    static void show() {
        System.out.println("No parameters");
    }

    // show(int a)
    static void show(int a) {
        System.out.println("Integer value: " + a);
    }

    // show(float a)
    static void show(float a) {
        System.out.println("Float value: " + a);
    }

    // show(int a, int b)
    static void show(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    // show(int a, double b)
    static void show(int a, double b) {
        System.out.println("Integer: " + a + ", Double: " + b);
    }

    public static void main(String[] args) {

        // Static reference (calling using class name)
        OverloadingStaticMethod.show();
        OverloadingStaticMethod.show(10);
        OverloadingStaticMethod.show(5.5f);
        OverloadingStaticMethod.show(20, 30);
        OverloadingStaticMethod.show(15, 25.75);
    }
}
