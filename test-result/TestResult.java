import java.util.Scanner;

public class TestResult {


     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
 
         int sum = 0;
         int cont = 0;
         int bigger = Integer.MIN_VALUE;
         int smaller = Integer.MAX_VALUE;
         int aboveAverage = 0;
         int belowAverage = 0;
 
             while (true){
         
             String  testInformation = sc.nextLine();
 
             if (testInformation.equals("-")){
                 break;
             }
 
             cont += 1;
             String[] studentesAndGrades = testInformation.split(" ");
 
             int note = Integer.parseInt(studentesAndGrades[1]);
                 sum += note;
                 if (note > bigger) {
                     bigger = note;
                 }if (note < smaller) {
                     smaller = note;
                 }if (note >= 700) {
                     aboveAverage += 1;
                 } else if (note  < 700){
                     belowAverage += 1;
                 }
                 
             }
 
             int media = (sum / cont);
             sc.close();
             System.out.println("maior: " + bigger);
             System.out.println("menor: " + smaller );
             System.out.println("media: " + media);
             System.out.println("acima: " + aboveAverage);
             System.out.println("abaixo: " + belowAverage);
     }
 }
