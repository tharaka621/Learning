package OOPAssignValuesForClassVariables;

/* Three ways
        1.Using Reference
        2.Using Methods
        3.Using Constructor
 */


public class EmployeeMain {
    public static void main(String[] args) {

       /*

        //1.Using Reference -------------------------
        Empoyee employee01 = new Empoyee();

        employee01.employerID = 134;
        employee01.employerName = "Tharaka";
        employee01.departmentNo = 01;
        employee01.job = "Engineer";

        employee01.display();

        //2.Using Method------------ (For that get method is created in the Employee Class)-----------
        Empoyee employee02 = new Empoyee();

        employee02.getValues(110,"Sarah",03,"HR Manager");
        employee02.display();

        */


        //3.Using Constructor---------------------------

        Empoyee employer03 = new Empoyee(110,"Sarah",03,"HR Manager");
        employer03.display();

        Empoyee employer04 = new Empoyee(134,"Tharaka",01,"Engineer");
        employer04.display();

    }
}
