import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void hasEmptyDeck(){
        assertEquals(0, deck.suitArraySize());
        assertEquals(0, deck.rankArraySize());
        assertEquals(0, deck.deckArraySize());
    }

    @Test
    public void hasSuitArrayPopulatedWithSuits(){
        deck.createSuitArray();
        assertEquals(4, deck.suitArraySize());
    }


    @Test
    public void hasRankArrayPopulatedWithSuits(){
        deck.createRankArray();
        assertEquals(13, deck.rankArraySize());
    }

    @Test
    public void hasPopulatedDeckInCards(){
        deck.createDeckArray();
        assertEquals(52, deck.deckArraySize());
    }

    @Test
    public void canShuffleDeck(){
        deck.createDeckArray();
        deck.shuffleDeck();
        assertEquals(52, deck.deckArraySize());
    }

    @Test
    public void canDealCardFromDeck(){
        deck.dealCard();
        assertEquals(51, deck.deckArraySize());
    }
}
