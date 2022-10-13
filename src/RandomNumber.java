import java.util.Scanner;

public class RandomNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double num = (int)(Math.random() * (100+1));
        System.out.println("Guess a random number between 1-100");
        int guess = input.nextInt();
        int numGuess = 1;

        while (guess != num) {
            System.out.println("Incorrect!");
            numGuess += 1;

            if (guess > num) {
                System.out.println("Your guess is too high!");
            } else {
                System.out.println("Your guess is too low!");
            }

            System.out.println("Guess again:");
            guess = input.nextInt();
        }


        System.out.println("Correct");
        System.out.println("Number of guesses: " + numGuess);


    }
}

