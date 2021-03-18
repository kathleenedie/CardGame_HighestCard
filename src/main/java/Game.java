public class Game {


    private Deck gameDeck;
    private Card player1Card;
    private Card player2Card;


    public Game(Card player1Card, Card player2Card) {
        this.player1Card = null;
        this.player2Card = null;
    }

    public boolean player1CardIsNotNull(){
        if(this.player1Card != null){
            return true;
        }
        return false;
    }

    public void dealPlayer1Card(){
        gameDeck.createDeckArray();
        gameDeck.shuffleDeck();
        this.player1Card = gameDeck.dealCard();
        System.out.println(player1Card);
    }
}
