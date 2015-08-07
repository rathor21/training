
public class CourseEnrollment {
	private String course;
	private int credits;
	private String grade;
	private int qualityPoints;
	private int gpaPoints;
	
	public CourseEnrollment(String cc, int crd, String grd){
		course = cc;
		credits = crd;
		grade = grd;
		switch (grade){
		case ("A"):
			qualityPoints = 4;
			break;
		case ("B"):
			qualityPoints = 3;
			break;
		case ("C"):
			qualityPoints = 2;
			break;
		case ("D"):
			qualityPoints = 1;
			break;
		case ("F"):
			qualityPoints = 0;
			break;
		}
		gpaPoints = qualityPoints;
	}

	public int getGpaPoints() {
		return gpaPoints;
	}

	public String getCourse() {
		return course;
	}

	public int getCredits() {
		return credits;
	}

	public String getGrade() {
		return grade;
	}
	
@Override
public String toString(){
	String text = String.format("%-10s%-10s%-10s%s", course, credits, grade, gpaPoints);
	return text + "\n";
}
	
}
