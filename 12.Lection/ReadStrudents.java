import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadStrudents {
	public static void main(String[] args) {
		
		
		
		ArrayList<Student> students=new ArrayList<Student>();
		readFile("../files/students.txt", students);
		
	
		}

	

	private static void readFile(String path, ArrayList<Student>students) {
		try {
            
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				String[] stringOne= line.split(" ");
				Student one=new Student(stringOne[0],stringOne[1]);
				students.add(one);
				System.out.println(line);
			}
			
			
			

			bufferedReader.close();
		} catch (Exception e) {
			System.out.println("Грешка при четене!");
			System.out.println(e.getMessage());
		}

	}
}
