public class Human {
    String name, color;
    int height, leg, hand;

    void walk() {
        System.out.println("Human can walk!");
    }

    void sleep() {
        System.out.println("Human can sleep..");
    }
}

class HumanMain {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.name = "John";
        System.out.println("Name: " + h1.name);
        System.out.println("Color: " + h1.color);

        h1.walk();
        h1.sleep();

        // Access modifier return type method name(list of argument)
        // Syntax for main method
    }
}