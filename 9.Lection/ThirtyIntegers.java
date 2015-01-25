import java.util.Scanner;

//Задача:
//Направете програма, която приема 30 числа и намира всички тройки еднакви числа.


public class ThirtyIntegers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		int[] array = new int[10];
		int[] sortedArray = selectionSort(array);
		System.out.println("You should enter 30 numbers!");
		for (int i = 0; i < 10; i++) {

			System.out.println("Enter " + (i + 1) + " number: ");
			number = input.nextInt();
			array[i] = number;
		}

		selectionSort(array);
		System.out.print("Sorted array is: ");
		for (int s : sortedArray) {
			System.out.print(s + ",");
		}

		input.close();

		findThreeSameNumbers(sortedArray);
	}

	private static void findThreeSameNumbers(int[] sortedArray) {
		int countThrees = 0;

		for (int i = 2; i < sortedArray.length; i++) {

			int first = sortedArray[i - 2];
			int middle = sortedArray[i - 1];
			int second = sortedArray[i];

			if (first == second && first == middle) {
				countThrees++;
			}
		}

		System.out.println("\nNumber of three same numbers: " + countThrees);

	}

	private static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}

			int smallest = array[index];
			array[index] = array[i];
			array[i] = smallest;
		}
		return array;

	}
}
