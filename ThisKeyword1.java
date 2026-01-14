
        //Usage of this keyword
        /*
        To refer the current object(Distinguish between local and reference variable)

        To call one method inside another method in a single class

        To call one constructor inside another in a class.
         */
class ThisKeyword1{
    String name;
    int age;
    double fees;
    ThisKeyword1(String name,int age,double fees){
        this.name=name;
        this.age=22;
        this.fees=22000;
    }
        public void m1(){
        this.m2();
        System.out.println("This method is: M1");
    }
    public void m2(){
        this.m3();
        System.out.println("This method is: M2");
    }
    public void m3(){
        System.out.println("This method is: M3");
    }
    public static void main(String[] args) {
    ThisKeyword1 t = new ThisKeyword1("Ram", 25, 35000);
    System.out.println("Name: " + t.name);
    System.out.println("Age: " + t.age);
    System.out.println("Fees: " + t.fees);
    t.m1();
}
    }
