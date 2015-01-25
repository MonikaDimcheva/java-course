public class QuickSort {

//Задача:
//Направете проучване и имплементирайте алгоритъма Quick Sort

	public static void main(String[] args) {

		int[] array = { 5, 45, 23, 95, 65, 12, 32, 41, 122, 165, 921, 56 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		Quicksort(array, 0, array.length - 1);
		System.out.println();
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

	public static int part(int array[], int a, int b) {
		int number = array[a];
		while (a < b) {
			while (array[a] < number)
				a++;
			while (array[b] > number)
				b--;
			int temp = array[a];
			array[a] = array[b];
			array[b] = temp;
		}
		return a;
	}

	public static void Quicksort(int array[], int a, int b) {
		if (a >= b)
			return;
		int numberIndex = part(array, a, b);
		Quicksort(array, a, numberIndex);
		Quicksort(array, numberIndex + 1, b);
	}
}
