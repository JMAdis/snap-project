import java.util.ArrayList;
import java.util.List;

public class Player {
    // List to store the cards in the player's hand
    private List<Card> cards;

    public Player() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    // Method to play a card
    public Card playCard() {
        if (!cards.isEmpty()) {
            // Remove and return the top card from the player's hand
            return cards.remove(cards.size() - 1);
        } else {
            return null; // No more cards in the player's hand
        }
    }

    // Method to check if the player has any cards in their hand
    public boolean hasCards() {
        return !cards.isEmpty();
    }
}
