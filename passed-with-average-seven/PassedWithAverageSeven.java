import java.util.Scanner;

public class PassedWithAverageSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float noteOne = sc.nextFloat();
        float noteTwo = sc.nextFloat(); 
        String result = "";
        float media = (noteOne + noteTwo) / 2; 
        if(media >= 7.0){
            result = "pass: True";
        } else {
            result = "pass: False!";
        }

        System.out.println(result);
    }
}
