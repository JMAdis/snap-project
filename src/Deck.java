import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = createDeck();
        shuffleDeck();
    }

    private List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();
        String[] suits = {"♥", "♦", "♣", "♠"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

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

    public Card dealCard() {
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() - 1);
        } else {
            return null; // No more cards in the deck
        }
    }
    public boolean hasCards() {
        return !cards.isEmpty();
    }

    private List<Card> sortBySuits(){
        List <Card> sortedDeck = new ArrayList<>(cards);
        sortedDeck.sort((card1, card2) ->
                card1.getSuit().compareTo(card2.getSuit()));
        return sortedDeck;
    }

    private List<Card> sortByRanks() {
        List <Card> sortedDeck = new ArrayList<>(cards);
        sortedDeck.sort((card1, card2) ->
                card1.getRank().compareTo(card2.getRank()));
        return sortedDeck;
    }
}
