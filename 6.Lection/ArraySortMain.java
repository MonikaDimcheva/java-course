import java.util.Scanner;
import java.util.Arrays;


public class ArraySortMain {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number that would be the length of the array: ");
		int number=input.nextInt();
		int[] array=new int[number];
		
		for(int i=0; i<number; i++){
		System.out.println("Enter integers in the array: ");
		array[i]=input.nextInt();
		}
		
		Arrays.sort(array);
		
		System.out.println("The sorted array in ascending order is:");
		for(int m=0; m<number; m++){
		
			System.out.print(array[m]+",");
		}
		
	}

}
