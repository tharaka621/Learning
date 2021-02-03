package FinalKeyWord;

/*
variables - can't change the value of the variable ****************
method  -   can't override in the child classes
class - can't extend into another class
 */

public class FinalVariable {

    final int speed = 100; //value cant be changed

    public static void main(String[] args) {
        FinalVariable example1 = new FinalVariable();
        // example1.speed = 150;  ***This is incorrect *** cant be changed , final variable

        System.out.println(example1.speed);
    }
}
