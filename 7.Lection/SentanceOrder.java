import java.util.Scanner;


public class SentanceOrder {
	
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter sentance: ");
		
		String one=input.nextLine();
	
		String[] splitString=one.split(" |,|!");
		
		
		for(int i=splitString.length-1; i>=0; i--){
			System.out.print(splitString[i]+" ");
		    
			
		}
	
	}

}
