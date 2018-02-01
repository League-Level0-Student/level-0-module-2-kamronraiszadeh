package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random number= new Random () ;
	int num1=number.nextInt(60)+1;
	int num2=number.nextInt(60)+1;
	int num3=number.nextInt(60)+1;
	int num4=number.nextInt(60)+1;
	int num5=number.nextInt(60)+1;
	JOptionPane.showMessageDialog(null,"Your lottery numbers are:"+num1 +" " +num2 +" " +num3 +" " +num4 +" " +num5);
	
	
}
}
