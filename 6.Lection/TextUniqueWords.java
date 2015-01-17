import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class TextUniqueWords {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter text to see which words are unique:");
		String text=input.nextLine();
		String[] words = text.split("\\W+");
		
		HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
		
		for (String word : words) {
		Integer count = wordsCount.get(word);
		if (count == null) {
		count = 0;
		}
		wordsCount.put(word, count+1);
		}
		
		Set<String> wordKeys = wordsCount.keySet();
		for (String word : wordKeys) {
		int count = wordsCount.get(word);
		if(count==1){
		System.out.printf(word+" ");
		
		}
		}

		}
	

}
