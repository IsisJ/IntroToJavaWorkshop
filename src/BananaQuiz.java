// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
	String fruit=JOptionPane.showInputDialog(null, "Do you like bananas?");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if(fruit.equals("no")){
			JOptionPane.showMessageDialog(null,"You're crazy!" );
			String fruits=JOptionPane.showInputDialog(null, "What would you put in a fruit salad?");
			JOptionPane.showMessageDialog(null, "You know bananas taste great in fruit salads! You should try it.");
			//String monkey=JOptionPane.showInputDialog(null,"Do you like monkeys?");
		}
		
		else if(fruit.equals("yes")){
			String hobby=JOptionPane.showInputDialog(null,"What is your favorite hobby?");
			JOptionPane.showMessageDialog(null,"Your "+hobby+" would be much better with bananas!!");
		}
			else {
			JOptionPane.showMessageDialog(null, "You're bananas!");
		}
			
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
	
	}

} 