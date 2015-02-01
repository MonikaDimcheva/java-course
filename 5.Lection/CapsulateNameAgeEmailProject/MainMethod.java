//Задача:
//Дефинирайте клас Person който да има име, години и e-mail. 
//Капсулирайте полетата на класа. За валидни данни приемете :
//1.Име - повече от 3 символа
//2.Години – положително число по-малко от 200
//3.е - mail – повече от 3 символа
//Дефинирайте функция която извежда в конзолата данните на човека.
//Направете 3 обекта от тип Person и демонстрирайте функциите на класа.

public class MainMethod {

	public static void main(String[] args) {

		PersonLectionFive chovekEdno = new PersonLectionFive("Monika", 17,
				"monikadimcheva@yahoo.com");
		PersonLectionFive chovekDve = new PersonLectionFive("Petq", 65,
				"petya456@abv.bg");
		PersonLectionFive chovekTri = new PersonLectionFive("Cvetoslava", 20,
				"ccvetanova@gmail.com");

		System.out.println("Name: " + chovekEdno.getName() + " Age: "
				+ chovekEdno.getAge() + " Email: " + chovekEdno.getEmail());
		System.out.println("Name: " + chovekDve.getName() + " Age: "
				+ chovekDve.getAge() + " Email: " + chovekDve.getEmail());
		System.out.println("Name: " + chovekTri.getName() + " Age: "
				+ chovekTri.getAge() + " Email: " + chovekTri.getEmail());
	}
}
