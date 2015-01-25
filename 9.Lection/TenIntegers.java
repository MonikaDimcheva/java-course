import java.util.Scanner;

//Задача:
//Направете програма която приема масив от 10 числа. След това програмата приема 1 число.
//Ако числото фигурира в масива изведете на екрана следващото по големина число от подадените

public class TenIntegers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		int[] array = new int[10];

		for (int i = 0; i < 10; i++) {

			System.out.println("You should enter 10 numbers!\nEnter " + (i + 1)
					+ " number: ");
			number = input.nextInt();
			array[i] = number;
		}

		sort(array);
		search(array);
		input.close();
	}

	private static void sort(int[] array) {
		boolean swapped = true;
		int m = 0;
		int tmp;
		while (swapped) {
			swapped = false;
			m++;
			for (int i = 0; i < array.length - m; i++) {
				if (array[i] > array[i + 1]) {
					tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
					swapped = true;
				}
			}

		}
		for (int a : array) {
			System.out.println(a);

		}

	}

	private static void search(int array[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter one number: ");
		int search = input.nextInt();

		int first = 0;
		int last = array.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {

			if (array[middle] < search) {
				first = middle + 1;
			} else if (array[middle] == search) {

				System.out.println(array[middle + 1]);
				break;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Error");
		}

	}

}
