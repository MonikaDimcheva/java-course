package shop;

public class Drinks extends Stock {
	private String name;
	private boolean isCarbonatedDrink;

	public Drinks(float price, boolean isInStock, String name,
			boolean isCarbonatedDrink) {
		setPrice(price);
		setIsInStock(isInStock);
		setName(name);
		setIsCarbonatedDrink(isCarbonatedDrink);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCarbonatedDrink() {
		return isCarbonatedDrink;
	}

	public void setIsCarbonatedDrink(boolean isCarbonatedDrink) {
		this.isCarbonatedDrink = isCarbonatedDrink;
	}

}
