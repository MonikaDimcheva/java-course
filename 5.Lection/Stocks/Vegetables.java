package shop;

public class Vegetables extends Stock {

	private boolean hasSeeds;
	private String name;

	public Vegetables(float price, boolean isInStock, boolean hasSeeds,
			String name) {
		setPrice(price);
		setIsInStock(isInStock);
		setHasSeeds(hasSeeds);
		setName(name);
	}

	public boolean isHasSeeds() {
		return hasSeeds;
	}

	public void setHasSeeds(boolean hasSeeds) {
		this.hasSeeds = hasSeeds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
