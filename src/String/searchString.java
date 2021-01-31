package String;

public class searchString {
    public static void main(String[] args) {
        String naemList[] = {"Sarah", "Malick", "Tharaka", "Jayasinghe", "Madushan"};

        String searchItem = "Tharaka";

        boolean status = false;

        for (String i : naemList) {

            if (i.equals(searchItem)) {
                System.out.println("Search item " + searchItem + " found");
                status = true;
                break;
            }
        }

        if (status == false) {
            System.out.println("Search item " + searchItem + " not found");
        }
    }
}
