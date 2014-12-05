package Homework1;

import java.util.Scanner;

/**
 * Created by Asus on 30.11.2014 г..
 */
public class Rectangle {
    public static  void main(String args[]) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter width of the side of the rectangle: ");
        double width=input.nextDouble();
        System.out.println("Enter length of the side of the rectangle: ");
        double length=input.nextDouble();

        double area=width*length;
        System.out.println("Area of the rectangle is: "+area);



    }
}
