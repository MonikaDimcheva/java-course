import java.util.Scanner;


public class FromCelsiusToFahrenheit {
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Celsius to convert into Fahrenheit: ");
		Celsius one=new Celsius(input.nextFloat());
		
		one.printCelsius();
		
	    
		
	}

}
