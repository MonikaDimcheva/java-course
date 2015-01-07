
public class EmployeesMain {
	public static void main(String[] args) {
		
		
		Policeman pol=new Policeman("Officer",160,800);
		Doctor doc=new Doctor(13,10,120,1550);
		
		
		
		pol.sayRank();
		pol.sayHoursAndMoney();
		System.out.println();
        doc.sayDuties();
        doc.sayHoursAndMoney();
		

}
}