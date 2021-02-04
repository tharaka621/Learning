package AccessModifier;

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

public class protectedDemo_01 { //this class make public so that other packages can access this class
    protected int a=100;              // protected, only through inheritance can access
    protected void methodProtected(){ //protected, only through inheritance can access
        System.out.println(100);
    }
}
