import java.util.Scanner;

//Задача:
//Направете програма която чете от конзолата математически 
//израз и проверява дали са поставени правилно скобите за приоритет:
//Пример:
//4 * (5 - 2) + 6/(2 * (2 + 15)) – вярно
//2 + (2-6)) + 6/(8 - 1) - грешно

public class Maths {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter math task: ");
		String mathTwo = input.nextLine();
		int count = 0;

		char[] arrayTwo = mathTwo.toCharArray();

		for (int i = 0; i < arrayTwo.length; i++) {
			if (arrayTwo[i] == '(') {
				count++;
			} else if (arrayTwo[i] == ')') {
				count--;
			} else if (count < 0) {
				System.out.println("ERROR!");
				break;
			}
		}

		if (count == 0) {
			System.out.println("GOOD!");
		} else if (count < 0 || count > 0) {
			System.out.println("BAD!");
		}

	}

}
