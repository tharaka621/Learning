package ExceptionHandling.Unchecked;


/*
case 01 : Exception + Catch Block Handle     >>>>>>>>>>> Finally Execute
case 02 : Exception + Catch Block Not Handle >>>>>>>>>>> Finally Execute
case 03 : Not Exception + Catch Block ignored >>>>>>>>>>> Finally Execute
 */

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Program is starting........");
        System.out.println("Program is in progress................");

/*    //case 01 : Exception + Catch Block Handle     >>>>>>>>>>> Finally Execute

        int a =100;

        try{
          System.out.println(a/0);  // 100/0 >> ArithmeticException *********************

        }catch(ArithmeticException x){
            System.out.println("Exception is occurred...... and Handle Successfully.... ");
        }finally {
            System.out.println("Finally block.......");
        }

 */
/*
        //case 02 : Exception + Catch Block Not Handle >>>>>>>>>>> Finally Execute
        int a =100;

        try{
            System.out.println(a/0);

        }catch(NullPointerException x){ //different type exception *************************************************
            System.out.println("Exception is occurred...... and Handle Successfully.... ");
        }finally {
            System.out.println("Finally block.......");
        }


 */

/*  case 03 : Not Exception + Catch Block ignored >>>>>>>>>>> Finally Execute
        int a =100;

        try{
            System.out.println(a/5);  // 100/5 >> No Exception *********************

        }catch(NullPointerException x){
            System.out.println("Exception is occurred...... and Handle Successfully.... ");
        }finally {
            System.out.println("Finally block.......");
        }

 */


        System.out.println("Program Complete.............");
        System.out.println("Program Exit.............");
    }
}
