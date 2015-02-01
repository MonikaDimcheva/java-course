package shop;

//Задача:
//Дефинирайте абсрактен клас Stock който съдържа информация за артикул 
//в магазин - цена и boolean поле дали е наличн. 
//Реализирайте класове за месо, зеленчуци, плодове, 
//напитки и десерти с поне по 2 уникални полета, който характеризират артикула.

public class MainStocks {
	public static void main(String[] args) {

		Meat pork = new Meat(13.99f, true, true, "Pork");
		Vegetables tomato = new Vegetables(2.4f, true, true, "Tomato");
		Fruits apple = new Fruits(1.2f, false, true, "Apple");
		Drinks cocaCola = new Drinks(2.5f, true, "Coca-Cola", true);
		Desserts cake = new Desserts(5.5f, false, true, "Cake");

		System.out.println("****Stocks****");
		System.out.println();
		System.out.println("1.Meat\nName: " + pork.getName()
				+ "\nIs it in stock?: " + pork.isInStock + "\nIs it row?: "
				+ pork.isRow() + "\nPrice: " + pork.price);
		System.out.println();

		System.out.println("2.Vegetables\nName: " + tomato.getName()
				+ "\nIs it in stock?: " + tomato.isInStock + "\nHas seeds?: "
				+ tomato.isHasSeeds() + "\nPrice: " + tomato.price);
		System.out.println();

		System.out.println("3.Fruits\nName: " + apple.getName()
				+ "\nIs it in stock?: " + apple.isInStock
				+ "\nDoes it grow on trees?: " + apple.GrowOnTrees()
				+ "\nPrice: " + apple.price);
		System.out.println();

		System.out.println("4.Drinks\nName: " + cocaCola.getName()
				+ "\nIs it in stock?: " + cocaCola.isInStock + "\nPrice: "
				+ cocaCola.price + "\nIs it a carbonated drink?: "
				+ cocaCola.isCarbonatedDrink());
		System.out.println();
		System.out.println("5.Desserts\nName: " + cake.getName()
				+ "\nIs it in stock?: " + cake.isInStock
				+ "\nDoes it have chocolate flavour?: "
				+ cake.HasChocolateFlavour() + "Price: " + cake.price);

	}

}
