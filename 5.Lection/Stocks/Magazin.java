package shop;

public class Magazin {

	private String name;
	private String location;
	private Stock[] stock;

	public Magazin() {
		this.name = "";
		this.location = "";
	}

	public Magazin(String name, String location) {

		this();
		setName(name);
		setLocation(location);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public static void main(String[] args) {
		Stock[] stock = new Stock[100];

	}

}
