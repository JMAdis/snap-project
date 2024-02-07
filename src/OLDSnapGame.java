import java.util.Scanner;

public class OLDSnapGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Snap Game!");
            System.out.println("Press Y to start the game. Good luck! :) ");

            String startGameInput = scanner.nextLine().trim().toLowerCase();

            if (!startGameInput.equals("y")) {
                System.out.println("Invalid input. Please enter 'Y' to start the game");
                continue;
            }

            int player1Snaps = playSnapHalf(scanner, "Player 1");
            int player2Snaps = playSnapHalf(scanner, "Player 2");

            System.out.println("Game Over!");
            System.out.println("Player 1 Snaps: " + player1Snaps);
            System.out.println("Player 2 Snaps: " + player2Snaps);

            if (player1Snaps > player2Snaps) {
                System.out.println("Player 1 wins!");
            } else if (player1Snaps < player2Snaps) {
                System.out.println("Player 2 wins");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println("Do you want to play again? (Y/N)");

            String playAgainInput = scanner.nextLine().trim().toLowerCase();
            if (!playAgainInput.equals("y")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }
        }
    }

    private static int playSnapHalf(Scanner scanner, String playerName) {
        Deck deck = new Deck();
        deck.shuffleDeck();

        Player player = new Player();
        Player player1 = new Player();
        Player player2 = new Player();

        dealCards(deck, player, player1, player2);

        System.out.println("Type 'snap' to snap when you see a match, or enter 0 to skip.");

        int snaps = 0;

        for (int i = 0; i < 13; i++) {
            Card card = player.playCard();
            System.out.println(playerName + " received: " + card);

            String userInput = scanner.nextLine().trim().toLowerCase();

            if (userInput.equals("snap")) {
                snaps++;
                System.out.println("SNAP! You have a match!");
            } else if (userInput.equals("0")) {
                System.out.println("Skipped");
            } else {
                System.out.println("Invalid input. Please type 'snap' to snap or 0 to skip. ");
            }
        }

        return snaps;
    }


    private static void dealCards(Deck deck, Player player1, Player player2, Player player) {
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

/*
    private static boolean isSnap(Player player1, Player player2) {
        Card card1 = player1.playCard();
        Card card2 = player2.playCard();

        if (card1 != null && card2 != null) {
            System.out.println("Player 1: " + card1 + "   Player 2: " + card2);
            return card1.getRank().equals(card2.getRank());
        } else {
            // One or both players ran out of cards
            System.out.println("No more cards to compare. Game over!");
            System.exit(0);
            return false;
        }
    }
 */




/*                    if () {

                    } else {
                        System.out.println("No match, keep going!");
                    } else if (userInput.equals("0")) {

                } else {
            }

            } else {
                System.out.println("No more cards to match. Game over!");
                break;
            }
        }


    }
*/

        /*
        while (player1.hasCards() && player2.hasCards()) {

            Card card2 = player2.playCard();

            System.out.println("Player 2 received: " + card2);




        if (!player1.hasCards()) {
            System.out.println("Player 1 has run out of cards!");
        }
        if (!player2.hasCards()) {
            System.out.println("Player 2 has run out of cards!");
        }
    }

         */
/*
        if (!player1.hasCards()) {
            System.out.println("Player 1 has run out of cards!");
        }
        if (!player2.hasCards()) {
            System.out.println("Player 2 has run out of cards!");
        }
 */

    /*
    public void printCards() {
        System.out.print("Player's cards: ");
        for (Card card : cards) {
            System.out.print(card + " ");
        }
        System.out.println();
    }

 */