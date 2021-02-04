package AccessModifier;
/*
        4 Type of Access Modifier's
            1.public   ***********
            2.default
            3.protected
            4.private

            private: can use only within the class (methods or classes)
            default: can accessible only within the package (across multiple classes in the same package)
            protected: accessible within the package and outside the package but through INHERITANCE only
            public : everywhere
 */

public class publicDemo_01 {
    public int a = 100;         //public
    public void publicMethod(){ //public
        System.out.println(a);
    }
}
