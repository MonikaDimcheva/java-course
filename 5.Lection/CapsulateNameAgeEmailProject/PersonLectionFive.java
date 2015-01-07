
public class PersonLectionFive {
	
	private String name;
	private int age;
	private String email;

	
    public PersonLectionFive(){
		
		this.name=" ";
		this.age= 0;
		this.email=" ";
		
	}
	public PersonLectionFive(String name,int age,String email){
		this();
		
		setName(name);
		setAge(age);
		setEmail(email);
		
	}

	public void setEmail(String email) {
		if(email.length()>3){
			this.email=email;
		}
		
	}
	public void setAge(int age) {
		if(age>0 && age<200){
			this.age=age;
		}
		
	}
	public void setName(String name) {
		if(name.length()>3){
			this.name = name;
		}
	
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	
	
	
}
