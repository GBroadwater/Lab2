/* Lab 2 for CISC181, Lab Section 032, Group 3
 * Broadwater, Geoffrey
 * Moglia, David
 * Walker, Julia
 * Shaqsi, Radhawan
 * All members participated equally
 */
package pkgCore;

import java.util.UUID;

public class Player {

	private UUID PlayerID;
	private String PlayerName;
	public Player(String playerName) {
		
		PlayerID = UUID.randomUUID();
		this.PlayerName = playerName;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public UUID getPlayerID() {
		return PlayerID;
	}
	
	
	
}
