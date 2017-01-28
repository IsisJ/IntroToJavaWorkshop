
import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {

		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100) + 1;
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 1; i <= 10; i = i + 1) {
			// 1. ask the user for a guess using a pop-up window, and save their
			// response
			String ans = JOptionPane.showInputDialog("Guess a number between 1-100.");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int num = Integer.parseInt(ans);
			// 5. if the guess is correct
			if (num == random) {
				JOptionPane.showMessageDialog(null, "Congrats! You guesssed the right number, you win!");
				System.exit(0);
			}
			// 6. win
			// 7. if the guess is high
			if (num > random) {
				JOptionPane.showMessageDialog(null, "Your guess was too high, try again.");
			}
			// 8. tell them it's too high
			// 9. if the guess is low
			if (num < random) {
				JOptionPane.showMessageDialog(null, "Your guess was too low, try again.");
			}
			if (i == 10) {
				JOptionPane.showMessageDialog(null, "You didn't guess the right number, you lose!");
			}
		}
		// 10. tell them it's too low

		// 12. tell them they lose
	}

}
