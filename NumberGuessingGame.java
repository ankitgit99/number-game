import java.util.*;

public class NumberGuessingGame {

    public static void numberGuessingGame() {
        Scanner sc = new Scanner(System.in);
        
        int digit = 1 + (int) (100 * Math.random());
        int trials = 5;
        int a, guess;
        
        System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");

        for (a = 0; a < trials; a++) {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
           
            if (digit == guess) {
                System.out.println("Congratulations! You guessed the number correctly.");
                break;
            } else if (digit > guess && a != trials - 1) {
                System.out.println("The number is greater than " + guess);
            } else if (digit < guess && a != trials - 1) {
                System.out.println("The number is less than " + guess);
            }
        }
        
        if (a == trials) {
            System.out.println("You have exhausted your trials.");
            System.out.println("The number was " + digit);
        }

        sc.close();
    }

    public static void main(String[] args) {
        numberGuessingGame();
    }
}
