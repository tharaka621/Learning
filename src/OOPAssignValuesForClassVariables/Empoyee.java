package OOPAssignValuesForClassVariables;

public class Empoyee {

    //class variables
    int employerID;
    String employerName;
    int departmentNo;
    String job;

    //Constructor
    Empoyee(int id, String name, int depNo, String eJob){
        employerID = id;
        employerName = name;
        departmentNo = depNo;
        job = eJob;
    }

    //Method to get Values (**Not need to use with the constructor because same operation)
    void getValues(int id, String name, int depNo, String eJob){ //parameters or arguments
        employerID = id;
        employerName = name;
        departmentNo = depNo;
        job = eJob;
    }

    //class methods
    void display(){ //VOID =method is not returning any output (Display value)
        System.out.print(employerID+"\t\t");
        System.out.print(employerName+"\t\t");
        System.out.print(departmentNo+"\t\t");
        System.out.println(job);
    }
}

