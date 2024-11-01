import calculator.Caculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to the CALCULATOR!");
        Scanner scanner = new Scanner(System.in);
        Caculator calculator = new Caculator();
        while (true){
            System.out.println("ENTER THE FIRST NUMBER: ");
            int a = scanner.nextInt();
            System.out.println("ENTER THE SECOND NUMBER: ");
            int b = scanner.nextInt();
            System.out.println("ENTER THE OPERATION YOU WANT TO PERFORM: ");
            String op = scanner.next();
            double result = 0;
            switch (op) {
                case "+": {
                    result = calculator.sum(a, b);
                    break;
                }
                case "-": {
                    result = calculator.subtract(a, b);
                    break;
                }
                case "*": {
                    result = calculator.multiply(a, b);
                    break;
                }
                case "\\": {
                    result = calculator.divide(a, b);
                    break;
                }
                case "stop":
                    break;
                default:
                    System.out.println("JUST USE + or - or * or \\ or tell me to stop PLEAASE");
                    break;
            }
            System.out.printf("RESULT: %f", result);
            System.out.println();
        }
    }
}