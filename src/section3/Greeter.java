package section3;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		
		String name= JOptionPane.showInputDialog(null, "What is your name?");
		
		JOptionPane.showMessageDialog(null, "hello " + name + " How are you today?");
		
		if(name.equals("Samantha")) {
			JOptionPane.showMessageDialog(null, "You are awesome!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are kinda cool");
		}
		
	}
	
}
