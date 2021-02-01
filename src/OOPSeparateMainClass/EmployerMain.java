package OOPSeparateMainClass;

public class EmployerMain {
    public static void main(String[] args) {
        Employer employer01 = new Employer();  //creating an Object

        //adding values to object variables
        employer01.employerID=134;
        employer01.employerName="Tharaka";
        employer01.departmentNo=01;
        employer01.job ="Engineer";

        employer01.display(); //displaying employer1 object values

        //--------------------second object------------------------------------
        Employer employer02 = new Employer();    //creating the Object 02

        //adding values to object variables
        employer02.employerID=104;
        employer02.employerName="Sarah";
        employer02.departmentNo=03;
        employer02.job ="Human Resource";

        employer02.display();              //displaying employer2 object values
    }
}
