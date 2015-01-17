import java.util.ArrayList;
import java.util.Arrays;

public class StudentMain {
	
	
	public static void main(String[] args) {
		
		Student nasko=new Student();
		Student monika=new Student();
		Student cecka=new Student();
		
		nasko.getMarks().put("Maths", new ArrayList<>(Arrays.asList(5,5,6)));		
		nasko.getMarks().put("History",new ArrayList<>(Arrays.asList(4,4,6)));
		nasko.getMarks().put("Psychology",new ArrayList<>(Arrays.asList(2,2,3)));
		nasko.getMarks().put("Biology",new ArrayList<>(Arrays.asList(4,5,4)));
		nasko.getMarks().put("Literature",new ArrayList<>(Arrays.asList(2,6,4)));
		
		monika.getMarks().put("Art", new ArrayList<>(Arrays.asList(2,4,4)));		
		monika.getMarks().put("Music",new ArrayList<>(Arrays.asList(6,6,6)));
		monika.getMarks().put("Sports",new ArrayList<>(Arrays.asList(4,2,5)));
		monika.getMarks().put("Physics",new ArrayList<>(Arrays.asList(6,6,4)));
		monika.getMarks().put("Computer Science",new ArrayList<>(Arrays.asList(6,5,6)));
		
		cecka.getMarks().put("English", new ArrayList<>(Arrays.asList(2,4,5)));		
		cecka.getMarks().put("Chemistry",new ArrayList<>(Arrays.asList(6,5,2)));
		cecka.getMarks().put("Economics",new ArrayList<>(Arrays.asList(6,6,6)));
		cecka.getMarks().put("Geography",new ArrayList<>(Arrays.asList(2,6,3)));
		cecka.getMarks().put("Public administration",new ArrayList<>(Arrays.asList(4,6,5)));
		
		System.out.print("Student:Nasko\n");
		for (String key : nasko.getMarks().keySet()) {
			System.out.println("" + key + " -> " + nasko.getMarks().get(key));
		}
		System.out.println();
		System.out.print("Student:Monika\n");
		for (String key : monika.getMarks().keySet()) {
			System.out.println("" + key + " -> " + monika.getMarks().get(key));
		}
		System.out.println();
		System.out.println("Student:Cecka");
		for (String key : cecka.getMarks().keySet()) {
			System.out.println("" + key + " -> " + cecka.getMarks().get(key));
			
		}
		
		System.out.println();
		double naskoAverageMarks=nasko.calculateAverageMark("Maths");
		System.out.println("Nasko's average mark in Maths: "+naskoAverageMarks);
		nasko.addSubjectMark("Biology", 5);
		
		double monikaAverageMarks=monika.calculateAverageMark("Art");
		System.out.println("Monika's average mark in Art: "+monikaAverageMarks);
		monika.addSubjectMark("Music", 2);
		
		double ceckaAverageMarks=cecka.calculateAverageMark("Geography");
		System.out.println("Cecka's average mark in Geography: "+ceckaAverageMarks);
		cecka.addSubjectMark("English", 5);
		System.out.println();
		
		System.out.println("Now we gonna add marks!\nNasko's new mark is 5 in Biology!\n"
				+ "Monika's new mark is 2 in Music!\nCecka's new mark is 5 in Enlgish!\n");
		
		System.out.print("Student:Nasko\n");
		for (String key : nasko.getMarks().keySet()) {
			System.out.println("" + key + " -> " + nasko.getMarks().get(key));
		}
		System.out.println();
		System.out.print("Student:Monika\n");
		for (String key : monika.getMarks().keySet()) {
			System.out.println("" + key + " -> " + monika.getMarks().get(key));
		}
		System.out.println();
		System.out.println("Student:Cecka");
		for (String key : cecka.getMarks().keySet()) {
			System.out.println("" + key + " -> " + cecka.getMarks().get(key));
			
		}
		
		
	}

}
