package ConstructorDemo;

public class ConstructorDemo {

    int x,y,z;


    ConstructorDemo(){ //default Constructor **********
        x =100;
        y=200;
        System.out.println(x+y);
    }


    ConstructorDemo(int a, int b){ //Parameterized Constructor **********
        x =a;
        y=b;
        System.out.println(x+y);
    }

    ConstructorDemo(int a, int b,int c){ //Parameterized Constructor with different parameters **********
        x =a;
        y=b;
        z=c;
        System.out.println(x+y+z);
    }

    public static void main(String[] args) {

        ConstructorDemo exampleConstructor1 = new ConstructorDemo(); //for default constructor
        ConstructorDemo exampleConstructor2 = new ConstructorDemo(123,432); //for Parameterized constructor
        ConstructorDemo exampleConstructor3 = new ConstructorDemo(123,432,34);
    }
}

/*
Overloading Constructor : Same Constructor is using in the same class
*******can make several Constructors. But the Constructor parameters or data types should be different.
******* Cant make two DEFAULT CONSTRUCTOR
 */