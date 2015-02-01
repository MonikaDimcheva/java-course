package shop;

public class Fruits extends Stock {

	private boolean growOnTrees;
	private String name;

	public Fruits(float price, boolean isInStock, boolean growOnTrees,
			String name) {
		setPrice(price);
		setIsInStock(isInStock);
		setGrowOnTrees(growOnTrees);
		setName(name);
	}

	public boolean GrowOnTrees() {
		return growOnTrees;
	}

	public void setGrowOnTrees(boolean growOnTrees) {
		this.growOnTrees = growOnTrees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
