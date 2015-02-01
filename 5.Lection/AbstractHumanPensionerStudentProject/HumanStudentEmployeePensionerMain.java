//Задача:
//Създайте абстрактен клас HUMAN съдържащ поле за име и един абстрактен метод identify. 
//Създайте клас Student който наследява Human и съдържа полета за университет и специалност
//Създайте клас Employee който наследява Human и съдържа полета за месторабота и месечна заплата
//Създайте клас Pensioner който наследява Human и съдържа поле за пенсия
//И в трите класа дайте различна имплементация на метода 
//indentify като изкарвате информация за съответния обект в конзолата

public class HumanStudentEmployeePensionerMain {

	public static void main(String[] args) {

		Student monica = new Student("Monica", "Technical", "Computer science");
		Employee atanas = new Employee("Atanas", 800, "fast food restaurant");
		Pensioner vasko = new Pensioner("Vasko", 240);

		monica.identify();
		System.out.println();
		atanas.identify();
		System.out.println();
		vasko.identify();
	}
}
