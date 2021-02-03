package OOP_Inheritance;

class Parent
{
    int a;
    void display(){
        System.out.println("Parent Class");
        System.out.println(a);
    }
}

class Child_1 extends Parent
{
    int x;
    void show(){
        System.out.println("Child 01 Class");
        System.out.println(x);
    }
}

class Child_2 extends Parent
{
    int y;
    void show(){
        System.out.println("Child 02 Class");
        System.out.println(y);
    }
}

public class InheritanceType_3Hierarchy {
    public static void main(String[] args) {

        //can perform parent class properties
        Child_1 child1 = new Child_1();
        child1.x=10;
        child1.a=5;
        child1.display();
        child1.show();

        //can perform parent class properties
        Child_2 child2 = new Child_2();
        child2.y=20;
        child2.a=5;
        child2.display();
        child2.show();
    }
}
