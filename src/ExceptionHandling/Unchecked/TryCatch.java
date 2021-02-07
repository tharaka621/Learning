package ExceptionHandling.Unchecked;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Program is starting........");
        System.out.println("Program is in progress................");

        Scanner input = new Scanner(System.in);

        //================================================================================

        /*System.out.println("Enter a Number: ");
        int num = input.nextInt();     //input num = 0  **

        int a =100;

        try{
            System.out.println(100/num);  // 100/0 >> ArithmeticException **********************
        }catch(ArithmeticException x){ //x is an any variable
            System.out.println("Exception is occurred...... and Handle Successfully.... ");
        }
         */

//=====================================================================================


        String s = "Welcome";
        int n =0;

        try{
            n = Integer.parseInt(s); //converting s into an integer>> NumberFormatException*********
        }catch(NumberFormatException x)
        {
            System.out.println("Exception is occurred...... and Handle Successfully.... ");
        }

        System.out.println(n+100);


        System.out.println("Program is Completed...........r");


    }
}
