import java.util.Scanner;

//������:
//��������� ��������, ����� ������ ���� ����� � ������ �������� ����� � ������� ���.


public class ReverseNumber {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter one number: ");
		String number = input.nextLine();
		input.close();

		number.toCharArray();

		for (int i = number.length() - 1; i >= 0; i--) {
			System.out.print(number.charAt(i));
		}

	}

}
