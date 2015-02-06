import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

//Задача:
//Направете програма която приема от конзолата 5 държави 
//и съответно техните столици. 
//След като потребителят въведе информацията, 
//запишете държавите във файл с име countries.txt, 
//а столиците в друг файл – stolici.txt

public class Countries {
	public static void main(String[] args) {

		String filePath = "../output/countries.txt";
		String filePathTwo = "../output/stolici.txt";
		Scanner input = new Scanner(System.in);
		try {
			FileWriter fileStream = new FileWriter(filePath);
			FileWriter fileStreamTwo = new FileWriter(filePathTwo);
			BufferedWriter writer = new BufferedWriter(fileStream);
			BufferedWriter writerTwo = new BufferedWriter(fileStreamTwo);

			System.out.println("EXAMPLE: England London"
					+ "\nEnter 5 countries and their cities: ");

			for (int a = 0; a < 5; a++) {
				String country = input.nextLine();
				String[] countryOne = country.split(" ");

				writer.write(countryOne[0]);
				writer.newLine();
				writerTwo.write(countryOne[1]);
				writerTwo.newLine();

			}

			writer.close();
			writerTwo.close();
			input.close();

		} catch (Exception e) {
			System.out.println("Възникна грешка при записа на файла");
			System.out.println(e.getMessage());
		}

		System.out.print("Записът на файла приключи! \n");
	}
}
