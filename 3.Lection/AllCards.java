package homework2;

//Задача:
//Направете програма която принитра на конзолата всички карти 
//от стандартанта колода за игра. Подредете информацията в 13 реда и 4 колони
public class AllCards {
	public static void main(String[] args) {

		int cols = 4;
		int rows = 9;
		int counter = 2;

		for (int i = 1; i <= rows; i++) {

			for (int m = 1; m <= cols; m++) {

				System.out.print(counter + " ");
			}

			counter++;
			System.out.println();

			for (int h = 1; h <= cols; h++) {
				if (counter == 11) {
					System.out.print("J J J J\n");
					counter++;
				} else if (counter == 12) {
					System.out.print("Q Q Q Q\n");
					counter++;
				} else if (counter == 13) {
					System.out.print("K K K K\n");
					counter++;
				} else if (counter == 14) {
					System.out.print("A A A A");
				}

			}

		}
	}
}