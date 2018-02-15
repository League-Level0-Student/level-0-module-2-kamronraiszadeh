package extra;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ValintinesDay {
public static void main(String[] args) {
	Robot rob = new Robot("mini");
	rob.setWindowImage("download.jpg");
	rob.setPenColor(Color.GREEN);
	rob.moveTo(550, 150);
	rob.penDown();
	rob.setSpeed(100);
	int x = rob.getX();
	int yang = rob.getY();
	for (int a = 0; a < 2; a++) {
		
	rob.setAngle(0);
	for (int i = 0; i < 180; i++) {
	rob.move(1);	
	rob.turn(-1);
	}
	
	}
	int y = rob.getX();
	int s = (Math.abs(x-y)/2)+y;
	int side1 = Math.abs(x-y)/2;
	rob.turn(-20);
	int len = 0;
	while(rob.getX()<=s) {
	rob.move(1);
	len++;
	}
///	double angle = Math.asin(side1/len);
	//rob.turn((180));
	//int real = (int) (angle)*100;
	//System.out.println(real);
	//System.out.println(angle);
	//rob.turn(2*real);
	//rob.move(len);
	rob.setX(x);
	rob.setY(yang);
	rob.setAngle(-160);
	rob.move(len);
}}
