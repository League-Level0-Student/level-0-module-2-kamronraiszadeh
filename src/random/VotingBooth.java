package random;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog ("What is your age");
	
	int num=Integer.parseInt(age);
	
	if (num>=18) {
		JOptionPane.showInputDialog ("Who do you want to vote for");	
		}
	
	if (num<=17) {
		JOptionPane.showMessageDialog (null,"No one cares what you think. Get out");	
	}
}
}
