
import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;

public class stevenHawkens {
	public static void main(String[] args) {

		int random = new Random().nextInt(5) + 1;
		for (int i = 0; i <= random; i = i + 1) {
			// 1. make a main method and put steps 2, 3 & 4 inside it
			// 2. ask the user for a sentence
			String sentence = JOptionPane.showInputDialog("Give me a sentence.");
			// 3. call the speak method below and send it the sentence
			speak(sentence);
		}
	}
	// 4. repeat steps 2 and 3 a lot of times

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

// Copyright Wintriss Technical Schools 2014
