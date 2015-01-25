import java.util.Scanner;

//Направете програма която приема 10 числа и ги сортира
//Използвайте различни алгоритми за сортиране
//Първи алгоритъм:Selection Sort

public class IntegersSort {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		int[] array = new int[10];
		int[] sortedArray = selectionSort(array);

		System.out.println("You should enter 10 numbers!");
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
