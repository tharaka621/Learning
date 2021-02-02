package Methods;

/*
Overloading Rules

     1.Parameters should be different
     2.Data Type should be different

 */

public class MethodOverloading {

    int x,y;
    double z;

    int addition(){   //1st method
        x =10;
        y=20;
        return(x+y);
    }

    int addition(int a, int b){ //2nd method
        x =a;
        y=b;
        return(x+y);
    }

    double addition(int a, double b){ //3rd method
        x =a;
        z=b;
        return(x+z);
    }

    public static void main(String[] args) {

        MethodOverloading methodExample = new MethodOverloading();

        System.out.println(methodExample.addition()); //executing method 1
        System.out.println(methodExample.addition(100,200));  //executing method 2
        System.out.println(methodExample.addition(100,34.7)); //executing method 3


    }
}
