package lv.anna.horoscope;

import java.util.Scanner;

public class TestUserInputCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] allMonths = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 

		Scanner sc = new Scanner (System.in);
		
		String userInput = sc.next();
		System.out.println("User input: "+userInput);
		int i = 0;
		while(!userInput.equals(allMonths[i])){
			++i;
			if(userInput.equals(allMonths[i])){
				System.out.println("Correct month input: "+allMonths[i]);
				

			}
		}
	}
}

