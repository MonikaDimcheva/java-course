public class Policeman extends Employee {

	private String rank;

	public Policeman() {
		super();
		this.rank = "";
	}

	public Policeman(String rank, int monthHours, int salary) {
		super(monthHours, salary);
		setRank(rank);
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getRank() {
		return rank;
	}

	public void sayRank() {
		System.out.printf("Hello! I am a policeman!\n");
		System.out.printf("My rank is: " + this.getRank() + "\n");
	}
}
