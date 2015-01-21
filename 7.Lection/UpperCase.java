import java.util.Scanner;


public class UpperCase {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
	    
		System.out.println("Enter word: ");
		String word=input.nextLine();
		System.out.println("Enter sentance: ");
		String sentance=input.nextLine();
		
		String[] sentanceArray=sentance.split(" ");
		
		for(int i=0; i<sentanceArray.length; i++){
			if(sentanceArray[i].equals(word)){
				System.out.println(sentance.replace(word,word.toUpperCase()));
				break;
			}
			
			
		}
		
		
	}

}
