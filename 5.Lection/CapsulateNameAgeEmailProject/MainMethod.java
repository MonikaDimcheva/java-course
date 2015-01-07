
public class MainMethod {

	public static void main(String[] args) {
		
		PersonLectionFive chovekEdno= new PersonLectionFive("Monika", 17, "monikadimcheva@yahoo.com");
		PersonLectionFive chovekDve= new PersonLectionFive("Petq", 65, "petya456@abv.bg");
		PersonLectionFive chovekTri= new PersonLectionFive("Cvetoslava", 20, "ccvetanova@gmail.com");
		
		System.out.println("Name: "+chovekEdno.getName()+" Age: "+chovekEdno.getAge()+" Email: "+chovekEdno.getEmail());
		System.out.println("Name: "+chovekDve.getName()+" Age: "+chovekDve.getAge()+" Email: "+chovekDve.getEmail());
		System.out.println("Name: "+chovekTri.getName()+" Age: "+chovekTri.getAge()+" Email: "+chovekTri.getEmail());
	}
}
