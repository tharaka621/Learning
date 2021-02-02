package Methods;

//call by value: pass a value to a method as a parameter
//call by reference: pass object to a method as a parameter

public class CallByValue {

    int x;

    public void addition(int a){
        x = a+5;
       // System.out.println(x);
    }

    public static void main(String[] args) {
        CallByValue example1 = new CallByValue();

        example1.addition(10);
        System.out.println(example1.x);  //This is the **Call by Value******
    }

}
