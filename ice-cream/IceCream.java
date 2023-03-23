import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int objectOne = sc.nextInt();
        int speedOne = sc.nextInt();
        int objectTwo = sc.nextInt();
        int speedTwo = sc.nextInt();
        int time = sc.nextInt();

        int distanceOne = finalDistance(objectOne, speedOne, time);
        int distanceTwo = finalDistance(objectTwo, speedTwo, time);
        
        int finalDistance = distanceOne - distanceTwo;
        sc.close();
        System.out.println(Math.abs(finalDistance));
        
    }
    public static int finalDistance(int object, int speed, int time){
        return object + speed * time;
    }
}
