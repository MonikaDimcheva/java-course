import java.util.Scanner;

//������:
//��������� �������� ����� ������ ���� �� ��������� � ������� ������ �� ����� ����� �����.

public class WordCharNumber {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter one word: ");
		String word = input.nextLine();
		input.close();
		word.toCharArray();
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i) + "->" + (i + 1));
		}
	}

}
