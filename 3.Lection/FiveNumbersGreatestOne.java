package homework2;

import java.util.Scanner;

public class FiveNumbersGreatestOne {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter first number: ");
	int firstNumber=input.nextInt();
	System.out.println("Enter second number: ");
	int secondNumber=input.nextInt();
	System.out.println("Enter third number: ");
	int thirdNumber=input.nextInt();
	System.out.println("Enter forth number: ");
	int forthNumber=input.nextInt();
	System.out.println("Enter fifth number: ");
	int fifthNumber=input.nextInt();
	do {
	if(firstNumber<0 | secondNumber<0 | thirdNumber<0 | forthNumber<0 | fifthNumber<0){
	
		System.out.println("There are negative numbers!\nALL numbers must be positive!!!Try again!\nEnter first number: ");
		
		firstNumber=input.nextInt();
		System.out.println("Enter second number: ");
		secondNumber=input.nextInt();
		System.out.println("Enter third number: ");
		thirdNumber=input.nextInt();
		System.out.println("Enter forth number: ");
		forthNumber=input.nextInt();
		System.out.println("Enter fifth number: ");
		fifthNumber=input.nextInt();
	
	}
	
	}while(firstNumber<0 | secondNumber<0 | thirdNumber<0 | forthNumber<0 | fifthNumber<0);
	
	
	System.out.println("Numbers are: "+firstNumber+","+secondNumber+","+
	thirdNumber+","+forthNumber+","+fifthNumber);
	
	while(firstNumber>secondNumber && firstNumber>thirdNumber && firstNumber>forthNumber && firstNumber>fifthNumber){
		System.out.println("First number is the biggest one!");
		break;
	}
	while(secondNumber>firstNumber && secondNumber>thirdNumber && secondNumber>forthNumber && secondNumber>fifthNumber){
		System.out.println("Second number is the biggest one!");
		break;
	}
	while(thirdNumber>firstNumber && thirdNumber>secondNumber && thirdNumber>forthNumber && thirdNumber>fifthNumber){
		System.out.println("Third number is the biggest one!");
		break;
	}
	while(forthNumber>firstNumber && forthNumber>secondNumber && forthNumber>thirdNumber && forthNumber>fifthNumber){
		System.out.println("Forth number is the biggest one!");
		break;
	}
	while(fifthNumber>firstNumber && fifthNumber>secondNumber && fifthNumber>thirdNumber && fifthNumber>forthNumber){
		System.out.println("Fifth number is the biggest one!");
		break;
	}
}
}

