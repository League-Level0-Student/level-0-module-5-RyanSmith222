package _02_nested_loops._3_for_loop_gauntlet;

public class gauntlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//	for(int i = 0; i < 100; i++)	
		
		for(int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		
		for(int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		
		
		for(int i = 0; i < 101; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 0; i < 101; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 0; i < 101; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " is even");
				
				
					
				}
			else {
				System.out.println(i + " is odd");
			}
		}
		
		
		for(int i = 0; i < 778; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
		
		
		
	}
			
		}
		
		
		
		
		for(int i = 1974; i < 2023; i++) {
			System.out.println("In " + i + ", I was " + (i - 1974));
		}
		
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++)	{
				System.out.println(i + "" + j);
			}
		}
		
		
		
		
		
		
		
		
	}
}


