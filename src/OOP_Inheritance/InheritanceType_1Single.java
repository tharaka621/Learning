package OOP_Inheritance;

class A //parent class
{
    int a;
    void display(){
        System.out.println(a);
    }
}

class B extends A //Child Class
{
    int b;
    void print(){
        System.out.println(b);
    }
}

public class InheritanceType_1Single {
    public static void main(String[] args) {
       //A only can perform A Properties
        A example1 = new A();
        example1.a=100;
        example1.display();;

        //B can perform A and B both properties
        B example2 = new B();
        example2.a=50;
        example2.b=200;
        example2.display();
        example2.print();
    }
}
