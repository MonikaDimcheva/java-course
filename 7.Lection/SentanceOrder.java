import java.util.Scanner;

//Задача:
//Направете програма която приема изречение като вход .
//и извежда в конзолата думите от изречението в 
//обратен ред като премахва препинателните знаци.

public class SentanceOrder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter sentance: ");

		String one = input.nextLine();

		String[] splitString = one.split(" |,|!");

		for (int i = splitString.length - 1; i >= 0; i--) {
			System.out.print(splitString[i] + " ");

		}

	}

}
