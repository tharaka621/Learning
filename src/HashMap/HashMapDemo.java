package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap <Integer,String>exampleHashMap = new HashMap<Integer,String>();  //Declaration (example Pair here is "KEY"integer and "VALUE"String)

        //pair = key , value
        //adding pairs to HashMap (Use 'put' method)
        exampleHashMap.put(134,"Tharaka0");
        exampleHashMap.put(100,"Sarah");
        exampleHashMap.put(111,"Eminem");
        exampleHashMap.put(199,"Lewa");

        //printing all the pairs
        System.out.println(exampleHashMap);

        //remove a pair from HashMap (Use 'remove' method)
        exampleHashMap.remove(199); // should enter the key
        System.out.println(exampleHashMap);

        //Read pair individually (Entry = one pair , Entry Set = All the pairs)
        for(Map.Entry m:exampleHashMap.entrySet()){ //'m' is a variable, 'Map.Entry' save one pair in 'm' , Use 'entrySet' method

            System.out.println(m.getKey()+" "+m.getValue()); //using 'getKey' and 'getValue' methods

        }

    }
}
