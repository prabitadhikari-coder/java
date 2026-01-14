
        //Usage of this keyword
        /*
        To refer the current object(Distinguish between local and reference variable)

        To call one method inside another method in a single class

        To call one constructor inside another in a class.(constructor chaining)
         */
class ThisKeyword2{
    String name;
    int age;
    double fees;
    ThisKeyword2(){
        System.out.println("Default Constructor");
    }
    ThisKeyword2(String name){
        this();
        this.name=name;
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.fees);
    }
    ThisKeyword2(String name,int age,double fees){
        this("Bishal");
        this.name=name;
        this.age=22;
        this.fees=22000;
    }
    public void display()
    {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.fees);
    }
    public static void main(String[] args) {
        ThisKeyword2 t=new ThisKeyword2("Prabit",19,0);
        t.display();
    }

}

