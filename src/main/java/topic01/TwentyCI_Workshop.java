package topic01;

import java.util.Scanner;

public class TwentyCI_Workshop {

	public static void main(String[] args) {
		inputText();
	}

	public static void inputText() {
		System.out.print("Input your text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		spinWords(text);
	}

	public static void spinWords(String text) {
		boolean hasDigit = text.matches(".*\\d+.*");
		if (!hasDigit) {
			String[] words = text.split("\\s+");
			for (int i = 0; i < words.length; i++) {
				words[i] = words[i].replaceAll("[^\\w]", "");
				if (words[i].length() >= 5) {
					words[i] = new StringBuilder(words[i]).reverse().toString();
				}
				System.out.print(words[i] + " ");
			}
		} else {
			System.out.println("Your text contains number, please input again");
			inputText();
		}
	}
}
