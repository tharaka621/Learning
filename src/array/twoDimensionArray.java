package array;

public class twoDimensionArray {
    public static void main(String[] args) {
        int twoDArray[][] = new int[3][2]; //declaring two dimensional array

        System.out.println("number of rows: "+twoDArray.length); //number of rows
        System.out.println("number of columns: "+twoDArray[0].length); //length of the 1st row ( Number of columns)

        for(int i=0;i<=twoDArray.length-1;i++){  //adding values
            for(int j=0;j<=twoDArray[i].length-1;j++){
                twoDArray[i][j]=i;
            }
        }

        for(int i=0;i<=twoDArray.length-1;i++){  //Displaying Values
            for(int j=0;j<=twoDArray[i].length-1;j++){
                System.out.print(twoDArray[i][j]+" ");
            }
            System.out.println(""); //line down print
        }
    }

}
