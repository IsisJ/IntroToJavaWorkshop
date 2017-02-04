import javax.swing.JOptionPane;

public class MorningZombie {
	static void dayPrint(String dayOfWeek) {
		JOptionPane.showMessageDialog(null, "It's "+ dayOfWeek+ "! Get moving!!");
		JOptionPane.showMessageDialog(null, "Brush your teeth...");
		JOptionPane.showMessageDialog(null, "...and don't forget to draw on your freckles.");
	}

	public static void main(String[] args) {
		String day = JOptionPane.showInputDialog(null, "What is today?");
		if (day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Thursday")||day.equalsIgnoreCase("Friday")||day.equalsIgnoreCase("Staurday")||day.equalsIgnoreCase("Sunday")) {
			dayPrint(day);
		}
		//else if(day.equalsIgnoreCase("Tuesday")){
			//dayPrint(day);
		//}
		//else if(day.equalsIgnoreCase("Wednesday")){
			//dayPrint(day);
		//}
		//else if(day.equalsIgnoreCase("Thursday")){
			//dayPrint(day);
		//}
		//else if(day.equalsIgnoreCase("Friday")){
			//dayPrint(day);
		//}
		//else if(day.equalsIgnoreCase("Saturday")){
			//dayPrint(day);
		//}
		//else if(day.equalsIgnoreCase("Thursday"))}
	//dayPrint(day);
	//}
}}
