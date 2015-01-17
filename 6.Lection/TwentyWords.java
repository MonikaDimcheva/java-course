import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class TwentyWords {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		HashMap<String, Integer> words=new HashMap<String, Integer>();
		
		
		for(int i=0;i<20;i++){
			
		System.out.println("Enter "+(i+1)+" word:");
	    String word=input.nextLine();
	    Integer count=words.get(word);
	    
	    if(count==null){
	    	count=0;
	    }
	    words.put(word, count+1);
		}		
		System.out.println(words);
		
		Set<String> wordKeys=words.keySet();
		
		for (String word : wordKeys) {
			int count = words.get(word);
			System.out.printf("%s -> %d пъти\n", word, count);
		
	}
	}
}
	
	


