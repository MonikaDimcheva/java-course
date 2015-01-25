import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//Напишете програма, която приема символен низ от конзолата и го обработва както следва:
//1.Ако срещне малка буква – буквата се поставя  в опашка
//2.Ако срещне голяма буква -  буквата се поставя в стек
//3.Изведете данните от опашката и стека на екрана.
//4.Примерен низ-АоВбиАчЖаДм

public class StringStackQueue {

	public static void main(String[] args) {

		Queue<String> lowerCase = new LinkedList<String>();
		Stack<String> upperCase = new Stack<String>();

		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println(input);
		System.out.println("Въведи текст");
		String text = input.nextLine();

		char[] textChar = text.toCharArray();

		for (char ch : textChar) {
			String current = Character.toString(ch);
			if (current.equals(current.toUpperCase())) {
				upperCase.push(current);

			} else if (current.equals(current.toLowerCase())) {
				lowerCase.add(current);
			}

		}

		System.out.println(lowerCase.remove());
		System.out.print(upperCase);

	}

}
