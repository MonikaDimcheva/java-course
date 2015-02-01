import java.util.Scanner;

//Задача:
//Направете програма, която приема едно число и обръща неговите цифри в обратен ред.


public class ReverseNumber {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter one number: ");
		String number = input.nextLine();
		input.close();

		number.toCharArray();

		for (int i = number.length() - 1; i >= 0; i--) {
			System.out.print(number.charAt(i));
		}

	}

}
