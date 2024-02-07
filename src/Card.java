public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getters to retrieve the rank and suit of the card
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    // Overriding the toString method to represent the card as a string
    @Override
    public String toString() {
        return rank + suit;
    }
}
