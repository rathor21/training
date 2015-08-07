import java.util.ArrayList;


public class Education {
	String[] schoolNames; {
	schoolNames = new String[10];
	schoolNames[0] = "Rutgers";
	schoolNames[1] = "Princeton";
	schoolNames[2] = "UPenn";
	schoolNames[3] = "Wisconsin";
	schoolNames[4] = "BU";
	schoolNames[5] = "Texas";
	schoolNames[6] = "UofM";
	schoolNames[7] = "Ohio";
	schoolNames[8] = "Michigan Tech";
	schoolNames[9] = "Georgia Tech";
	}
	@Override
	public String toString() {
		String name = "";
		for (int i = 0; i < 10; i++) {
			name += " " + schoolNames[i];
			}
		return name;		
	}
	
	public String[] getSchoolNames() {
		return schoolNames;
	}
	public void setSchoolNames(String[] schoolNames) {
		this.schoolNames = schoolNames;
	}
	
	
}

