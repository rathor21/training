import java.util.*;

public class TranscriptApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Transcript transcript = new Transcript();
		System.out.println("Welcome to the transcript application");
		String choice = "y";
		do {
		String cc = Validator.getCourse(sc, "Enter course: ");
		int crd = Validator.getCredits(sc, "Enter credits: ", 0, 1000);
		String grd = Validator.getGrade(sc, "Enter grade: ");
		choice = Validator.getCourse(sc, "Another course? (y/n): ");
		CourseEnrollment courseenrollment = new CourseEnrollment(cc, crd,grd);
		transcript.addCourse(courseenrollment);
		transcript.getCourses();
		} while (choice.equalsIgnoreCase("y"));
		System.out.printf( "%s %s %s %s %n", "Course", "Credits","Grade", "Points");
		System.out.println(transcript.printCourses());
		System.out.println(transcript.toString());
		
		}
	}


