import static org.junit.Assert.*;

import org.junit.Test;


public class TranscriptTest {
	Transcript transcript = new Transcript();
	@Test
	public void test() {
		CourseEnrollment courseenrollment = new CourseEnrollment("java", 4,"A");
		transcript.addCourse(courseenrollment);
		transcript.getCourses();
		System.out.printf( "%-10s%-10s%-10s%s", "Course", "Credits","Grade", "Points");
		System.out.println();
		System.out.println(transcript.printCourses());
		System.out.println(transcript.toString());
	}

}
