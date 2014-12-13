package LectionFour;

import java.util.Scanner;

public class OddAndEven {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in,"UTF-8");
	
		for(int broi=0; broi<=5; broi++){
			
			System.out.println("Въведи число: ");
			int number=input.nextInt();
			
			oddOrEven(number);
		}
	}
	
	public static void oddOrEven(int number){
		if(number%2==0){
			System.out.println("четно");
		} else {
			System.out.println("нечетно");
		}
	}

}
