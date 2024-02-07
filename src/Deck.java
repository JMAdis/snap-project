import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // List to store the cards in the deck
    private List<Card> cards;

    public Deck() {
        cards = createDeck();
        shuffleDeck();
    }

    // Method to create a standard deck of 52 cards
    private List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();
        String[] suits = {"♥", "♦", "♣", "♠"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        // Creating cards for each combination of suit and rank
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }

        return deck;
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    // Method to deal a card from the top of the deck
    public Card dealCard() {
        if (!cards.isEmpty()) {
            // Remove and return the top card from the deck
            return cards.remove(cards.size() - 1);
        } else {
            return null; // No more cards in the deck
        }
    }

    // Method to check if the deck has any cards
    public boolean hasCards() {
        return !cards.isEmpty();
    }

    // Method to sort the deck by suits
    private List<Card> sortBySuits(){
        List <Card> sortedDeck = new ArrayList<>(cards);
        sortedDeck.sort((card1, card2) ->
                card1.getSuit().compareTo(card2.getSuit()));
        return sortedDeck;
    }

    // Method to sort the deck by ranks
    private List<Card> sortByRanks() {
        List <Card> sortedDeck = new ArrayList<>(cards);
        sortedDeck.sort((card1, card2) ->
                card1.getRank().compareTo(card2.getRank()));
        return sortedDeck;
    }
}
