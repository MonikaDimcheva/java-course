import java.util.Scanner;

//Задача:
//Компания се нуждае от система за съхранение на информация за служители.  
//Направете програма, която изисква следната информация: Име, Фамилия, Години (0, 120),
//пол (еднобуквен 'м' или 'ж'), ЕГН, телефон.
//Подберете подходящите типове данни и декларирайте нужните променливи. 
//Прочетете от конзолата нужната иформация за служител и след това я изведете на конзолата

public class Task_3 {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.print("Enter name: ");
		String name = input.nextLine();

		System.out.print("Enter last name: ");
		String lastName = input.nextLine();

		System.out.print("Enter age between 0 and 120: ");
		int age = input.nextInt();

		if (age < 0 | age > 120) {
			System.out.println("Invalid age!");
			System.out.println("Enter age: ");
			age = input.nextInt();
		}

		System.out.print("Enter EGN: ");
		String EGN = input.next();

		System.out.print("Enter phone number: ");
		String phone = input.next();

		System.out.print("Enter gender 'м' for male or 'ж' for female: ");
		char gender = input.next().charAt(0);
		if (gender != 'м' & gender != 'M' & gender != 'ж' & gender != 'Ж') {
			System.out.println("Invalid gender!");
			System.out.println("Enter gender 'м' for male or 'ж' for female: ");
			gender = input.next().charAt(0);
		}

		System.out.println("\nName: " + name + "\nLast name: " + lastName
				+ "\nAge: " + age + "\nEGN: " + EGN + "\nPhone number: "
				+ phone + "\nGender is:" + gender);

	}
}
