package ExceptionHandling.Checked;

public class Throws {
    public static void main(String[] args) throws InterruptedException{  //Throws == Method level handling exception
        System.out.println("Program is starting........");
        System.out.println("Program is in progress................");


            Thread.sleep(3000); //InterruptedException


        System.out.println("Program Complete.............");
        System.out.println("Program Exit.............");
    }
}
