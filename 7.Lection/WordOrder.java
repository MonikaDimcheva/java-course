import java.util.Scanner;


public class WordOrder {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter one word: ");
		String word=input.nextLine();
		
		char[] inputWord=word.toCharArray();
		
		for(int i=inputWord.length-1; i>=0; i--){
			System.out.print(inputWord[i]);
		
		
	}

	}
}
