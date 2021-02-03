package SuperKeyWord_OOPInheritance;

/*

Super keyword
---------------
    1. can be used to refer immediate parent class instance variable.
    2. can be used to invoke immediate parent class method.

*/

public class SuperFor_Animal {
    public static void main(String[] args) {
        Dog pitBull = new Dog();
        pitBull.display();
        pitBull.eat();
    }
}
