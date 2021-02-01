package OOP;

public class basic { //basic class.(EMPLOYEE)

    int employerID;
    String employerName;
    int departmentNo;
    String job;

    void display(){ //VOID =method is not returning any output (Display value)
        System.out.println(employerID);
        System.out.println(employerName);
        System.out.println(departmentNo);
        System.out.println(job);
    }

    public static void main(String[] args) { //main method
        basic employer01 = new basic();     //creating an Object

        //adding values to object variables
        employer01.employerID=134;
        employer01.employerName="Tharaka";
        employer01.departmentNo=01;
        employer01.job ="Engineer";

        employer01.display(); //displaying employer1 object values

        //-------------------------------------------- second object
        basic employer02 = new basic();     //creating an Object

        //adding values to object variables
        employer02.employerID=104;
        employer02.employerName="Sarah";
        employer02.departmentNo=03;
        employer02.job ="Human Resource";

        employer02.display(); //displaying employer2 object values
    }

}
