import java.util.Scanner;


public class SentenceWordCount {



	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter sentence and see how many words are in it!: ");
		String sentence=input.nextLine();
		System.out.println(sentence);
		
		int counter=1;

		for(int i=0; i<=sentence.length()-1; i++){
	        
			if(sentence.charAt(i)==' ' && sentence.charAt(i+1)!=' '){
				counter++;
			} else if(sentence.charAt(i)==','&& sentence.charAt(i+1)!=' '){
				counter++;
			}
		
	}
		System.out.println("Words is this sentence are: "+counter);
}
}