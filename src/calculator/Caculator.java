package calculator;

public class Caculator {
    public static int sum(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(int a, int b){
        if (b==0) {
            System.out.println("Can't divide by zero...");
            return Double.POSITIVE_INFINITY;
        }
        else {
            return (double) a / b;
        }
    }
}
