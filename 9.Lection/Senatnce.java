import java.util.Scanner;

//Задача:
//Направете програма, която приема изречение и подрежда по азбучен ред всички думи от него.

public class Senatnce {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter sentance: ");
		String sentance = input.nextLine();
		String[] parts = sentance.split(" |,");

		for (String string : parts) {
			System.out.print(string + " ");
		}
		System.out.println();
		sort(parts);
	}

	public static void sort(String[] parts) {
		for (int m = 0; m < parts.length; m++) {
			for (int i = m + 1; i < parts.length; i++) {
				if (parts[i].compareTo(parts[m]) < 0) {
					String temp = parts[m];
					parts[m] = parts[i];
					parts[i] = temp;
				}

			}
		}

		for (String string : parts) {
			System.out.print(string + " ");
		}
	}

}
