// Задача:
// Направете клас Employee който съдържа базовите
// характеристики за един работник: часове работа на месец и месечна
// заплата.
// Направете клас Policeman, който наследява Employee и добавя поле
// за полицейския ранк на дадения полицай
// Направете клас Doctor, който наследява Employee и
// добавя полета за броя нощни и броя целодневни дежурства на месец
// Направете нужните get/set методи както и методи за извеждане
// на информацията за обектите в конзолата.
public class EmployeesMain {

	public static void main(String[] args) {

		Policeman pol = new Policeman("Officer", 160, 800);
		Doctor doc = new Doctor(13, 10, 120, 1550);

		pol.sayRank();
		pol.sayHoursAndMoney();
		System.out.println();
		doc.sayDuties();
		doc.sayHoursAndMoney();

	}
}