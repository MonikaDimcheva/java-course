import java.util.ArrayList;
import java.util.Scanner;

//Задача:
//Направете програма която чете поредица от символи и замества поредните повтарящи се 
//символи със съответния символ повтарящ се само веднъж:
//Пример:
//“gggggssssstttttsssssaaaaa---> "gstsa".

public class Symbols {
	public static void main(String[] args) {
		
        Scanner input=new Scanner(System.in);
        System.out.println("Enter random string: ");
		String string = input.nextLine();
		
		ArrayList<Character> array = new ArrayList<Character>();

		for (int i = 0; i < string.length(); i++) {
			if (!array.contains(string.charAt(i))) {
				array.add(string.charAt(i));
			}

		}

		for (Character ch : array) {
			System.out.print(ch);
			
		}
		System.out.println();

		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i));
			
		}

	}
}
