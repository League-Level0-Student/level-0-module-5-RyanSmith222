package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Robotmethods {

static Robot rob = new Robot();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rob.setSpeed(500);
		rob.penDown();	
		
	String input = JOptionPane.showInputDialog(null, "Enter a shape");	
	String input2 = JOptionPane.showInputDialog(null, "Enter a color  -  green or red");
		
	
	if(input2.equals("green")) {
		rob.setPenColor(0, 255, 0);
	}
	
	if(input2.equals("red")) {
		rob.setPenColor(255, 0, 0);
	}
	
	if(input.equals("circle")) {
		drawCircle();
	}
		
		
		
	if(input.equals("triangle")) {
		drawTriangle();
	}
		
		
		
	if(input.equals("square")) {
		drawSquare();
	}
		
		
		
		
		
	}

	public static void drawSquare() {
		
	
		
		
		
		for(int i = 0; i < 4; i++) {
			rob.move(50);
			rob.turn(90);
		}
		
		
		
		}
	
	
	
	
	public static void drawTriangle() {
		
	
		
		
		for(int i = 0; i < 4; i++) {
			rob.move(200);
			rob.turn(240);
		}
		
		
		
	}
	
	
	
	
public static void drawCircle() {
	

	
	//	for(int i = 0; i < 4; i++) {
	//	rob.move(200);
	
	rob.turn(360);
		
		//}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
