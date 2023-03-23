/* Programming laboratory II 
   Student: Rayane Bezerra da Silva
   Problem: make a program that reads two words 
   and displays the largest and smallest
 */

import java.util.Scanner;

public class BigAndSmaller {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word_one = sc.nextLine();
        String word_two = sc.nextLine();

        String big = "";
        String smaller = "";

        if(word_one.length() == word_two.length()){
            big = word_one;
            smaller = word_one;
        } else if (word_one.length() > word_two.length()) {
            big = word_one;
            smaller = word_two;
        } else {
            big = word_one;
            smaller = word_two;
        }
        sc.close();
        System.out.println(smaller);
        System.out.println(big);
    }
}
