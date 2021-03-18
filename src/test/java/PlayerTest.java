import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Player player2;

    @Before
    public void before(){
        player1 = new Player("Shug");
        player2 = new Player("Doug");
    }

    @Test
    public void getPlayerName(){
        assertEquals("Shug", player1.getName());
    }

}
