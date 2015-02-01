package homeworkTasks;

//Задача:
//Направете програма която приема брой дни 
//и изчислява колко секунди представляват тези дни.

import java.util.Scanner;

public class DaysInSeconds {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of days that will be converted into seconds\n(For example: 1 day is 86 400 seconds)\n");
		int days = input.nextInt();
		if (days > 0) {

			int minutes = 60;
			int seconds = 60;
			int hours = 24;
			int daysToSeconds = (((days * hours) * minutes) * seconds);
			System.out.println(days + " day(s) is(are) " + daysToSeconds
					+ " seconds");

		} else {
			System.out.println("Invalid days!Days cannot be 0 or a number below 0!");
		}

		input.close();
	}

}
