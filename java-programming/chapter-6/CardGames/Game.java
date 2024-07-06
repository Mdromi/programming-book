package CardGames;

import java.util.Scanner;

public class Game {
    private final Scanner input = new Scanner(System.in);
    private int correctGusses = 0;

    public void play() {
        int gamesPlayed = 0;
        boolean playAgain;

        System.out.println("### High Low Prediction Card Game ###");
        do {
            keepPlayingUntilIncorrectGuess();
            gamesPlayed++;
            playAgain = askUserToPlayAgain();
        } while (playAgain);

        double averageScore = ((double) correctGusses) / gamesPlayed;
        System.out.println();
        System.out.println("You played " + gamesPlayed + " game.");
        System.out.printf("Your average score was %1.3f.\n", averageScore);
    }

    private void keepPlayingUntilIncorrectGuess() {
        Deck deck = new Deck();
        deck.shuffle();

        Card currentCard = deck.dealCard();
        Card nextCard;
        System.out.println("The first card is: " + currentCard);

        boolean keepPlaying = true;
        while (keepPlaying) {
            char guess = askForUserInput();
            nextCard = deck.dealCard();
            System.out.println("The next card is: " + nextCard);

            if (nextCard.getValue() == currentCard.getValue()) {
                System.out.println("The value is the same as the previous card");
                System.out.println("You lose on ties. Sorry!");
                keepPlaying = false;
            } else if (nextCard.getValue() > currentCard.getValue()) {
                if (guess == 'H') {
                    System.out.println("Your guess was correct.");
                    correctGusses++;
                } else {
                    System.out.println("Your guess was incorrect.");
                    keepPlaying = false;
                }
            } else {
                if (guess == 'L') {
                    System.out.println("Your guess was correct.");
                    correctGusses++;
                } else {
                    System.out.println("Your guess was incorrect.");
                    keepPlaying = false;
                }
            }

            currentCard = nextCard;
            System.out.println();
            System.out.println("The card is: " + currentCard);
        }

        System.out.println();
        System.out.println("\uD83C\uDFAE The game is over! \uD83C\uDFAE");
        System.out.println("You made " + correctGusses + " correct guesses.");
        System.out.println();
    }

    private boolean askUserToPlayAgain() {
        System.out.println("Want to play again? If yes, please type YES, otherwise type anything to exit.");
        return input.nextLine().toUpperCase().contains("YES");
    }

    private char askForUserInput() {
        System.out.print("Will the next card be higher (H) or Lower (L): ");
        char guess;
        do {
            guess = input.nextLine().toUpperCase().charAt(0);
            if (guess != 'H' && guess != 'L') {
                System.out.println("Please type H or L:");
            }
        } while (guess != 'H' && guess != 'L');
        return guess;
    }
}
