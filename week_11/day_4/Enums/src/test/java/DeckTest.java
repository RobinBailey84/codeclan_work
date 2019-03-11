import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
    }

    @Test
    public void startsWith52Cards() {
        deck.createDeck();
        assertEquals(52, deck.getNumberOfCards());
    }

}
