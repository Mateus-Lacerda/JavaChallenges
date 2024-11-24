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
    public static void fibonnaci(int a){
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
        int last_fibo = 0, fibo_controller = 1, current_fibo = 1;
        System.out.print(0);
        for (int i = 0; i<a; i++){
            System.out.printf(", %d", current_fibo);
            fibo_controller = current_fibo;
            current_fibo += last_fibo;
            last_fibo = fibo_controller;
        }
        System.out.println("...");
    }
}
