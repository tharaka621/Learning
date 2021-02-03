package FinalKeyWord;
/*
variables - can't change the value of the variable
method  -   can't override in the child classes ***************
class - can't extend into another class
 */

class Bike{
   final void run(){
        System.out.println("Running............");
    }
}

class Honda extends Bike{
  /*  void run(){               ****Incorrect **** can't override, final method
        System.out.println("Running............");
    }

   */
}

public class FinalMethod {
    public static void main(String[] args) {

    }
}
