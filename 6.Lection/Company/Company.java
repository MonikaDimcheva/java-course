
public class Company {
	
	private String name;
	private String adress;
	private int numberOfWorkers;
	private String webpage;
	
	public Company(){
		
	}
	public Company(String name, String adress,int numberOfWorkers,String webpage){
		this();
		setName(name);
		setAdress(adress);
		setNumberOfWorkers(numberOfWorkers);
		setWebpage(webpage);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getNumberOfWorkers() {
		return numberOfWorkers;
	}
	public void setNumberOfWorkers(int numberOfWorkers) {
		this.numberOfWorkers = numberOfWorkers;
	}
	public String getWebpage() {
		return webpage;
	}
	public void setWebpage(String webpage) {
		this.webpage = webpage;
	}
	

}
