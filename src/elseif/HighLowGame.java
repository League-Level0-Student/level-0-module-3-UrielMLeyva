//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		Random randy = new Random();
		int number = randy.nextInt(100)+1;
		// 2. Print out the random variable above
		int random = new Random().nextInt(5);
		// 11. do the following 10 times
		for(int i=0;i<10;i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
				String guess = JOptionPane.showInputDialog("Guess a random number.");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int guess2 = Integer.parseInt(guess);
				 
			// 5. if the guess is correct
				// 6. win
			if(guess2==number) {
			JOptionPane.showMessageDialog(null, "You took the W");
			}
			// 7. if the guess is high
				// 8. tell them it's too high
			if(guess2>number) {
			JOptionPane.showMessageDialog(null, "You on your way to take that L");
			}
			// 9. if the guess is low
				// 10. tell them it's too low
			if(guess2<number) {
			JOptionPane.showMessageDialog(null, "You about to take a MASSIVE L");
			}
		
		}
		// 12. tell them they lose
			JOptionPane.showMessageDialog(null, "You took the FATTEST L of all time");
	}

}


