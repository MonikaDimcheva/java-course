
public class Suv extends Car{
	
	private boolean HighAccessible;
	private String name;
	
	public Suv(){
		super();
		this.HighAccessible=true;
		this.name="";
	}
	public Suv(String name,int price, boolean HighAccessible){
		super(price);
		setAccessible(HighAccessible);
		setName(name);
	}
	public void setAccessible(boolean HighAccessible){
		this.HighAccessible=HighAccessible;
	}
	public boolean getAccessible(){
		return HighAccessible;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	
}
	public void identify(){
		System.out.print("The car is: "+this.name+"\nThe price of the car is: "+super.price+
				"\nIs it highaccessible? "+this.HighAccessible);
		System.out.println();
	}

}
