import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiggerAndSmaller{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0; i < 5 ; i++){
            numbers[i] = sc.nextInt();
        }

        int bigger = numbers[0];
        int smaller = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > bigger){
                bigger = numbers[i];
            } 
            if(numbers[i] < smaller){
                smaller = numbers[i];
            }
        }
        System.out.println(bigger - smaller);
        sc.close();
      
    }
}