//Задача:
//Дефинирайте клас Car с единствено поле цена.  
//Създайте клас Automobile който наследява Car и съдържа      
//допълнително поле за разход на гориво. 
//Създайте клас SUV който налседява Car  и съдържа boolean
//поле дали джипа е високопроходим.
//Създайте масив от тип Car и въведете в него 5 коли и 5 джипа.
//Сортирайте масива по цена на конкретната кола.

public class Automobile extends Car {

	private int exhaustFuel;
	private String name;

	public Automobile() {
		super();
		this.exhaustFuel = 0;
		this.name = "";
	}

	public Automobile(String name, int price, int exhaustFuel) {
		super(price);
		setExhaustFuel(exhaustFuel);
		setName(name);

	}

	public void setExhaustFuel(int exhaustFuel) {
		this.exhaustFuel = exhaustFuel;
	}

	public int getExhaustFuel() {
		return exhaustFuel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void identify() {
		System.out.print("The car is: " + this.name
				+ "\nThe price of the car is: " + super.price
				+ "\nFuel per 100 kilometers is " + this.exhaustFuel);
		System.out.println();
	}
}
