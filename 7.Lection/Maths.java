import java.util.Scanner;




public class Maths {
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter math task: ");
		String mathTwo=input.nextLine();
		int count=0;
		
		char[] arrayTwo=mathTwo.toCharArray();
		
		
		for(int i=0;i<arrayTwo.length;i++){
			if(arrayTwo[i]=='('){
			count++;
			} else if(arrayTwo[i]==')'){
				count--;
			} else if(count<0){
				System.out.println("ERROR!");
				break;
			}
		}
		
		if(count==0){
			System.out.println("GOOD!");
		}
		else if(count<0 || count>0){
			System.out.println("BAD!");
		}
		
	}

}
