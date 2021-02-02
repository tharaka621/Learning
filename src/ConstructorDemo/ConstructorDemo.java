package ConstructorDemo;

public class ConstructorDemo {

    int x,y;

    /*
    ConstructorDemo(){ //default Constructor **********
        x =100;
        y=200;
        System.out.println(x+y);
    }
     */

    ConstructorDemo(int a, int b){ //Parameterized Constructor **********
        x =a;
        y=b;
        System.out.println(x+y);
    }

    public static void main(String[] args) {

        //ConstructorDemo exampleConstructor1 = new ConstructorDemo(); //for default constructor
        ConstructorDemo exampleConstructor2 = new ConstructorDemo(123,432); //for Parameterized constructor

    }
}
