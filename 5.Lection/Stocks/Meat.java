package shop;

public class Meat extends Stock {
	
	private boolean isRow;
	private String name;
	
	public Meat(float price, boolean isInStock,boolean isRow,String name){
		setPrice(price);
		setIsInStock(isInStock);
		setRow(isRow);
		setName(name);
	}
	
	
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setRow(boolean isRow) {
		this.isRow = isRow;
	}

	public boolean isRow() {
		return isRow;
	}

}
