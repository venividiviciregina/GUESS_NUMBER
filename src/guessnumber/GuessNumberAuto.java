package guessnumber;


import java.util.Random;
import java.util.Scanner;

public class GuessNumberAuto {

    public static void main(String args[]) {

        System.out.println("Hello User");
        System.out.println("Game guess number");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber =  random.nextInt(100);

        System.out.println("Guess number. You have 3 choices");
        boolean guessOkay = false;

        for (int i = 0; i < 3; i++) {

            int tries = 2 - i;
            System.out.println("Please guess a number >");
            String userInput = scanner.next();

            int userGuess = parseUserInput(userInput);

            System.out.println("Your guess is '" + userInput + "'");
            if (randomNumber == userGuess) {
                System.out.println("Congratulation!");
                guessOkay = true;
                break;
            } else {
                System.out.println("Sorry you guessed the wrong number. You have " + tries + " remaining");
            }

        }

        System.out.println("You have guessed right " + guessOkay);
        System.out.println("Random number was " + randomNumber);
    }

    static int parseUserInput(String userInput) {
        try {

            int integer = Integer.parseInt(userInput);

            return integer;
        } catch (NumberFormatException numberFormat) {
            return -99;
        }
    }
}
