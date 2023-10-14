package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		practice skills = new practice();
		practice.skills1();
		practice.skills2();
		practice.skills3();
		practice.skills4();
		practice.skills5();
		

		
	//	JOptionPane.showMessageDialog(null, skills);
	//String input =	JOptionPane.showInputDialog(null, skills);
	}
	
	
	 public static void skills1() {
		String input1 =	JOptionPane.showInputDialog(null, "How many dimes?");
		int numinp1 = Integer.parseInt(input1);
		int cents = numinp1 * 10;
		JOptionPane.showMessageDialog(null, cents +  " cents");
		String input2 =	JOptionPane.showInputDialog(null, "How tall are you?");
		int numinp2 = Integer.parseInt(input2);
		if(numinp2 < 36) {
			JOptionPane.showMessageDialog(null, "Eat more!");}
		else {
			JOptionPane.showMessageDialog(null, "Great job on growing tall! I know that you must have worked really hard on that.");
			}
	
	 }
	
	
	
	
	
	
	public static void skills2() {
		for(int i = 1; i  < 31; i++ ) {
			System.out.println(i);
		}
		
	}
	
	
	
	
	public static void skills3() {
		Random ran = new Random();
		int name1 = ran.nextInt(19-1+1+1);
		System.out.println(name1);
		
		int name2 = ran.nextInt(10-1+1+1);
		System.out.println(name2);
		int result = name1 - name2;
		JOptionPane.showMessageDialog(null, result);
	}
	
	
	
	public static void skills4() {
		String city =	JOptionPane.showInputDialog(null, "What city do you live in?");
		if(city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's finest city.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Move to San Diego.");
		}
	
		int cars = 3;
		
		JOptionPane.showMessageDialog(null, "The cars have eight wheels collectively.");
		
		
	
	}
	
	
	
	
	
	public static void skills5() {
		String school =	JOptionPane.showInputDialog(null, "What is the name of your school?");
	
		JOptionPane.showMessageDialog(null, school + " is a fantastic school!");
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
