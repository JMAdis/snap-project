import java.util.Scanner;

public class SnapGame {
    public static void main(String[] args) {

        // Initializing scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Main game loop
        while (true) {
            System.out.println("Welcome to Snap Game!");
            System.out.println("Press Y to start the game. Good luck! :) ");

            // Getting user input to start the game
            String startGameInput = scanner.nextLine().trim().toLowerCase();

            // Checking if the user wants to start the game
            if (!startGameInput.equals("y")) {
                System.out.println("Invalid input. Please enter 'Y' to start the game");
                continue;
            }

            // Starting the game
            playSnapGame(scanner);

            System.out.println("Do you want to play again? (Y/N)");

            // Getting user input on whether they want to play again
            String playAgainInput = scanner.nextLine().trim().toLowerCase();
            if (!playAgainInput.equals("y")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }
        }
    }

    // Method to play the Snap Game
    private static void playSnapGame(Scanner scanner) {
        // Initializing the deck and shuffling
        Deck deck = new Deck();
        deck.shuffleDeck();

        // Initialising players, dealing cards, and establishing rounds and scores
        Player player1 = new Player();
        Player player2 = new Player();

        dealCards(deck, player1, player2);

        System.out.println("Type 'snap' to snap when you see a match, or enter 0 to skip.");

        int totalRounds = 26;
        int currentRound = 1;
        int snapCountPlayer1 = 0;
        int snapCountPlayer2 = 0;

        // Main game loop for rounds
        while (player1.hasCards() && player2.hasCards()) {
            Card card1, card2;

            // Determining which player's turn it is
            if (currentRound <= totalRounds / 2) {
                System.out.println("Player 1's turn (Round " + currentRound + ")");
                card1 = player1.playCard();
                card2 = player2.playCard();
            } else {
                System.out.println("Player 2's turn (Round " + currentRound + ")");
                card1 = player2.playCard();
                card2 = player1.playCard();
            }

            // Displaying the cards for the round
            System.out.println("Card 1: " + card1);
            System.out.println("Card 2: " + card2);

            // Getting user input for snap or skip
            String userInput = scanner.nextLine().trim().toLowerCase();

            if (userInput.equals("snap")) {
                if (card1.getRank().equals(card2.getRank()) || card1.getSuit().equals(card2.getSuit())) {
                    // Inrementing snap count for the respective player
                    System.out.println("SNAP! You have a match!");
                    if (currentRound <= totalRounds /2) {
                        snapCountPlayer1++;
                    } else {
                        snapCountPlayer2++;
                    }
                } else {
                    System.out.println("No match");
                }
            } else if (userInput.equals("0")) {
                System.out.println("Skipped");
            } else {
                System.out.println("Invalid input. Please type 'snap' to snap or 0 to skip. ");
            }

            // Message that gets displayed halfway through the game when the players switch
            if (currentRound == totalRounds / 2) {
                System.out.println("Switching players! Get ready Player 2!");
            }

            // Moving to the next round
            currentRound++;
        }

        // Displaying game results
        System.out.println("Game Over!");
        System.out.println("Player 1 Snaps: " + snapCountPlayer1);
        System.out.println("Player 2 Snaps: " + snapCountPlayer2);

        // Declaring the winner or a tie
        if (snapCountPlayer1 > snapCountPlayer2) {
            System.out.println("Player 1 wins!");
        } else if (snapCountPlayer2 > snapCountPlayer1) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    // Method to deal cards to players
    private static void dealCards(Deck deck, Player player1, Player player2) {
        while (deck.hasCards()) {
            if (deck.hasCards()) {
                Card card = deck.dealCard();
                player1.addCard(card);
            }
            if (deck.hasCards()) {
                Card card = deck.dealCard();
                player2.addCard(card);
            }
        }
    }
}
