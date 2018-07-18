package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		// 2. Catch the user's answer in a String
		for(int score=10; score>0;) {
		String answer=JOptionPane.showInputDialog("spell mandlebrot");
		// 3. If the user spelled the word correctly, speak "correct"
		if(answer.equals("mandlebrot")){
			speak("Correct");
		}
		else if(answer.equals("Mandlebrot")){
			speak("Correct");
		}
		else {
			speak("Wrong");
			score=score-3;
		}}
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


