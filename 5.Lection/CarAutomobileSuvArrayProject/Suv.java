//Задача:
//Дефинирайте клас Car с единствено поле цена.  
//Създайте клас Automobile който наследява Car и съдържа      
//допълнително поле за разход на гориво. 
//Създайте клас SUV който налседява Car  и съдържа boolean
//поле дали джипа е високопроходим.
//Създайте масив от тип Car и въведете в него 5 коли и 5 джипа.
//Сортирайте масива по цена на конкретната кола.

public class Suv extends Car {
	private boolean HighAccessible;
	private String name;

	public Suv() {
		super();
		this.HighAccessible = true;
		this.name = "";
	}

	public Suv(String name, int price, boolean HighAccessible) {
		super(price);
		setAccessible(HighAccessible);
		setName(name);
	}

	public void setAccessible(boolean HighAccessible) {
		this.HighAccessible = HighAccessible;
	}

	public boolean getAccessible() {
		return HighAccessible;
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
				+ "\nIs it highaccessible? " + this.HighAccessible);
		System.out.println();
	}

}
