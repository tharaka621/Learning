package ExceptionHandling.Unchecked;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        System.out.println("Program is starting........");
        System.out.println("Program is in progress................");


        int a =100;

        try{
           // System.out.println(100/0);  // 100/0 >> ArithmeticException **********************

            String s = "Welcome";
            int n = Integer.parseInt(s);  //Number

        }catch(ArithmeticException x){ //x is an any variable
            System.out.println("Arithmetic Exception is occurred...... and Handle Successfully.... ");
        }catch(NullPointerException x){ //x is an any variable
            System.out.println("Null Pointer Exception is occurred...... and Handle Successfully.... ");
        }catch(NumberFormatException x){ //x is an any variable
            System.out.println("Number Format Exception is occurred...... and Handle Successfully.... ");
        }

        System.out.println("Program Complete .............");
    }
}
