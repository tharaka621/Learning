package Methods;

/*

        3 logic

            1.no input , not return output
            2.no input , return output
            3.yes input, not return output
            4.yes input, return output
 */

public class calculator {

    int x = 100 ,y=200;

    //case 01 ==============    no input , not return output
    void sum1(){
        System.out.println(x+y);
    }

    //case 02 ============      no input , return output
    int sum2(){ //return value is integer
        return(x+y);
    }

    //case 03 ============      yes input, not return output
    void sum3(int a, int b){
        System.out.println(a+b);
    }

    //case 04 ============
    int sum4(int a, int b){
        x= a;
        y =b;
        return (x+y);
    }



    public static void main(String[] args) {

        calculator add = new calculator(); //creating object 'add'

        add.sum1(); //case 1

        int result2= add.sum2(); //case 2
        System.out.println(result2);

        add.sum3(4,6);   //case 3

        int result4= add.sum4(40,60); //case 2
        System.out.println(result4);

    }

}

