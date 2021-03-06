/* Lab 2 for CISC181, Lab Section 032, Group 3
 * Broadwater, Geoffrey
 * Moglia, David
 * Walker, Julia
 * Shaqsi, Radhawan
 * All members participated equally
 */

package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {
	
	private eSuit eSuit;
	private eRank eRank;
	
	
	
	public Card(pkgEnum.eSuit eSuit, pkgEnum.eRank eRank) {
		super();
		this.eSuit = eSuit;
		this.eRank = eRank;
	}

	
	public eSuit geteSuit() {
		return eSuit;
	}


	public void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}


	public eRank geteRank() {
		return eRank;
	}


	public void seteRank(eRank eRank) {
		this.eRank = eRank;
	}





	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return this.geteRank().compareTo(c.geteRank());

}
	
}
