
public class Student {
	private String name;
	private String lastName;
	private int number;
	private int group;
	
	public Student(){
		this.name="";
		this.lastName="";
		this.number=0;
		this.group=0;
	}
	public Student(String name,String lastName,int number,int group){
		setName(name);
		setLastName(lastName);
		setNumber(number);
		setGroup(group);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "Student name=" + name + ", lastName=" + lastName + ", number="
				+ number + ", group=" + group;
	}
	
	

}
