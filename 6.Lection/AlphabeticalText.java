import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;


public class AlphabeticalText {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter text: ");
		String text=input.nextLine();
		String[] words=text.split("\\W+");
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));
		Collections.sort(list);
		System.out.println(list);
		
		int count=0;
		for(int i=0;i<list.size();i++){
			
			for(int m=0;m<list.size();m++){
				if(list.get(i).equals(list.get(m))){
					count++;
				}if(list.get(i).equals(list.get(m)) && count>1){
					
					list.remove(m);
				}
				
				
			}
			System.out.println(list.get(i));
		
		}
	
	}

}
