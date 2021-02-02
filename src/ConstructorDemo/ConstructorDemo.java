package ConstructorDemo;

public class ConstructorDemo {

    int x,y;

    ConstructorDemo(){ //default Constructor **********
        x =100;
        y=200;
        System.out.println(x+y);
    }


    public static void main(String[] args) {

        ConstructorDemo exampleConstructor1 = new ConstructorDemo();

    }
}
