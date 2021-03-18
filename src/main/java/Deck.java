

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;



public class Deck {

    private ArrayList<Card> deck;
    private ArrayList<SuitType> suit;
    private ArrayList<Rank> rank;

    public Deck() {
        this.deck = new ArrayList<Card>();
        this.suit = new ArrayList<SuitType>();
        this.rank = new ArrayList<Rank>();
    }

    public int suitArraySize() {
        return this.suit.size();
    }

    public void createSuitArray(){
        for (SuitType suit : SuitType.values()){
            this.suit.add(suit);
        }
    }


    public int rankArraySize() {
        return this.rank.size();
    }

    public void createRankArray() {
        for(Rank rank : Rank.values()){
            this.rank.add(rank);
        }
    }

    public int deckArraySize() {
        return this.deck.size();
    }

    public void createDeckArray() {
        for(SuitType suit : SuitType.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                this.deck.add(card);
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }


    public Card dealCard() {
        createDeckArray();
        shuffleDeck();
        Card cardDealt = null;
        cardDealt = this.deck.remove(0);
        System.out.println("card is " + cardDealt.getRank() + " of " + cardDealt.getSuit());
        return cardDealt;
    }
}

//    create list of suits Y
//    create list of rank Y
//    for each index of enum Suit nY
//    loop through index rank and
//    run constructor for card
