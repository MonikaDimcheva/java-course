import java.util.ArrayList;
import java.util.Scanner;

//Задача:
//Направете програма която приема 5 имена. 
//След като потребителят въведе имената програмата изисква едно изречение. 
//Проверете дали:
//Изречението започва с някое от имената
//Изречението завършва с някое от имената
//Изречението съдържа някое от имената
//Изведете резултатите на екрана.
//* Ако изречението започва или завършва с някое от имената,
//не трябва да изкарвате съшто име като съдържащо се вътре в изречението

public class Names {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>(5);
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter " + (i + 1) + " name: ");
			String one = input.nextLine();
			names.add(one);

		}

		System.out.println(names);
		System.out.println("Enter one sentance: ");
		String sentance = input.nextLine();

		for (String string : names) {
			if (sentance.startsWith(string)) {
				System.out.println("Sentance starts with some of the names!");
			} else if (sentance.endsWith(string)) {
				System.out.println("Sentance ends with some of the names!");
			} else if (sentance.contains(string)) {
				System.out.println("Sentance contains some of the names!");
			}

		}

	}

}
