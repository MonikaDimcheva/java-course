import java.util.Scanner;

//Задача:
//Направете програма, която чете от конзолата 3 числа и 
//извежда кое е най-голямото и кое е най-малкото число от трите.

public class SecondProject {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int number1 = input.nextInt();
		System.out.println("Enter number 2: ");
		int number2 = input.nextInt();
		System.out.println("Enter number 3: ");
		int number3 = input.nextInt();

		System.out.println("Nai-golqmoto chislo e:");
		if (number1 > number2 && number1 > number3) {
			System.out.println("Number 1 e nai-golqmo");
		} else if (number2 > number1 && number2 > number3) {
			System.out.println("Number 2 e nai-golqmo");
		} else {
			System.out.println("Number 3 e nai-golqmo");
		}
		System.out.println("Nai-malkoto chislo e:");
		if (number1 < number2 && number1 < number3) {
			System.out.println("Number 1 e nai-golqmo");
		} else if (number2 < number1 && number2 < number3) {
			System.out.println("Number 2 e nai-golqmo");
		} else {
			System.out.println("Number 3 e nai-malko");
		}
	}

}
