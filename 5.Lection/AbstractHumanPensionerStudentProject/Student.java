public class Student extends Human {

	private String university;
	private String specialty;

	public Student(String name, String university, String specialty) {
		setName(name);
		setUniversity(university);
		setSpecialty(specialty);

	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}

	@Override
	public void identify() {
		System.out.printf("Hello! I am a student!\nMy name is " + super.name);
		System.out.println(".I study in the " + this.university
				+ " university.");
		System.out.println("My specialty is " + this.specialty);

	}

}
