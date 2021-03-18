public class Card {

    private SuitType suit;
    private Rank rank;

    public Card(SuitType suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValueFromEnum() {
        return this.rank.getValue();
    }

}
