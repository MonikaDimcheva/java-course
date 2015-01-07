
public class HumanStudentEmployeePensionerMain {

	public static void main(String[] args) {
		
		Student monica= new Student("Monica","Technical","Computer science");
		Employee atanas=new Employee("Atanas",800,"fast food restaurant");
		Pensioner vasko=new Pensioner("Vasko",240);
		
		monica.identify();
		System.out.println();
		atanas.identify();
		System.out.println();
		vasko.identify();
	}
}
