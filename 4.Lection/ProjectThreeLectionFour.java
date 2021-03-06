import java.util.Scanner;

//Задача:
//Да се състави програма на JAVA, която извежда сумата на всички .
//числа от интервала 1 до въведено от конзолата число. 
//Числото трябва да е в интервала [10 - 30000]
//Използвайте рекурсия за решението на задачата

public class ProjectThreeLectionFour {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number from 10 to 30 000:");
		int number = input.nextInt();
		if (number >= 10 && number <= 30000) {

			sumOfNumbers(number);
			System.out.printf("Sum of numbers from 1 to %d is: %d", number,
					sumOfNumbers(number));
		} else {
			System.out.println("Invalid number!");
		}
	}

	public static int sumOfNumbers(int number) {
		if (number == 1) {
			return 1;
		}
		return number + sumOfNumbers(number - 1);

	}
}
