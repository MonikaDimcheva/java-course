import java.util.HashSet;

//Задача:
//Направете клас Company с 4 полета: име адрес, брой служители и web страница
//Направете List с 3 произволни компании
//Намерете Компанията с най-много служители и я премахнете от списъка
//Добавете още 2 компании
//Добавете още 1 компания на мястото на компанията с най-дълго име

public class TownMain {
	public static void main(String[] args) {

		Town samokov = new Town("Samokov", "Bulgaria", "Bulgari");
		Town paris = new Town("Paris", "France", "Francois");
		Town bern = new Town("Bern", "Germany", "German");
		Town london = new Town("London", "England", "English");
		Town athens = new Town("Athens", "Greece", "Greek");

		HashSet<Town> towns = new HashSet<Town>();

		towns.add(samokov);
		towns.add(paris);
		towns.add(bern);
		towns.add(london);
		towns.add(athens);

		System.out.println(towns);

		System.out.println(towns.contains(samokov));

		towns.remove(bern);
		System.out.println(towns);
	}

}
