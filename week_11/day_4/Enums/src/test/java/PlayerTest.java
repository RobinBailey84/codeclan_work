import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;

    @Before
    public void before(){
        player = new Player("Player 1");
        deck = new Deck();
        deck.createDeck();
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, player.countCards());
    }

    @Test
    public void playerIsDealtCard() {
        player.cardDealt(deck);
        assertEquals(1, player.countCards());
    }
}
