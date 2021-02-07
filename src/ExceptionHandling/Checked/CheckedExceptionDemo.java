package ExceptionHandling.Checked;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Program is starting........");
        System.out.println("Program is in progress................");


        try {
            Thread.sleep(3000); //InterruptedException
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program Complete.............");
        System.out.println("Program Exit.............");
    }
}
