import java.util.Scanner;

public class PoeticWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordOne = sc.next();
        String wordTwo = sc.next();
        String message = "";
        int finalWordOne = wordOne.length() - 1;
        int finalwordTwo = wordTwo.length() - 1;
        if (wordOne.charAt(0) == wordTwo.charAt(0) && wordOne.charAt(finalWordOne) == wordTwo.charAt(finalwordTwo)) {
            message = "S";
        } else {
            message = "N";
        }
        System.out.println(message);
    }
}

