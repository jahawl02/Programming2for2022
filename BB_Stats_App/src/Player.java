
/**
 * @author hawley
 *
 */
public class Player {
	
	/**
	 * 
	 */
	private String name;
	
	/**
	 * 
	 */
	private int number;
	
	/**
	 * 
	 */
	private int freeThrowAttempts;
	
	/**
	 * 
	 */
	private int twoPointAttempts;
	
	/**
	 * 
	 */
	private int threePointAttempts;
	
	/**
	 * 
	 */
	private int freeThrowsMade;
	
	/**
	 * 
	 */
	private int twoPointMakes;
	
	/**
	 * 
	 */
	private int threePointMakes;
	
	/**
	 * 
	 */
	private int fouls;

	/**
	 * 
	 */
	public Player() {
		name = null;
		number = 0;
		freeThrowAttempts = 0;
		twoPointAttempts = 0;
		threePointAttempts = 0;
		freeThrowsMade = 0;
		twoPointMakes = 0;
		threePointMakes = 0;
		fouls = 0;
	}

	/**
	 * @param name
	 * @param number
	 */
	public Player(String name, int number) {
		this();
		this.name = name;
		this.number = number;
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
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @param shotType
	 * @param made
	 */
	public void shotAttempt(int shotType, boolean made) {
		switch (shotType) {
		case 1:
			freeThrowAttempts++;
			freeThrowsMade += made ? 1 : 0;
			break;
		case 2:
			twoPointAttempts++;
			twoPointMakes += made ? 1 : 0;
			break;
		case 3:
			threePointAttempts++;
			threePointMakes += made ? 1 : 0;
			break;
		default:
			System.out.println("Invalid shot type = "+shotType);
		}
	}
	
	/**
	 * @return
	 */
	public int getFreeThrowAttempts() {
		return freeThrowAttempts;
	}

	/**
	 * @return
	 */
	public int getTwoPointAttempts() {
		return twoPointAttempts;
	}

	/**
	 * @return
	 */
	public int getThreePointAttempts() {
		return threePointAttempts;
	}

	/**
	 * @return
	 */
	public int getFreeThrowMakes() {
		return freeThrowsMade;
	}

	/**
	 * @return
	 */
	public int getTwoPointMakes() {
		return twoPointMakes;
	}

	/**
	 * @return
	 */
	public int getThreePointMakes() {
		return threePointMakes;
	}

	/**
	 * @return
	 */
	public int getFouls() {
		return fouls;
	}

	/**
	 * 
	 */
	public void foul() {
		fouls++;
	}
	
	/**
	 * 
	 */
	public void displayFullStat() {
		System.out.println("===========================");
		System.out.println("		Attempts Baskets Percent");
		System.out.printf("1 point		%8d\n", freeThrowAttempts, freeThrowsMade, freeThrowsMade);
		System.out.printf("2 point		%8d\n", twoPointAttempts, twoPointMakes, twoPointMakes);
		System.out.printf("3 point		%8d\n", threePointAttempts, threePointMakes, threePointMakes);
		}
	
	/**
	 * 
	 */
	public void displayQuickStat() {
		System.out.println("#" + number + " " + name + " fouls= " + fouls + " Points= " + getFouls());
	}
	
	/**
	 * @return
	 */
	public int getTotalPoints() {
		return freeThrowsMade + (twoPointMakes * 2) + (threePointMakes * 3);
		
	}
	
}
