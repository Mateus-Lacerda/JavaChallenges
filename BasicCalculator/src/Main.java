import java.util.Objects;
import java.util.Scanner;
import calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to the CALCULATOR!");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("ENTER THE OPERATION YOU WANT TO PERFORM \n + or - or * or \\ or fact (to get the factorial) or fibo (to get a Fibonacci sequence)");
            String op = scanner.next();
            if (Objects.equals(op, "fact") | Objects.equals(op, "fibo")){
                System.out.println("ENTER THE NUMBER: ");
                int a = scanner.nextInt();
                switch (op) {
                    case "fact": {
                        long long_result = Calculator.factorial(a);
                        System.out.printf("RESULT: %d%n", long_result);
                        break;
                    }
                    case "fibo": {
                        Calculator.fibonnaci(a);
                        break;
                    }
                }
                continue;
            }
            System.out.println("ENTER THE FIRST NUMBER: ");
            int a = scanner.nextInt();
            System.out.println("ENTER THE SECOND NUMBER: ");
            int b = scanner.nextInt();
            double result = 0;
            switch (op) {
                case "+": {
                    result = Calculator.sum(a, b);
                    break;
                }
                case "-": {
                    result = Calculator.subtract(a, b);
                    break;
                }
                case "*": {
                    result = Calculator.multiply(a, b);
                    break;
                }
                case "\\": {
                    result = Calculator.divide(a, b);
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