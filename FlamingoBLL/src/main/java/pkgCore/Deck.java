package pkgCore;
import pkgEnum.*;
import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> deckCards;
	
	public Deck(){
		for (eRank eRank: eRank.values()) {
			for (eSuit eSuit: eSuit.values()) {
				deckCards.add(new Card(eSuit, eRank));
			}
		}
	}
	public Card Draw() {
		return (deckCards.remove(0));
		
	}

}
