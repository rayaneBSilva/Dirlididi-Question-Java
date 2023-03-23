import java.util.Scanner;

public class ColorRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        String color = " ";
        if (R < 128 || G < 128 || B < 128 ){
            color = "PRETO";
        } else {
            color = "BRANCO";
        }
        sc.close();
        System.out.println(color);
    }
}
