package homework2;

//Задача:
//Направете програма която приема 5 числа от конзолата и ги сортира по големина. 
//След сортирането изведете масива на екрана

import java.util.Scanner;

public class SortingNumbers {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();
		System.out.println("Enter second number: ");
		int secondNumber = input.nextInt();
		System.out.println("Enter third number: ");
		int thirdNumber = input.nextInt();
		System.out.println("Enter forth number: ");
		int forthNumber = input.nextInt();
		System.out.println("Enter fifth number: ");
		int fifthNumber = input.nextInt();

		System.out.println("Numbers are: " + firstNumber + "," + secondNumber
				+ "," + thirdNumber + "," + forthNumber + "," + fifthNumber);

		int[] array = { firstNumber, secondNumber, thirdNumber, forthNumber,
				fifthNumber };
		int length = array.length;
		int variable;
		int swapTemp;
		boolean swap = true;

		do {
			swap = false;

			for (variable = 0; variable < (array.length - 1); variable++) {
				if (array[variable] > array[variable + 1]) {
					swapTemp = array[variable];
					array[variable] = array[variable + 1];
					array[variable + 1] = swapTemp;
					swap = true;
				}

			}
		} while (swap);

		for (int i = 0; i < length; i++) {
			System.out.println("Sorted array in ascending order is: "
					+ array[i]);
		}

	}
}
