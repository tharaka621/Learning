package SuperKeyWord_OOPInheritance;
/*

Super keyword
---------------
    1. can be used to refer immediate parent class instance variable.
    2. can be used to invoke immediate parent class method.

*/

public class Animal {
    String color = "White";

    void eat(){
        System.out.println("eating............");
    }
}

class Dog extends Animal{
    String color = "Black";

    void eat(){ //method overriding
        System.out.println("eating meat........");
        // 2. can be used to invoke immediate parent class method.
        super.eat(); //*************************
    }

    void display(){
        System.out.println(color); //black
        //1. can be used to refer immediate parent class instance variable.
        System.out.println(super.color); //****************white
    }
}

