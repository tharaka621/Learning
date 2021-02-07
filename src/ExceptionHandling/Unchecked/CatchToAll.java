package ExceptionHandling.Unchecked;

public class CatchToAll {
    public static void main(String[] args) {
        System.out.println("Program is starting........");
        System.out.println("Program is in progress................");


        int a =100;

        try{
            // System.out.println(100/0);  // 100/0 >> ArithmeticException **********************

            String s = "Welcome";
            int n = Integer.parseInt(s);  //Number

        }catch(Exception x){ //Only specify as "Exception" to all exception *************************************************
            System.out.println("Exception is occurred...... and Handle Successfully.... ");
        }

        System.out.println("Program Complete .............");
    }
}
