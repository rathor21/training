import java.text.NumberFormat;
import java.util.*;


public class Transcript {
	
private ArrayList<CourseEnrollment> courseenrollments = new ArrayList<CourseEnrollment>();
	
public Transcript(){}
	
public void addCourse(CourseEnrollment courseenrollment){
	courseenrollments.add(courseenrollment);
}
	
public ArrayList<CourseEnrollment> getCourses(){
	return courseenrollments;
}


public String printCourses(){
	String s="";
	for  (CourseEnrollment c: courseenrollments) {
		s += c;
		}
	return s;
}


private double getOverallGPA(){
	double GPAsum = 0, creditSum = 0, overallGPA = 0;
	for (CourseEnrollment c: courseenrollments){
		GPAsum += c.getGpaPoints()*c.getCredits();
		creditSum += c.getCredits();
	}
	overallGPA = GPAsum/creditSum;
	return overallGPA;
	
}

@Override
public String toString() {
	String formattedGPA = Double.toString(getOverallGPA());
	return "                 GPA: " + formattedGPA;
}

}
