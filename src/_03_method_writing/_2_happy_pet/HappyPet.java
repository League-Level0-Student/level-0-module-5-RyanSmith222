package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	static int happinessLevel = 0;
	static String pet  =	JOptionPane.showInputDialog(null, "What kind of pet do you want to buy?");
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable

	
		
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
//	JOptionPane.showOptionDialog( "cuddle", "food", "water", "take a walk", "groom", "clean up poop");
	
	
	
	
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Which option will you pick?", "Pet Care", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "water" }, null);

			
			if(task == 0) {
				cuddle();
			}
			

			if(task == 1) {
				food();
			}
			
			if(task == 2) {
				water();
			}
			
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.



public static void water() {
	JOptionPane.showMessageDialog(null, "Your " + pet + " is hydrated!");
	happinessLevel += 1;
}

public static void food() {
	JOptionPane.showMessageDialog(null, "Your " + pet + " is fed!");	
	happinessLevel += 1;
}

public static void cuddle() {
	JOptionPane.showMessageDialog(null, "Your " + pet + " is cuddled!");
	happinessLevel += 1;
}







}