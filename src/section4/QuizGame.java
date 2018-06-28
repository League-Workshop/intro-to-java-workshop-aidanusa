package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int x = (0);

		// 2. Ask the user a question
		String question1 = JOptionPane.showInputDialog("How many countries are in the UN(United Nations)?");

		// 3. Use an if statement to check if their answer is correct
		if (question1.equals("195")) {
			x++;
		}

		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String question2 = JOptionPane.showInputDialog("What is pikachu's original form?");
		if (question2.equals("Pichu")) {
			x++;
		}

		String question3 = JOptionPane
				.showInputDialog("What is the fastest speed The Flash(Wally West) has ever reached?");
		if (question3.equals("23 tredecillion times the speed of light")) {
			x++;
		}

		String question4 = JOptionPane.showInputDialog("How old is Lionel Messi?");
		if (question4.equals("31")) {
			x++;
		}
		if (x == 1) {
			JOptionPane.showMessageDialog(null, "You scored " + x + " point!");
		} else {
			JOptionPane.showConfirmDialog(null, "You scored " + x + " points!");
		}

		// 6. After all the questions have been asked, print the user's score

	}
}
