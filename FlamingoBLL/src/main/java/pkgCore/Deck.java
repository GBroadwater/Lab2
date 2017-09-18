/* Lab 2 for CISC181, Lab Section 032, Group 3
 * Broadwater, Geoffrey
 * Moglia, David
 * Walker, Julia
 * Shaqsi, Radhawan
 * All members participated equally
 */
package pkgCore;
import pkgEnum.*;
import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> deckCards = new ArrayList();
	
	public Deck(int numberOfDecks){
		for (int i = 0; i < numberOfDecks; i++) {
			for (eRank eRank: eRank.values()) {
				for (eSuit eSuit: eSuit.values()) {
					deckCards.add(new Card(eSuit, eRank));
				}
			}
		}
	}
	
	
	
	public ArrayList<Card> getDeckCards() {
		return deckCards;
	}



	public void setDeckCards(ArrayList<Card> deckCards) {
		this.deckCards = deckCards;
	}



	public Card Draw() {
		return (deckCards.remove(0));
		
	}

}
