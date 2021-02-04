package Interface;
/*
Interface
-----------
        1.Interface in java is a blueprint of a class
        2.Interface contain 'final' and 'static' variables
        3.Interface contains abstract methods. (abstract method: method without having a logic or body)
        4.Interface supports the functionality of multiple , Hybrid Inheritance
        5.define as 'interface' keyword
        6.The methods in interface are public
 */

interface InterfaceExample{
    int a = 10; //by default variable 'static' and 'final'

    void method1(); // Abstract method, by default 'Public'
}

/*
Class to class       >>>>>>  extend
Interface to Class  >>>>>>  implement
Interface to Interface >>>  extend
Class to Interface  >>>> NOT POSSIBLE
 */

public class InterfaceDemo implements InterfaceExample {

   public void method1(){ //since interface all methods are 'public', this method should be 'public' or higher visibility. but no higher visibility than 'public'.
        System.out.println(a);
    }

    public static void main(String[] args) {

       //InterfaceExample example1 = new InterfaceExample();  ****Interface name cannot be used******

        InterfaceExample example1 = new InterfaceDemo(); //*******Should use the class name to implement***********

        InterfaceDemo example2 = new InterfaceDemo();   //********This also equal to above example2 *********

        example1.method1();
        example2.method1();
    }

}
