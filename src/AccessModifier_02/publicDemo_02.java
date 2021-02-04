package AccessModifier_02;
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

import AccessModifier.publicDemo_01;

public class publicDemo_02 {
    public static void main(String[] args) {

        publicDemo_01 example2 = new publicDemo_01(); //direct access since the public
        example2.a =2003;
        example2.publicMethod();
    }
}
