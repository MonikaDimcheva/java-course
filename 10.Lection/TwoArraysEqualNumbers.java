import java.util.HashSet;
import java.util.Scanner;

//Задача:
//Направете програма, която приема 2 масива от конзолата и извежда броя на съвпадащи числа.

public class TwoArraysEqualNumbers {

	public static void main(String[] args) {

		int[] arrOne = new int[4];
		int[] arrTwo = new int[4];

		Scanner input = new Scanner(System.in);

		System.out.println("You should enter 2 arrays with 10 numbers each to"
				+ " see which numbers are equal!\nEnter first array:");

		addNumbersInFirstArray(arrOne, input);

		System.out.println("This is the second array!\nEnter 10 numbers:");
		addNumbersInSecondArray(arrTwo, input);

		compareNumbersInTwoArrays(arrOne, arrTwo);

	}

	private static void addNumbersInFirstArray(int[] arrOne, Scanner input) {

		for (int i = 0; i < 4; i++) {
			System.out.println("Enter " + (i + 1) + " number:");
			arrOne[i] = input.nextInt();

		}
		for (int pr = 0; pr < 4; pr++) {
			System.out.print(arrOne[pr] + ",");

		}
		System.out.println();
	}

	private static void addNumbersInSecondArray(int[] arrTwo, Scanner input) {
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter " + (i + 1) + " number:");
			arrTwo[i] = input.nextInt();
			
		}
		for (int pr = 0; pr < 4; pr++) {
			
			System.out.print(arrTwo[pr] + ",");
		}
		System.out.println();
	}

	private static void compareNumbersInTwoArrays(int[] arrOne, int[] arrTwo) {
		for (int one = 0; one < 4; one++) {
			for (int two = 0; two < 4; two++) {
				if (arrOne[one] == arrTwo[two]) {
					System.out.println("The number that could be seen in both arrays is: "
									+ arrOne[one]);

				}
			}
		}

	}
}
