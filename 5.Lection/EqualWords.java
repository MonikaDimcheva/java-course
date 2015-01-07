package homeworkTasks;

import java.util.Scanner;

public class EqualWords {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
        String[] words=new String[20]; 
		int counter = 0;
	
		System.out.println("You should enter 20 words!");
		
		do{

		     System.out.println("Enter word: ");
		     String word=input.nextLine();
		     words[counter]=new String(word);
		     counter++;
		
	
		}while(counter!=words.length);
		
		
	  printWords(words);
	    
	  findEqualWords(words);
	   
	  
}

	private static void findEqualWords(String[] words) {
		// TODO Auto-generated method stub
		
			
		
		for(int m=0; m<20; m++){
			
	    	for(int j=0; j<m; j++){
	    		
	    	        if(words[m].equals(words[j]) && m!=j){
	    		        System.out.print("\nEqual word that you entered is: "+words[m]);
	    	
	    	        }
	    
	    	}
		}
	    	
	    }

	private static void printWords(String []words) {
		// TODO Auto-generated method stub
		  
		  for(int broi=0;broi<20; broi++){
		    	System.out.print(words[broi]+",");
		    }
	}
}

