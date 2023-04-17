
/**
 * @author hawley
 *
 */
public class Team {
	
	/**
	 * 
	 */
	private String name;
	
	/**
	 * 
	 */
	private Player player1;
	
	/**
	 * 
	 */
	private Player player2;
	
	/**
	 * 
	 */
	public Team() {
		this.name = null;
		this.player1 = new Player();
		this.player2 = new Player();
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return
	 */
	public Player getPlayer1() {
		return player1;
	}
	
	/**
	 * @param name
	 * @param number
	 */
	public void setPlayer1(String name, int number) {
		player1.setName(name);
		player1.setNumber(number);
	}
	
	/**
	 * @return
	 */
	public Player getPlayer2() {
		return player2;
	}
	
	/**
	 * @param name
	 * @param number
	 */
	public void setPlayer2(String name, int number) {
		player2.setName(name);
		player2.setNumber(number);
	}
	/**
	 * @return
	 */
	public int getTeamPoints() {
		return player1.getTotalPoints() + player2.getTotalPoints();
	}
	/**
	 * @return
	 */
	public int getTeamFouls() {
		return player1.getFouls() + player2.getFouls();
	}
	
	/**
	 * 
	 */
	public void listPlayers() {
		System.out.println("#1 " + player1.getName() + " Jersey " + player1.getNumber());
		System.out.println("#2 " + player2.getName() + " Jersey " + player2.getNumber());
	}
	
	/**
	 * 
	 */
	public void displayStats() {
		System.out.println(name + " Fouls= " + getTeamFouls() + " Points= " + getTeamPoints());
	}
}
