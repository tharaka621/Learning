package OOP_Inheritance;

interface Parent_01{ //parent a
    int x=100;

    void methodParent01();
}

interface Parent_02{ //parent b
    int y=200;

    void methodParent02();
}

public class InheritanceType_4MultipleDemo implements Parent_01,Parent_02 {

    public void methodParent01(){
        System.out.println(x);
    }

    public void methodParent02(){
        System.out.println(y);
    }

    public static void main(String[] args) {

        InheritanceType_4MultipleDemo example1 = new InheritanceType_4MultipleDemo();

        example1.methodParent01();
        example1.methodParent02();

    }
}
