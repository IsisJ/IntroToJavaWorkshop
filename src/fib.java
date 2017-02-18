import javax.swing.JOptionPane;

public class fib {
public static void main(String[] args) {
	int i=0;
	int j=1;
	String howManyFibonacciNums=JOptionPane.showInputDialog(null, "How many fibonacci numbers do you want to see?");
	int answer=Integer.parseInt(howManyFibonacciNums);
	System.out.print(i+" ");
	System.out.print(j+" ");
	for(int count=3; count<=answer;count=count+1){
		int k=i+j;
		//JOptionPane.showMessageDialog(null, k+" ");
		System.out.print(k +" " );
		i=j;
		j=k;
		
	}
}
}
