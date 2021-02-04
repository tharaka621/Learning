package OOP_Inheritance;
/*
                B1(child)
  A(parent)                     C(grand-child)
                B2(child)

        A = class or interface
        B = Interface
        C = class
 */

class A1Parent{  //parent class
    void methodA1(){
        System.out.println("Method From A1 Parent Class");
    }
}

interface B1Child{  //child interface
    void methodB1(); //default method
}

interface B2Child{  //child interface
    void methodB2(); //default method
}

public class InheritanceType_5Hybrid extends A1Parent implements B1Child,B2Child { //grand-child class

    public void methodB1(){ //implementing the method
        System.out.println("Method From B1 Child Interface");
    }

    public void methodB2(){ //implementing the method
        System.out.println("Method From B2 Child Interface");
    }

    public static void main(String[] args) {

        InheritanceType_5Hybrid example01 = new InheritanceType_5Hybrid();
        example01.methodA1();
        example01.methodB1();
        example01.methodB2();
    }
}
