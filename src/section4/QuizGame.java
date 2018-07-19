package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {
		int score = 0;
		// 1. Create a variable to hold the user's score
		String firstanswer = JOptionPane.showInputDialog("What year was Andrew Jackson was born");
		if (firstanswer.equals("1767")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "You are correct. Your score is " + Integer.toString(score));
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. The correct answer is 1767");
		}
		String secondanswer = JOptionPane.showInputDialog("What year did Washington become a state");
		if (secondanswer.equals("1889")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "You are correct. Your score is " + Integer.toString(score));
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. The correct answer is 1889.");
		}
		String thirdanswer = JOptionPane.showInputDialog("What was the fourth state admitted to the union");
		if (thirdanswer.equals("Georgia") && thirdanswer.equals("georgia")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "You are correct. Your score is " + Integer.toString(score));
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong. The correct answer is Georgia");
		}
		String fourthanswer = JOptionPane.showInputDialog("What war had the largest casualties on Americans");

		if (fourthanswer.equals("The Civil War") && fourthanswer.equals("The American Civil War")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "You are correct. Your score is " + Integer.toString(score));

		}
		else {
			JOptionPane.showMessageDialog(null, "Game over");
		}
		// 3. Use an if statement to check if their answer is correct

		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		// 6. After all the questions have been asked, print the user's score

	}
}
