import java.util.Scanner;


public class Program1 {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int number1=input.nextInt();
		System.out.println("Enter number 2: ");
		int number2=input.nextInt();
		
				
		
		/* for(int i=1; i<=100; i++){
			
			
			if(i%number1==0 || i % number2==0){
				
			System.out.println(i);
			}
				
			
		}
		
	}} */
		
		
		
		int a=1;
		while(a<=100){
			
			if(a%number1==0 ||  a%number2==0){
			System.out.println(a);
			}
			a++;
		}
		
	}} 
		
	/*	int a=1;
		do{
			
		if(a%number1==0 || a%number2==0){
			System.out.println(a);
		}
			a++;
		
		}
		while(a<=100);
	}}

*/
