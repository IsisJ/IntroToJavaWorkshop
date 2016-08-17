package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String friend=JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if ( friend.equals("yes")){
	speak("You will rule the world! Ha ha ha ha ha ha ha ha ha!");
}
else{
		// 3. Otherwise, wish them good luck washing dishes.
JOptionPane.showMessageDialog(null,"Ha. Too bad. Good luck washing the dishes!");
	}
}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
