//Задача:
//Дефинирайте две int променливи със стойности съответно 1 и 3. 
//Опитайте се да размените техните стойности.
public class Task4 {
	public static void main(String args[]) {
		int edno = 1;
		int dve = 3;

		System.out.println("Chislo edno e: " + edno + "\nChislo dve e: " + dve);
		edno = edno ^ dve;
		dve = dve ^ edno;
		edno = edno ^ dve;

		System.out.println("Chislo edno e: " + edno + "\nChislo dve e: " + dve);

	}
}
