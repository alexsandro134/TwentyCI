package topic01;

import java.util.Scanner;

public class TwentyCI_Workshop {

	public static void main(String[] args) {
		System.out.print("Input your text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		while (!checkDigit(text)) {
			spinWords(text);
		}
	}

	public static boolean checkDigit(String text) {
		boolean hasDigit = text.matches(".*\\d+.*");
		return hasDigit;
	}

	public static void spinWords(String text) {
		String[] words = text.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].replaceAll("[^\\w]", "");
			if (words[i].length() >= 5) {
				words[i] = new StringBuilder(words[i]).reverse().toString();
			}
			System.out.print(words[i] + " ");
		}
	}
}
