public class Employee extends Human {

	private int monthSalary;
	private String workPlace;

	public Employee(String name, int monthSalary, String workPlace) {
		setName(name);
		setMonthSalary(monthSalary);
		setWorkPlace(workPlace);
	}

	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}

	public int getMonthSalary() {
		return monthSalary;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public String getWorkPlace() {
		return workPlace;
	}

	@Override
	public void identify() {
		System.out.printf("Hello! I am an employee!\nMy name is " + super.name);
		System.out.printf(".\nMy month salary is " + this.monthSalary);
		System.out.println(".\nMy work place is in a " + this.workPlace + ".");

	}

}
