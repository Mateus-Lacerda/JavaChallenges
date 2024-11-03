package calculator;

public class Calculator {
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
    // 4! = 4*3! = 4*3*2! ...
    public static long factorial(int a){
        if (a <= 1) return 1;
        else return a * factorial(a-1);
    }
}
