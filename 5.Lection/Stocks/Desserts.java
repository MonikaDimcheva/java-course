package shop;

public class Desserts extends Stock {

	private boolean hasChocolateFlavour;
	private String name;

	public Desserts(float price, boolean isInStock,
			boolean hasChocolateFlavour, String name) {
		setPrice(price);
		setIsInStock(isInStock);
		setHasChocolateFlavour(hasChocolateFlavour);
		setName(name);
	}

	public boolean HasChocolateFlavour() {
		return hasChocolateFlavour;
	}

	public void setHasChocolateFlavour(boolean hasChocolateFlavour) {
		this.hasChocolateFlavour = hasChocolateFlavour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
