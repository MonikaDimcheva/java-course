package LectionFour;

//Задача:
//Дефинирайте функция която приема 1 параметър - число
// и принтира на екрана "четно" ако числото е четно и 
//"нечетно" ако числото е нечетно. 
// Демонстрирайте действието на фукцията с няколкопримера

import java.util.Scanner;

public class OddAndEven {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in;
	
		for(int broi=0; broi<=5; broi++){
			
			System.out.println("Vavedi chislo: ");
			int number=input.nextInt();
			
			oddOrEven(number);
		}
	}

	public static void oddOrEven(int number) {
		if (number % 2 == 0) {
			System.out.println("Chetno");
		} else {
			System.out.println("Nechetno:");
		}
	}

}
