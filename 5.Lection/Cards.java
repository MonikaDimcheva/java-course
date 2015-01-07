package homeworkTasks;

import java.util.Scanner;

public class Cards {
	public static void main(String[] args) {
		
		String [] numbers={"2","3","4","5","6","7","8","9","10","J",
				"Q","K","A","2","3","4","5","6","7","8","9","10","J",
				"Q","K","A","2","3","4","5","6","7","8","9","10","J",
				"Q","K","A","2","3","4","5","6","7","8","9","10","J",
				"Q","K","A"};
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number to check which card is it: ");
		int number=input.nextInt();
		int counter=1;
		
		for(int i=0;i<=numbers.length-1;i++){
		if (counter==number){
		System.out.printf("The card is : "+numbers[i]+",");
		break;
		}
		else{
		counter ++;
		}
		}
		
		if(number<=14){
		System.out.printf("Spades");
		}
		else if (number<=27){
		System.out.printf("Karo");
		}
		else if(number<=40){
		System.out.printf("Hearts");
		}
		else if(number<=52){
		System.out.println("Pika");
		} else{
			System.out.println("Ivalid card!!!");
		}
		}

}
