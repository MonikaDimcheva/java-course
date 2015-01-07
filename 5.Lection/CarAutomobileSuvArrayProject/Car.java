
public class Car {
	
	protected int price;

	public Car(){
		this.price=0;
	}
	public Car(int price){
		this();
		setPrice(price);
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
	public void identify(){
		
	}

	
	
public static void main(String[] args) {
	 
	 Car[] carsArray= { 
	 
	new Automobile("Ford",6000,200),
	new Automobile("Opel",5000,90),
	new Automobile("Mercedes",100000,500),
	new Automobile("Suzuki",3200,60),
	new Automobile("BMW",9500,250),
	new Suv("Jeep",12500,true),
	new Suv("Lada",14600,true),
	new Suv("Mercedes",36800,true),
	new Suv("BMW",25000,false),
	new Suv("Nissan",60000,false),
	 };
	
	 for(int j=0; j<4;j++){
	carsArray[j].identify();
	 }
	 for(int k=4;k<10;k++){
	carsArray[k].identify();
	 }
	 System.out.println();
	sortByPrice(carsArray);
	
}

private static void sortByPrice(Car[] carsArray) {
	// TODO Auto-generated method stub
	for(int i=0; i<carsArray.length; i++){
		for(int m=i+1; m<carsArray.length; m++){
			if(carsArray[i].price>carsArray[m].price){
				int swap=carsArray[i].price;
				carsArray[i].price=carsArray[m].price;
				carsArray[m].price=swap;
				
			}
		}
	}
	
			for(int sort=0; sort<carsArray.length; sort++){
	
				System.out.println("Cars sorted by price: "+carsArray[sort].price);
				
			}
}
	 
	 }


