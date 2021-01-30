package array;

public class singleDimensionArray {
    public static void main(String[] args) {
        int newArray[] = new int[5];   //declaration

        for(int i=0;i<=newArray.length-1;i++){  //adding values
            newArray[i]=i*i;
        }
        for(int i=0;i<=newArray.length-1;i++){   //using the array length as the limit
            System.out.print(newArray[i]+"\t");
        }
        System.out.println("");
        System.out.println(newArray.length);  //array length
        System.out.println(newArray[3]);   //extract a specific value

    }
}
