
/* Jared Hawley

 * Date: 2/1/2022
 * Description: This code will calculate the invoice total of the total items that the
 * user enters
*/

import java.util.Scanner;

public class InvoiceApp {

    @SuppressWarnings("resource")//stops warnings from appearing
	public static void main(String[] args) {
    	
    	double subtotal = 0.0;
    	double discountPercent = 0.0;
    	double discountAmount = 0.0;
    	double total = 0.0;
    	
    	String choice = "y";
    	String input = "?";
    	
  
        
        int numOfLines = 0;//integer used to get the users input on how many items 
        
    	
        
        System.out.println("Welcome to the Invoice Total Calculator V2");//introduces a welcome screen to the user
        System.out.println(); 
        
    
        Scanner sc = new Scanner(System.in);
        

        
        choice = "y";//this while loop keeps going when the user inputs the letter "y"
        while (choice.equalsIgnoreCase("y")) {
            
           System.out.print("Enter the number of items:   ");
           input = sc.nextLine();
           numOfLines = Integer.parseInt(input);
           
            
            System.out.println("================================================");//this print line creates a header for the code
            
            
            for (int i = 0; i < numOfLines; i++){
            	System.out.print("How much is each item: ");
            	input = sc.nextLine();
            	subtotal += Double.parseDouble(input);//this returns a new double represented by a string
            }
        
            if (subtotal >= 500) {
                discountPercent = .25;
            } else if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            discountAmount = subtotal * discountPercent;//used to calculate the discount amount
            total = subtotal - discountAmount;//used to calculate the total from subtotal - discount amount 

            System.out.printf("%20s: %, 10.2f\n", "Subtotal", subtotal);
            System.out.printf("%20s: %, 10.2f\n", "Discount percent", discountAmount);
            System.out.printf("%20s: %, 10.2f\n", "Invoice total", total);
            System.out.println(); 
            System.out.println("================================================");//this print line creates a footer
            
            
            System.out.print("Continue? (y/n): ");//asks the user if they want to continue using the invoice calculator
            choice = sc.nextLine();
            System.out.println();
            
            subtotal = 0;
        }
    }    
}