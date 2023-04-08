import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chosenNumber = sc.nextInt();
        String result = "";
        while(true){
            int guessedNumber = sc.nextInt();
            if(guessedNumber == chosenNumber){
                break;
            }
            if(guessedNumber < chosenNumber){
                result = "MENOR";
            } else {
                result = "MAIOR";
            }
            System.out.println(result);
        }
        System.out.println("ACERTOU");
        sc.close();
    }
}
