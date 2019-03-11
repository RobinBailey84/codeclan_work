import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public void createCard(SuitType suit, RankType rank){
        Card card = new Card(suit, rank);
        this.cards.add(card);
    }

    public void createDeck(){
        for(SuitType suit : SuitType.values()){
            for(RankType rank : RankType.values()){
                createCard(suit, rank);
            }
        }
    }

    public int getNumberOfCards() {
        return this.cards.size();
    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }

    public Card dealCard(){
        return this.cards.remove(0);

    }


}
