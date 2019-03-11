import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> playersCards;

    public Player(String name){
        this.name = name;
        this.playersCards = new ArrayList<Card>();
    }

    public void getsCard(Card card){
        this.playersCards.add(card);
    }

    public void cardDealt(Deck deck){
        Card dealtCard = deck.dealCard();
        getsCard(dealtCard);
    }

    public int countCards() {
        return this.playersCards.size();
    }
}
