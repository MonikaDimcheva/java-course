import java.util.Scanner;

//Задача:
//Създайте програма, която изчислява бонус точки на база резултат от игра
//Потребителят трябва да въведе своите точни в интервалa[1,;9].
//Ако точките са в интервала [1;3] Умножете ги по 5.
//Ако точките са в интервала [4;6] Умножете ги по 10л
//Ако точките са в интервала [7;9] Умножете ги по 50. 
//Резултатът изведете на екрана
public class Task5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter your points from 1 to 9: ");
		int points = input.nextInt();

		if (points >= 1 && points <= 3) {
			points = points * 5;
			System.out.println("POINTS: " + points);
		} else if (points >= 4 && points <= 6) {
			points = points * 10;
			System.out.println("POINTS: " + points);
		} else if (points >= 7 && points <= 9) {
			points = points * 50;
			System.out.println("POINTS: " + points);
		} else {
			System.out.println("Invalid points!");
		}
	}
}
