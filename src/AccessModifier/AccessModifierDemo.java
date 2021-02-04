package AccessModifier;

/*
        4 Type of Access Modifier's
            1.public
            2.default   *****
            3.protected
            4.private   *****

            private: can use only within the class (methods or classes)
            default: can accessible only within the package (across multiple classes in the same package)
            protected: accessible within the package and outside the package but through INHERITANCE only


 */
class classPrivate{   //with private method , variable ******
    private int a=100;
    private void methodPrivate(){
        System.out.println(100);
    }
}

class classDefault{   //with default method , variable ******
     int a=100;
     void methodDefault(){
        System.out.println(100);
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {

     /*  *****************can not access here since private *******
       classPrivate example01 = new classPrivate();
        example01.a=200;
        example01.methodPrivate();
      */
        classDefault example01 = new classDefault();
        example01.a=200;
        example01.methodDefault();


    }
}
