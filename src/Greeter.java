import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String answer=JOptionPane.showInputDialog(null,"Hi, what's your name?");
		JOptionPane.showMessageDialog(null, "Hello "+answer);
		
	}

}
