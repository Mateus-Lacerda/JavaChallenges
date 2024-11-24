import java.sql.Array;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("I will think of a random number in between 0 and 10, try to guess it!\nAre you ready?");
        Scanner reader = new Scanner(System.in);
        boolean opt = (Objects.equals(reader.next().toLowerCase().substring(0,1), "y"));
        if (opt){
            System.out.println("To exit, respond '-1'.");
            int guess = 0;
            int correct_guesses = 0;
            int wrong_guesses = 0;
            do {
                Random rand = new Random();
                int number = rand.nextInt(10);
                System.out.println("Place your guess:");
                guess = reader.nextInt();
                if (Objects.equals(guess, number)) {
                    System.out.println("You are correct!!");
                    correct_guesses += 1;
                }
                else if (guess != -1) {
                    System.out.println("You are wrong...");
                    wrong_guesses += 1;
                }
            }
            while (guess != -1);

            System.out.printf("You have made %d correct guesses, and %d wrong guesses!", correct_guesses, wrong_guesses);
            float rate = (float) (correct_guesses * 100) / (correct_guesses + wrong_guesses);
            System.out.printf("%nThis represents a %.2f %% success rate!", rate);

        }
    }
}