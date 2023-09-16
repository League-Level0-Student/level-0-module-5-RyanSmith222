import javax.swing.JOptionPane;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
String input = JOptionPane.showInputDialog(null, "Give a number.");

int n = Integer.parseInt(input);


for(int i = 2; i < n-1; i++) {
	if(n % i == 0) {
		JOptionPane.showMessageDialog(null, "Composite");	
		System.exit(0);
	}
		
		//else if(n==1) {
		//	JOptionPane.showMessageDialog(null, "Composite");
	//}
	
	else {
			JOptionPane.showMessageDialog(null, "Prime");
			System.exit(0);
			}	
}
	
	
	
	
	

	
}


		
		
		
		
		
		
		
		
		
		
		
		
	}

	

	
	
	
	
	
	

