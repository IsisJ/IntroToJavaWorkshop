import java.util.Random;

import javax.swing.JOptionPane;

public class magic8Ball {
	public static void main(String[] args) {
	
		
		//Ask the user for 3 questions
		for(int i=0; i<=2;i++){
			//Create a random number between 1 and 4
			int random =new Random().nextInt(4)+1;
			//Print the random number to the console
			System.out.println(random);
		JOptionPane.showInputDialog(null, "Give me a question");
	
		//if random is 1
		if(random==1){
			//say "It depends"
			JOptionPane.showInternalMessageDialog(null,"It depends");
		}
		//if random is 2
		if(random==2){
			//say "Maybe"
			JOptionPane.showMessageDialog(null, "Maybe");
		}
		//if random is 3
		if(random==3){
			//say "No"
			JOptionPane.showMessageDialog(null,"No");
		}
		//else
			else{
			//say "yes"
				JOptionPane.showMessageDialog(null,"Yes");
			}
		//Print out their answer
		}		
	}
}


