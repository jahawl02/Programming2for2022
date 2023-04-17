import java.util.Scanner;

/**
 * @author hawley
 *
 */
public class Input {
	
    /**
     * 
     */
    public static Scanner sc = new Scanner(System.in);
    
    /**
     * @param prompt
     * @return
     */
    public static String getLine(String prompt) {
		
		System.out.print(prompt);
		return sc.nextLine();
		
	} // end of getLine

    /**
     * @param prompt
     * @return
     */
    public static int getInt(String prompt) {
    	int userInput = 0;
		
		System.out.print(prompt);
		
		while (true) {
			if (sc.hasNextInt()) 
				break;
			
			System.out.printf("Invalid input! Please enter a number: ");
			sc.next();
			
		} // end of while
			
		userInput = sc.nextInt();
		sc.nextLine(); // consume newline left-over
		
		return userInput;
		
	} // end of getInt

    /**
     * @param prompt
     * @param low
     * @param high
     * @return
     */
    public static int getIntRange(String prompt, int low, int high) {
    	int userInput;
		
		System.out.print(prompt);
		
		while (true) {
			if (sc.hasNextInt()) {
				userInput = sc.nextInt();
				
				if (userInput >= low && userInput <= high) {
					break;
				} // end of if
				
    		} else {
    			sc.next();	
    		} // end of if-else
			
			System.out.printf("Invalid input! Please enter a number between (%d - %d): ", low, high);
			
		} // end of while
		
		sc.nextLine(); // consume newline left-over

		return userInput;
		
	} // end of getIntRange
	
} // end of Input class