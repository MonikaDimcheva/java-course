import java.util.Scanner;

//Задача:
//Направете програма която извлича от подаден текст 
//всички изречения които съдържат дадена дума.

public class WordCount {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = input.nextLine();
		System.out.println("Enter word: ");
		String word = input.nextLine();

		String[] textTwo = text.split(" ");
		int count = 0;

		for (int i = 0; i < textTwo.length; i++) {

			if (textTwo[i].contains(word)) {
				count++;
			}
		}

		System.out.println("The word " + word + " is seen " + count
				+ " time(s) in the text!");

	}

}
