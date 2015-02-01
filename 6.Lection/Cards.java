import java.util.HashMap;
import java.util.Scanner;

//Задача:
//Направете програма, която приема 5 карти от тестето за игра.
//Програмта трябва да извежда на екрана дали играчът има чифт, сет или каре.

public class Cards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] cards = new String[5];

		for (int i = 0; i < cards.length; i++) {
			System.out.println("Vuvedi " + (i + 1) + " karta");
			cards[i] = input.nextLine();
		}

		for (int i = 0; i < cards.length; i++) {
			String card2 = "10";
			if (cards[i].length() == 1 || cards[i].equals(card2)) {
				switch (cards[i]) {
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
				case "10":
				case "J":
				case "Q":
				case "K":
				case "A": {
					System.out.println("Valid card!");
					break;
				}
				}
			} else {
				System.out.print("Invalid card!");
				break;
			}
		}

		HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
		for (String cardss : cards) {
			Integer count = wordsCount.get(cardss);
			if (count == null) {
				count = 1;
			}
			wordsCount.put(cardss, count + 1);
			if (count == 4) {
				System.out.println(wordsCount + "Kare");
				break;
			} else if (count == 3) {
				System.out.println(wordsCount + "Set");
				break;
			} else if (count == 2) {
				System.out.println(wordsCount + "Chift");
			}
		}
	}

}
