
public class Automobile extends Car {
	
	private int exhaustFuel;
	private String name;
	
	public Automobile(){
		super();
		this.exhaustFuel=0;
		this.name="";
	}

	public Automobile(String name,int price,int exhaustFuel){
		super(price);
		setExhaustFuel(exhaustFuel);
		setName(name);
		
	}
	public void setExhaustFuel(int exhaustFuel){
		this.exhaustFuel=exhaustFuel;
	}
	public int getExhaustFuel(){
		return exhaustFuel;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	
}
	public void identify(){
		System.out.print("The car is: "+this.name+"\nThe price of the car is: "+super.price+
				"\nFuel per 100 kilometers is "+this.exhaustFuel);
		System.out.println();
	}
}
