import java.util.ArrayList;

public class Dealer {

    private ArrayList<Player> players;
    private ArrayList<Card> house;

    public Dealer(){
        this.players = new ArrayList<Player>();
        this.house = new ArrayList<Card>();
    }

    public void addPlayerToGame(Player player){
         this.players.add(player);
    }

    public void dealsCard(Player players, Deck deck){
        for(Player player : this.players){
                Card card = deck.dealCard();
                player.getsCard(card);
            }
        }


    public int countPlayers() {
        return this.players.size();
    }

    public int countHouseCards(){
        return this.house.size();
    }

    public void houseGetsCard(Card card){
        this.house.add(card);
    }

    public void houseCardDealt(Deck deck){
        Card dealtCard = deck.dealCard();
        houseGetsCard(dealtCard);
    }

//    public boolean playGame(Player players, Deck deck){
////        Card playersCard = dealsCard(players, deck);
////        for(Player player : this.players){
////            if(playersCard.rankType.value() > house.rankType.value()){
////                return true;
////            }
////        }
////        return false;
////    }

    public boolean playGame(Player players, Deck deck){
        Card playerCard = dealsCard(players, deck);
    }

}
