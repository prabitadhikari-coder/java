class MethodOverloading {

    // show()
    void show() {
        System.out.println("show() method called");
    }

    // show(int a)
    void show(int a) {
        System.out.println("show(int a) method called: a = " + a);
    }

    // show(float a)
    void show(float a) {
        System.out.println("show(float a) method called: a = " + a);
    }

    // show(int a, int b)
    void show(int a, int b) {
        System.out.println("show(int a, int b) method called: a = " + a + ", b = " + b);
    }

    // show(int a, double b)
    void show(int a, double b) {
        System.out.println("show(int a, double b) method called: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.show();
        obj.show(10);
        obj.show(5.5f);
        obj.show(20, 30);
        obj.show(15, 7.5);
        obj.show();
    }
}
