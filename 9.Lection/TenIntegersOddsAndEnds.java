import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TenIntegersOddsAndEnds {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		int[] array = new int[10];
		int[] sortedArray = selectionSort(array);
		Stack<Integer> nechetni = new Stack<Integer>();	
		Queue<Integer> chetni=new LinkedList<Integer>();
		

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

		for (int c = 0; c < sortedArray.length; c++) {
			if (c % 2 == 0) {
				chetni.add(c);
				continue;
			} else if (c % 2 == 1) {
		nechetni.push(c);
					continue;
				
			}
		}
		System.out.println("\nChetni: ");
		while (!chetni.isEmpty()) {
		    System.out.print(chetni.remove()+",");
		}
	System.out.println("Nechetni: ");
		while (!nechetni.isEmpty()) {
		    System.out.print(nechetni.pop()+",");
		}
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
