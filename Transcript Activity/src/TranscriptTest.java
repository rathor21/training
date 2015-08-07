import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class TranscriptTest {
	Transcript transcript = new Transcript();
	Validator validator = new Validator();
	Scanner sc = new Scanner(System.in);
	
	@Test
	public void inputTest() {
		CourseEnrollment courseenrollment = new CourseEnrollment("java", 4,"A");
		transcript.addCourse(courseenrollment);
		transcript.getCourses();
		System.out.printf( "%-10s%-10s%-10s%s", "Course", "Credits","Grade", "Points");
		System.out.println();
		System.out.println(transcript.printCourses());
		System.out.println(transcript.toString());
	}

	@Test
	public void validatorCreditMaxTest() {
		CourseEnrollment courseenrollment = new CourseEnrollment("java", 5,"A");
		validator.getCredits(sc, "Max Test", 1, 4);
		assertEquals(false,validator.isValid);	
	}
	
	
	@Test
	public void validatorCreditTest() {
		CourseEnrollment courseenrollment = new CourseEnrollment("java", 3,"A");
		validator.getCredits(sc, "Value Test", 1, 4);
		assertEquals(false,validator.isValid);	
	}
	
	
	@Test
	public void validatorCreditMinTest() {
		CourseEnrollment courseenrollment = new CourseEnrollment("java", 0,"A");
		validator.getCredits(sc, "Min Test", 1, 4);
		assertEquals(false,validator.isValid);	
	}
	

	
}
