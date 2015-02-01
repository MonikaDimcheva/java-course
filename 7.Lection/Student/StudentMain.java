import java.util.ArrayList;
//Задача:
//Направете клас Student съдържащ име, фамилия, факултетен номер и група.
//Имплементирайте метода toString като в него връщайте пълната информация за студента. 
//Направете лист от 5 студента, обходете го като 
//за всеки студент от него изкарвате пълната информация на екрана

public class StudentMain {
	public static void main(String[] args) {

		ArrayList<Student> info = new ArrayList<Student>();

		Student one = new Student("Ivan", "Ivanov", 4555, 42);
		Student two = new Student("petkan", "petkov", 546, 21);
		Student three = new Student("monika", "dimcheva", 435, 54);
		Student four = new Student("kosio", "kosiov", 6767, 64);
		Student five = new Student("cecka", "hristova", 545, 32);

		info.add(one);
		info.add(two);
		info.add(three);
		info.add(four);
		info.add(five);

		for (Student students : info) {
			System.out.println(students);

		}

	}

}
