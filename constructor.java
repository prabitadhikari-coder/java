public class constructor {
    public static void main(String[] args) {
        // Constructor in java
        // We cannot expect any class without constructor
        // Constructor Overloading
        /*
        
         */
    }
}

class Student {
    String name, mail;
    int age;

    public Student() {
        System.out.println("Default Constructor");
    }

    public Student(int i, String string, int j) {

    }

    public Student(int i, String string) {

    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Mail: " + mail);
        System.out.println("Age: " + age);
    }
}

class StudentMain {
    public static void main(String[] args) {
        Student h1 = new Student();
        h1.name = "Prabit";
        h1.age = 19;
        h1.mail = "prabitadhikari@gmail.com";
        h1.display();

        Student h2 = new Student();
        h2.name = "Prabit";
        h2.age = 19;
        h2.mail = "prabitadhikari@gmail.com";
        h2.display();

        Student h3 = new Student();
        h3.name = "Prabit";
        h3.age = 19;
        h3.mail = "prabitadhikari@gmail.com";
        h3.display();
    }
}
class Studento {
    int id;
    String name;
    int age;

    // Constructor with no parameters
    Studento() {
        id = 0;
        name = "Unknown";
        age = 0;
    }

    // Constructor with two parameters
    Studento(int i, String n) {
        id = i;
        name = n;
        age = 18;
    }

    // Constructor with three parameters
    Studento(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Ram");
        Student s3 = new Student(102, "Sita", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}
class Book {
    String title;
    int price;

    Book() {
        this("No Title", 0);
    }

    Book(String t) {
        this(t, 100);
    }

    Book(String t, int p) {
        title = t;
        price = p;
    }

    void show() {
        System.out.println(title + " - Rs." + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming");
        Book b3 = new Book("Python", 350);

        b1.show();
        b2.show();
        b3.show();
    }
}
class BankAccount {
    int accNo;
    String name;
    double balance;

    BankAccount(int a) {
        accNo = a;
        name = "Unknown";
        balance = 0;
    }

    BankAccount(int a, String n) {
        accNo = a;
        name = n;
        balance = 0;
    }

    BankAccount(int a, String n, double b) {
        accNo = a;
        name = n;
        balance = b;
    }

    void display() {
        System.out.println(accNo + " " + name + " " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001);
        BankAccount acc2 = new BankAccount(1002, "Hari");
        BankAccount acc3 = new BankAccount(1003, "Gita", 5000);

        acc1.display();
        acc2.display();
        acc3.display();
    }
}
class Demo {
    Demo() {
        System.out.println("Default Constructor");
    }

    Demo(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new Demo();
        new Demo(10);
    }
}

