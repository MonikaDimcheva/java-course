package homeworkTasks;

import java.util.Scanner;

public class WordFiveSymbols {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	String word="";
	
	do{
	System.out.println("Enter a word with only 5 symbols: ");
	word=input.nextLine();
	}while(word.length()!=5);
	
	char[] symbols=new char[5];
	System.out.println("Enter 5 symbols to see if you can make the word you have already entered!\n");
	
	for(int i=0; i<symbols.length; i++){
     symbols[i]=input.next().charAt(0);

	}
	checkWord(symbols,word);
	
}


private static void checkWord(char[] symbols,String word) {
	// TODO Auto-generated method stub
	int count=0;
	for(int a=0;a<symbols.length; a++){
	    for(int c=0;c<word.length(); c++){
		if(symbols[a]!=word.charAt(c)){
			
			continue;
			
		}else {
			count++;
		    break;
		}
	  }
	}
	
	if(count==5){
		System.out.println("You can make the word with these 5 symbols!");
	}else{
		System.out.println("You cannot make the word with these 5 symbols! Sorry!");
	}
	
}
}

