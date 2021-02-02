package ThisKeyWord;

/*
This key word is using when want to use the same name to class variable and method variables
To difference the class variables from method variable
***'this' key word is use the class variables***
 */

public class ThisKeyWordDemo {

    int a,b;    //class variables / instance variables / global variables

    void add(int a,int b){ //method variables/ external variables

        this.a=a;  // 'this.a' is the class variable
        this.b=b;  // 'this.b' is the class variable
    }

    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println("a + b : "+(a+b));
    }

    public static void main(String[] args) {

        ThisKeyWordDemo example1 = new ThisKeyWordDemo();
        example1.add(10,20);
        example1.display();
    }
}
