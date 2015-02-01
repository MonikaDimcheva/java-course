package Homework1;

//Задача:
//Направете програма, която приема две числа с плаваща 
//запетая съответно дължината и ширината на правоъгълник. 
//Пресметнете лицето на дадния правоъгълник и я изведете на конзолата

import java.util.Scanner;

public class Rectangle {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter width of the side of the rectangle: ");
		double width = input.nextDouble();
		System.out.println("Enter length of the side of the rectangle: ");
		double length = input.nextDouble();

		double area = width * length;
		System.out.println("Area of the rectangle is: " + area);

	}
}
