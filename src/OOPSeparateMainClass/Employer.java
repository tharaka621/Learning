package OOPSeparateMainClass;

public class Employer {

    //class variables
    int employerID;
    String employerName;
    int departmentNo;
    String job;

    //class methods
    void display(){ //VOID =method is not returning any output (Display value)
        System.out.println(employerID);
        System.out.println(employerName);
        System.out.println(departmentNo);
        System.out.println(job);
    }
}
