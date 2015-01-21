import java.util.Scanner;


public class SentancesWordFind {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter text: ");
		String text=input.nextLine();
		System.out.println("Enter word: ");
		String word=input.nextLine();
		input.close();
		String[] textSentances=text.split("[.!?]");
		
		for(int i=0; i<textSentances.length; i++){
			
			if(textSentances[i].contains(word)){
				System.out.println(textSentances[i]);
			} else  {
				continue;
				
			}
			
			
		}
	}

}
