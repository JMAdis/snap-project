import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> cards;

    public Player() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card playCard() {
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() - 1);
        } else {
            return null; // No more cards in the player's hand
        }
    }

    public boolean hasCards() {
        return !cards.isEmpty();
    }

}
