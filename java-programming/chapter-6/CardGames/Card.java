package CardGames;

public class Card {
    public enum Suit {
        DIAMONDS("\u2666"),
        HEARTS("\u2665"),
        CLUBS("\u2663"),
        SPADES("\u2660");

        private final String value;

        Suit(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private final int value;
    private final Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return suit + " " + getValueAsString();
    }

    public String getValueAsString() {
        return switch (value) {
            case 1 -> "Ace";
            case 2 -> "2";
            case 3 -> "3";
            case 4 -> "4";
            case 5 -> "5";
            case 6 -> "6";
            case 7 -> "7";
            case 8 -> "8";
            case 9 -> "9";
            case 10 -> "10";
            case 11 -> "Jack";
            case 12 -> "Queen";
            default -> "King";
        };
    }
}
