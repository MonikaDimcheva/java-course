package shop;

public abstract class Stock {

	protected float price;
	protected boolean isInStock;

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setIsInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}

	public boolean getIsInStock() {
		return isInStock;
	}
}
