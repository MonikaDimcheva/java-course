
public class Celsius {
	private float celsius;
	
public Celsius(){
	this.celsius=0f;
}
public Celsius(float celsius){
	this();
	setCelsius(celsius);
}
private void setCelsius(float celsius) {
	this.celsius=celsius;
}

public void printCelsius(){
	float print=(((this.celsius*9)/5)+32);
	System.out.println(print);
}
}
