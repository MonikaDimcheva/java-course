//Задача:
//Направете проучване и имплементирайте алгоритъма Bucket Sort

public class BucketSort {

	public static void main(String[] args) {

		int[] array = { 5, 45, 23, 95, 65, 12, 32, 41, 122, 165, 921, 56 };
		int max = 921;

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		sort(array, max);
		System.out.println();
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	public static void sort(int[] array, int max) {
		int[] arrSort = new int[max + 1];

		for (int i = 0; i < arrSort.length; i++) {
			arrSort[i] = 0;
		}

		for (int i = 0; i < array.length; i++) {
			arrSort[array[i]]++;
		}

		int out = 0;
		for (int i = 0; i < arrSort.length; i++) {
			for (int j = 0; j < arrSort[i]; j++) {
				array[out++] = i;
			}
		}
	}
}
