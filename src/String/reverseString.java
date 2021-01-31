package String;

public class reverseString {

    public static void main(String[] args) {
        String name= "THARAKA";

        int length = name.length(); // length = 7
        String reverseName="";

        for(int i=length -1 ; i>= 0 ; i--){
            reverseName = reverseName+name.charAt(i);
        }

        System.out.println("Reverse of "+name+" is "+reverseName);
    }


}
