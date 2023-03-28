import java.util.Scanner;

public class CalculatorWithOption {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String menssage = "";
    double result;

    String operation = sc.nextLine();
    if(validation(operation)){
        double inputOne = sc.nextDouble();
        double inputTwo = sc.nextDouble();
        if(operation.equals("+")){
            result = inputOne + inputTwo;
            menssage = "RESULTADO " + result;
        } else if(operation.equals("-")){
            result = inputOne - inputTwo;
            menssage = "RESULTADO " + result;
        } else if (operation.equals("*")){
            result = inputOne * inputTwo;
            menssage = "RESULTADO " + result;
        } else if (operation.equals("/")){
            if(inputTwo == 0.0){
                menssage = "ERRO";
            }
            result = inputOne / inputTwo;
            menssage = "RESULTADO " + result;
        }
           
    } 
    sc.close();
    System.out.println(menssage);
}
public static boolean validation(String operation){
    boolean output = false;
    if(operation.equals("+")) output = true;
    if(operation.equals("-")) output = true;
    if(operation.equals("/")) output = true;
    if(operation.equals("*")) output = true;
    return output;
    }
}
    

