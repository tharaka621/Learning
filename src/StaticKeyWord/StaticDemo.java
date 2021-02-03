package StaticKeyWord;

/*
1.Static method can access only static variables and static methods directly
2.static method also access non static stuff but only through object
3.Non-Static method can access everything

 */


public class StaticDemo {

    static int a =10; // static variable
    int b = 20; //non static variable

    static void method1(){ //static method
        System.out.println("Method1 is a static method");
    }

    void method2(){ //non static method
        System.out.println("Method2 is a non static method");
    }

    public static void main(String[] args) {

        //1.Only static stuff can access since a main method is a static method
        System.out.println(a);
        method1();

        //2.static method also access non static stuff but only through object
        StaticDemo example1 = new StaticDemo();
        System.out.println(example1.b);
        example1.method2();

        //3.Non-Static method can access everything
        example1.method3();
    }

    void method3(){
        //3.Non-Static method can access everything
        System.out.println(a); //static
        System.out.println(b);//non static
        method1(); //static
        method2();//non static
    }
}
