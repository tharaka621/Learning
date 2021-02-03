package Methods;
/*
Rewrite the methods in child classes
    1. method definition should be same
    2. boy should be changed

 Overloading:
           1.Within a single class & multiple classes (Inheritance)
           2.definition should be changed

 Overriding:
            1.only in inheritance (multiple classes)
            2.definition should NOT be changed
 */

class Bank {   //Parent Class ************
    double rateOfInterest(){

        return 0;
    }
}

class NSB extends Bank{
    double rateOfInterest(){
        return 10.5;
    }
}

class BOC extends Bank{
    double rateOfInterest(){
        return 12.5;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        NSB customer01 = new NSB();
        System.out.println(customer01.rateOfInterest());

        BOC customer02 = new BOC();
        System.out.println(customer02.rateOfInterest());
    }
}
//should change only the body
