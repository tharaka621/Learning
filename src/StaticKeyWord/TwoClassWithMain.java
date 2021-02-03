package StaticKeyWord;

//Since main method is in outside separate class this 'a' and 'method1' is not recognizable by the main method.
//so we have to call by the "Class Name" to access the static variables

public class TwoClassWithMain {

    public static void main(String[] args) {

/*     Since main method is in outside separate class this 'a' and 'method1' is not recognizable by the main method.

        System.out.println(a);
        method1();
 */

        //so we have to call by the "Class Name" to access the static variables
        System.out.println(TwoClass.a);
        TwoClass.method1();

        TwoClass example1 = new TwoClass();
        System.out.println(example1.b);
        example1.method2();


        example1.method3();
    }


}


