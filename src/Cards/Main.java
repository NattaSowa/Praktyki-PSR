package Cards;

public class Main {
    public static void main(String[] args){

        Deck deck= new Deck();

        for (Card c: deck.deck){
            System.out.println(c);
        }
    }
}