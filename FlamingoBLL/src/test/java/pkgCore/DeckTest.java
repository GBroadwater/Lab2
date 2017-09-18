package pkgCore;

import static org.junit.Assert.*;


import org.junit.Test;

public class DeckTest {

	private Deck d1 = new Deck(1);
	private Deck d2;
	@Test
	public void TestDeck() {
		assertEquals(52,d1.getDeckCards().size());
		d2 = new Deck(6);
		
		
		assertEquals(312, d2.getDeckCards().size());
		}
	}

