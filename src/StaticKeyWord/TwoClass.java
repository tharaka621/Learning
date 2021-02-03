package StaticKeyWord;

public class TwoClass {


        static int a =10; // static variable
        int b = 20; //non static variable

        static void method1(){ //static method
            System.out.println("Method1 is a static method");
        }

        void method2(){ //non static method
            System.out.println("Method2 is a non static method");
        }

        void method3(){
        //3.Non-Static method can access everything
        System.out.println(a); //static
        System.out.println(b);//non static
        method1(); //static
        method2();//non static
    }


}
