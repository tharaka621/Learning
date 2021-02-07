package ArrayList;

/*
*************************************************
2 Limitation in Array
-------------------------
    1.Fixed in size
    2.Can not store different type of values

ArrayList can overcome these problems
**************************************************
 */

import java.util.ArrayList; //import ArrayList  **

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList exampleArrayList = new ArrayList(); //Declaration

        //how to add elements to Array List (Use 'add' method)
        exampleArrayList.add("Welcome");
        exampleArrayList.add(10);
        exampleArrayList.add(10.5);
        exampleArrayList.add(true);
        exampleArrayList.add('A');

        //find the size of array list (Use 'size' Method)
        System.out.println(exampleArrayList.size());

        //Printing all the values
        System.out.println(exampleArrayList);

        //Extract Specific value and print (Use 'get' method)
        System.out.println(exampleArrayList.get(2));

        //Insert a new value in middle of the Array List
        exampleArrayList.add(1,"Sarah");      //name.add(position index , element);
        System.out.println(exampleArrayList);

        //How to remove a value (Use 'remove' method)
        exampleArrayList.remove(3);
        System.out.println(exampleArrayList);

        //extract each vale individually using for loop (Use 'Object' class)
        for(Object i: exampleArrayList)  //'Object" class use to hold any data type in 'i' variable
        {
            System.out.println(i);
        }

    }
}
