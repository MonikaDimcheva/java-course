public class Employee {

	protected int monthHours;
	protected int salary;

	public Employee() {

		this.monthHours = 0;
		this.salary = 0;
	}

	public Employee(int monthHours, int salary) {
		this();

		setMonthHours(monthHours);
		setSalary(salary);
	}

	public void setMonthHours(int monthHours) {
		this.monthHours = monthHours;
	}

	public int getMonthHours() {
		return monthHours;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void sayHoursAndMoney() {
		System.out.printf("My month hours are: " + this.getMonthHours() + "\n");
		System.out.printf("My salary is: " + this.getSalary() + "\n");

	}

}
