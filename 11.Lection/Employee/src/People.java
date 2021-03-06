import java.util.ArrayList;

public class People {
	private String name;
	private String number;
	private String age;
	private String salary;
	private ArrayList<People> peoples = new ArrayList<People>();

	public People(String name, String number, String age,String salary) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public ArrayList<People> getPeople() {
		return peoples;
	}

	public void setPeople(ArrayList<People> peoples) {
		this.peoples = peoples;
	}

}