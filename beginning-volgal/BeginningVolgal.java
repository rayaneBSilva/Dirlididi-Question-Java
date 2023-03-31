import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeginningVolgal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        int cont = 0;
        while (cont < 5) {
            String phase = sc.nextLine();
            if (phase.charAt(0) == 'a') {
                result.add("s");
            } else {
                result.add("n");
            }
            cont++;
        }
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}
