import java.util.Scanner;

//Задача:
//Направете програма, която приема 20 числа и намира тройката поредни числа с най-голяма сума.

public class TwentyNumbersBiggestsSum {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 20 numbers to see which 3 serial "
				+ "numbers make the biggest sum: ");

		int[] arr = new int[20];

		for (int i = 0; i < 20; i++) {
			System.out.println("Enter " + (i + 1) + " number:");
			arr[i] = input.nextInt();
		}
		input.close();

		System.out.println("All numbers are: ");
		printNumbers(arr);

		int maxSum = Integer.MIN_VALUE;
		int maxSumStartIndex = -1;

		for (int a = 2; a < arr.length; a++) {
			int currentSum = arr[a] + arr[a - 1] + arr[a - 2];

			if (currentSum > maxSum) {
				maxSum = currentSum;
				maxSumStartIndex = a;
			}
		}
		System.out.println("\nThe biggest sum of 3 serial numbers is:" + maxSum);
		System.out.printf("The 3 serial numbers with max sum are: %d,%d,%d",
				arr[maxSumStartIndex - 2], arr[maxSumStartIndex - 1],
				arr[maxSumStartIndex]);

	}

	private static void printNumbers(int[] arr) {
		for (int b = 0; b < 20; b++) {
			System.out.print(arr[b] + ",");
		}
	}

}
