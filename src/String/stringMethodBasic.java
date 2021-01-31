package String;

public class stringMethodBasic {
    public static void main(String[] args) {
        String example1 = " Welcome ";

        System.out.println(example1);
        System.out.println(example1.length()); //string length

        String example2 = "             For Skylfy ";

        System.out.println(example1.concat(example2)); //combine two strings

        System.out.println(example2);
        System.out.println(example2.trim()); //removing the space in end and begin

        System.out.println(example1.charAt(4)); //extract the specific character

        boolean value1 = example1.contains("xam"); //check the specific items contain in the sting
        System.out.println("Contain 'xam':"+value1);  // boolean value

        //check the string is equal to specific value
        System.out.println("Equals to Welcome:"+example1.equals(" Welcome "));     // capital  W  = true
        System.out.println("Equals to welcome:"+example1.equals(" welcome "));     // simple w  = false

        System.out.println(example1.replace("e","a"));      //replace a character
        System.out.println(example1.replace("Welcome","Close")); //replace a string

        //substring
        //starting index 0  1   2   3   4   5   6
        //string         w  e   l   c   o   m   e
        //ending index   1  2   3   4   5   6   7
        //display characters between starting and ending index
        String example3 = "Welcome";
        System.out.println(example3.substring(1,3)); //"el"
        System.out.println(example3.substring(0,4)); //"Welc"
        System.out.println(example3.substring(2,4)); //"lc"

        System.out.println(example3.toLowerCase());  //Lowercase Letters
        System.out.println(example3.toUpperCase());  //Uppercase Letters

    }
}
