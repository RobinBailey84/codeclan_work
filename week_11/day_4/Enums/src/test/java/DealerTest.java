import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DealerTest {

    Dealer dealer;
    Player player;
    Player player2;
    Deck deck;

    @Before
    public void setUp(){

        dealer = new Dealer();
        player = new Player("Player 1");
        player2 = new Player("Player 2");
        deck = new Deck();
        deck.createDeck();

    }

    @Test
    public void gameHasPlayer() {
        dealer.addPlayerToGame(player);
        assertEquals(1, dealer.countPlayers());
    }

    @Test
    public void playerGetsCard() {
        dealer.addPlayerToGame(player);
        dealer.dealsCard(player, deck);
        assertEquals(1, player.countCards());
    }

    @Test
    public void houseIsDealtCard() {
        dealer.houseCardDealt(deck);
        assertEquals(1, dealer.countHouseCards());
    }

    @Test
    public void canPlayGame() {
        dealer.playGame(player, deck);
    }
}
