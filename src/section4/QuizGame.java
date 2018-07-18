package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {
		int score=0;
		// 1.  Create a variable to hold the user's score 
		String firstanswer =JOptionPane.showInputDialog("What year was Andrew Jackson was born");
		if(firstanswer.equals("1767")){
			score=score+5;
			speak("You are correct. Your score is"+Integer.toString(score));
			
		}
	}
	// 3. Use an if statement to check if their answer is correct

	// 4. if the user's answer is correct

	// -- add one to their score

	// 5. Create more questions by repeating steps 1, 2, and 3 below.

	// 6. After all the questions have been asked, print the user's score

}
