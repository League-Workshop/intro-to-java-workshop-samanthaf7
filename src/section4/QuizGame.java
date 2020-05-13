package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score= 0;
		// 2.  Ask the user a question 
		String color = JOptionPane.showInputDialog("What is Sam's favorite color?");
		// 3.  Use an if statement to check if their answer is correct
		if(color.equals("green")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "The correct answer was green!");
			score -= 1;
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String subject= JOptionPane.showInputDialog("What is Samantha's favorite subject?");
		if(color.contentEquals("science")) {
			JOptionPane.
		}
		// 6.  After all the questions have been asked, print the user's score 
		
		
		
	}
}
