import java.util.Scanner;
//Задача:
//Направете програма, която чете от конзолата 1 string и 2 целочислени числа.
//Проверете и изкарайте на конзолата
//Дали размера на string е по-голям от 10
//Дали първото число е по-голямо от второто
//Дали второто число е в интервала [-100; 15)
//Остатъкът от деленето на първото число с второто
//Резултатът от логическата операция – Дали първото 
//число е по-голямо от 10 или второто число е по-малко от 88

public class FirstProject {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter string: ");
		String one = input.nextLine();
		System.out.println("Enter number 1: ");
		int two = input.nextInt();
		System.out.println("Enter number 2: ");
		int three = input.nextInt();

		boolean a = one.length() > 10;
		System.out.println("String length= " + one.length()
				+ "\nString length > 10 ? : " + a);
		boolean b = two > three;
		System.out.println("First number: " + two + "\nSecond number: " + three
				+ "\nFirst number>Second number? : " + b);
		boolean c = (three >= -100 && three < 15);
		System.out.println("The number is: " + three
				+ "\nIs the number in the interval between{-100;15]? : " + c);
		int four = two % three;
		System.out.println("Ostatak ot delene na number 1 s number 2: " + four);
		boolean f = (two > 10 || three < 88);
		System.out.println("Number 1 e: " + two + ">10 ili number 2 e: "
				+ three + "<88: " + f);

	}
}
