package homework2;

import java.util.Scanner;

//Задача:
//Направете програма, която приема от конзолата 2 числа a и b ( б > а)
//и изкарва на екрана всички числа от а до б които се делят на 3 без остатък

public class TwoNumbers {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int number1=input.nextInt();
		System.out.println("Enter number 2 > number 1: ");
		int number2=input.nextInt();
		
		do{
		    if(number2<=number1){
			   System.out.println("Invalid number 2! Number 2 must be> number 1!!!");
			   System.out.println("Enter number 2 > number 1: ");
			   number2=input.nextInt(); 
		    }
		  } while(number2<=number1);
		
		
		for(int numbers=number1; numbers<=number2; numbers++){
			if(numbers%3==0){
				System.out.println(numbers);
			}
		}
	}

}
