
public class Doctor extends Employee{
	
	private int nightMonthDuties;
	private int dayMonthDuties;
	
	public Doctor(){
		super();
		this.nightMonthDuties=0;
		this.dayMonthDuties=0;
	}
	public Doctor(int nightMonthDuties, int dayMonthDuties, int monthHours, int salary){
		super(monthHours,salary);
		setNightMonthDuties(nightMonthDuties);
		setDayMonthDuties(dayMonthDuties);
	}
	
	public void setNightMonthDuties(int nightMonthDuties){
		this.nightMonthDuties=nightMonthDuties;
	}
	public int getNightMonthDuties(int nightMonthDuties){
		return nightMonthDuties;
	}
	public void setDayMonthDuties(int dayMonthDuties){
		this.dayMonthDuties=dayMonthDuties;
	}
	public int getDayMonthDuties(int dayMonthDuties){
		return dayMonthDuties;
	}

	public void sayDuties(){
		System.out.printf("Hello! I am a doctor!\n");
		System.out.printf("My night duties per month are: "+this.getNightMonthDuties(nightMonthDuties)+"\n");
		System.out.printf("My day duties per month are: "+this.getDayMonthDuties(dayMonthDuties)+ "\n");
	}
}
