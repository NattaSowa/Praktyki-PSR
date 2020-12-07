package Cards;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    List<Card> deck;

    public Deck(){

        deck = new ArrayList<>();

        String[] colors = {"Pik", "Karo", "kier", "Trefl"};
        String znak;

        for (String color: colors){

            for (int i=1; i<=14; i++){
                switch (1){
                    case 11: znak="J"; break;
                    case 12: znak="Q"; break;
                    case 13: znak="K"; break;
                    case 14: znak="A"; break;
                    default: znak=Integer.toString(i);
                }
                Card card = new Card(color, i, znak);
                deck.add(card);
            }
        }

    }

}
