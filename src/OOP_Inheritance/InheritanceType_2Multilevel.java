package OOP_Inheritance;

class A2 //parent class
{
    int a;
    void display(){
        System.out.println(a);
    }
}

class B2 extends A2 //Child Class
{
    int b;
    void print(){
        System.out.println(b);
    }
}

class C2 extends B2 //Child class of B
{
    int c;
    void show(){
        System.out.println(c);
    }
}

public class InheritanceType_2Multilevel {
    public static void main(String[] args) {
        //A only can perform A Properties
        A2 example1 = new A2();
        example1.a=100;
        example1.display();;

        //B can perform A and B both properties
        B2 example2 = new B2();
        example2.a=50;
        example2.b=200;
        example2.display();
        example2.print();

        //C can perform A, B and C properties
        C2 example3 = new C2();
        example3.a=5;
        example3.display();
        example3.b=10;
        example3.print();
        example3.c=15;
        example3.show();
    }
}
