import java.util.ArrayList;
import java.util.HashMap;

public class Student {

	private String firstName;
	private String lastName;
	private int number;
	private HashMap<String, ArrayList<Integer>> marks = new HashMap<>();

	public Student() {

	}

	public Student(String firstName, String lastName, int number,
			HashMap<String, ArrayList<Integer>> marks) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setNumber(number);
		setMarks(marks);
	}

	public HashMap<String, ArrayList<Integer>> getMarks() {
		return marks;
	}

	public void setMarks(HashMap<String, ArrayList<Integer>> marks) {
		this.marks = marks;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
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

	public void addSubjectMark(String subject, int grade) {
		marks.get(subject).add(grade);
	}

	public double calculateAverageMark(String subject) {

		marks.get(subject);
		double sumOfGrades = 0;

		for (int i = 0; i < marks.get(subject).size(); i++) {
			sumOfGrades += marks.get(subject).get(i);

		}
		double averageMark = sumOfGrades / marks.get(subject).size();
		return averageMark;
	}

}
