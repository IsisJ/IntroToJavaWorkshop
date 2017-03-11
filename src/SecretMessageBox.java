import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		//1. Ask the user for a user name
		String userName= JOptionPane.showInputDialog("What is your username?");
		//2.Ask the user for a password
		String usersPassword= JOptionPane.showInputDialog("What is your password?");
		//3.Check if the answers match the real password and user name
		if(userName.equals("Esme") && usersPassword.equals("AmIRightOrAmIRight?!") ){
		//4.If user's answers match, show a secret message
			JOptionPane.showMessageDialog(null, "I've been expecting you!");
		}
		//5.If it doesn't, pop up: INTRUDER!
		else{
			JOptionPane.showMessageDialog(null, "INTRUDER ALERT!!");
		}
	}

}
