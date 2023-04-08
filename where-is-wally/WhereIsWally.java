import java.util.Scanner;

public class WhereIsWally{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.nextLine();
            if(input.equals("wally")) break;
            String lastName = "?";
            for(String name: input.split(" ")){
                if(name.length() == 5){
                    lastName = name;
                }
            }
            sc.close();
            System.out.println(lastName);
        }
    }
}
    