
import java.util.Scanner;

public class BiggestAndSmalletWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrayWord = new String[5];

        for(int i = 0; i < 5; i++){
          arrayWord[i] = sc.nextLine();

        }

        String bigger = arrayWord[0];
        String smaller = arrayWord[0]; 

        for(int i = 0 ; i < arrayWord.length ; i++){
            if(arrayWord[i].length() > bigger.length()){
                bigger = arrayWord[i];
            } 
            if(arrayWord[i].length() < smaller.length()){
                smaller = arrayWord[i];
            }
            
        }
        System.out.println(smaller);
        System.out.println(bigger);

      
    }
}
