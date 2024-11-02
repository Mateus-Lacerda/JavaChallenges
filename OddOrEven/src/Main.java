import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Give me a number pleaseee, or type -1 to exit:");
            int value = 0;
            try {
                value = reader.nextInt();
            } catch (AssertionError e) {
                System.out.println("It has to be a number...");
            }
            if (value == -1) break;
            boolean oddity = (value % 2 != 0);
            if (oddity) System.out.printf("%d is an odd number %n", value);
            else System.out.printf("%d is an even number %n", value);
            }
        }

    }