import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Card player1;
    private Card player2;
    private Game game;

    @Before
    public void before(){
        player1 = new Player ("Shug");
        player2 = new Player ("Doug");
        game = new Game;
    }

    @Test
    public void player1CardisNull(){
        assertEquals(false, game.player1CardIsNotNull());
    }
}
