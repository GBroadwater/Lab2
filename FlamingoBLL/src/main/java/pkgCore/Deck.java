package pkgCore;
import pkgEnum.*;
import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> cards;
	
	public Deck(){
		for (eRank eRank: eRank.values()) {
			for (eSuit eSuit: eSuit.values()) {
				cards.add(new Card(eSuit, eRank));
			}
		}
	}
	public Card Draw() {
		return (cards.remove(0));
		
	}

}
