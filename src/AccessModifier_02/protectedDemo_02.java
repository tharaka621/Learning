package AccessModifier_02;

/*
        4 Type of Access Modifier's
            1.public
            2.default
            3.protected  *****
            4.private

            private: can use only within the class (methods or classes)
            default: can accessible only within the package (across multiple classes in the same package)
            protected: accessible within the package and outside the package but through INHERITANCE only
            public : everywhere
 */


import AccessModifier.protectedDemo_01;  //since using different package class, we need to specify the importing package and the class
//import importing_package.importing_class;

public class protectedDemo_02 extends protectedDemo_01 { //use inheritance to access the method and packages of 'protectedDemo_01' class
    public static void main(String[] args) {

        protectedDemo_02 example01 = new protectedDemo_02();
        example01.a=200;
        example01.methodProtected();

    }
}
