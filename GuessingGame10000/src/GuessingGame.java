import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		Random randGen = new Random();
		int target = randGen.nextInt(10000) + 1;
		
		int userEntry;
		int minRange = 1;
		int maxRange = 10000;
		
		System.out.println("Please enter a value between " + minRange + " and " + maxRange + ":");
		userEntry = scnr.nextInt(); //user entry
		

			//LOOP until user entry equals target number
		while(userEntry != target) {
			
			if (userEntry < target){ //higher, userEntry too low
					
					if (userEntry >= 1 && userEntry <= 10000) {
						minRange = userEntry + 1;  //min reset
					}
					
					System.out.println("HIGHER"); 
					System.out.println("Please enter a value between " + minRange + " and " + maxRange + ":");
					userEntry = scnr.nextInt(); //user entry
				
			} else if (userEntry > target) { //lower, userEntry too high
				
					//max reset
					if (userEntry >= 1 && userEntry <= 10000) {
						maxRange = userEntry - 1;
					}
					
					System.out.println("LOWER");
					System.out.println("Please enter a value between " + minRange + " and " + maxRange + ":");
					userEntry = scnr.nextInt(); //user entry
			} 
		
		} //end while loop
			
				//userEntry == target
				System.out.println("WINNER");
		
		
		
	} //end main

} //end class
