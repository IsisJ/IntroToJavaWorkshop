import javax.swing.JOptionPane;

public class AnnoyingReminder {
public static void main(String[] args) {
	String numTimes= JOptionPane.showInputDialog(null, "How annoying am I on a scale of 1-100?");
	int num=Integer.parseInt(numTimes);
	for(int num1=0;num1<num;num1=num*num){
		JOptionPane.showMessageDialog(null, "WAKE UP");
	}

}
}
