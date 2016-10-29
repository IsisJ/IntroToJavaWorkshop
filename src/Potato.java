import javax.swing.JOptionPane;

public class Potato {
public static void main(String[] args) {
	String ans=JOptionPane.showInputDialog("Do you want to see a song about potatos! Yes or no?");
	if (ans.equalsIgnoreCase("yes")){
	int num=0;
	while(num<=6){
		num=num +1;
		String po="potato";
		if(num==4){ 
			JOptionPane.showConfirmDialog(null, num);
			
		}
		else{
			System.out.println(num+po);
		}
		if(num==7){
			System.out.println(" more");
		}
				
			}
		}
		}}
	


