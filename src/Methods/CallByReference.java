package Methods;
//call by value: pass a value to a method as a parameter
//call by reference: pass object to a method as a parameter

public class CallByReference {
    int x;

    public void addition(CallByReference a){ //"a" is the new object
        x = a.x+5;  //extract the value from the new "a" object
        //System.out.println(x);
    }

    public static void main(String[] args) {
        CallByReference example1 = new CallByReference();

        example1.x=10;

        example1.addition(example1); //send the Object to the method

        System.out.println(example1.x);  //printing the modified value
    }

}