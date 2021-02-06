package ExceptionHandling;

import java.util.Scanner;

/*
2 kind of Exceptions
---------------------
    1) checked Exceptions = checked or identify by the compiler

    2} Unchecked Exceptions = not checked or identify by the compiler
            example:
                    ArithmeticException
                    NullPointException
                    NumberFormatException
                    ArrayIndexOutOfBoundException
 */

/*
Handle Exception ........................

    try
    {
    statement which will cause the exception
    }
    catch(Exception Type)
    {
    Recovery steps
    }

 */

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        System.out.println("Program is starting........");
        System.out.println("Program is in progress................");

     /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = input.nextInt();     //input num = 0  **

        int a =100;
        System.out.println(100/num);  // 100/0 >> ArithmeticException **********************
      */
       //---------------------------------------------------------------------
     /*
        String s = "Welcome";
         int n = Integer.parseInt(s); //converting s into an integer>> NumberFormatException*********
        System.out.println(100/n);
     */
        //---------------------------------------------------------------------

        /*
        String s = null;
        System.out.println(s.length()); //null string length>>>> NullPointerException***************
         */
        //---------------------------------------------------------------------
        /*
        int a[] = new int[5]; //array of 5
        a[10]=100;  //10 item input >>>> ArrayIndexOutOfBoundsException*********************
         */

        System.out.println("Program is Completed...........r");
    }
}
