package FinalKeyWord;
/*
variables - can't change the value of the variable
method  -   can't override in the child classes
class - can't extend into another class *************
 */

final class Car{
    final void run(){
        System.out.println("Running............");
    }
}

/*
class BMW extends Car{           ****Incorrect **** can't extend, final class

}

 */

public class FinalClass {
    public static void main(String[] args) {

    }
}
