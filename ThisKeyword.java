
        //Usage of this keyword
        /*
        To refer the current object(Distinguish between local and reference variable)

        To call one method inside another method in a single class

        To call one constructor inside another in a class.
         */
class ThisKeyword{
    String name;
    int age;
    double fees;
    ThisKeyword(String name,int age,double fees){
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
        ThisKeyword e1=new ThisKeyword("Prabit",19,0);
        e1.display();
    }

}
