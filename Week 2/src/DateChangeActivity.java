import java.util.Date;
import java.text.DateFormat;

public class DateChangeActivity {

	public static void main(String[] args) {
		Date now = new Date();
		DateFormat defaultDate =  DateFormat.getDateInstance(); 
		String nowString = defaultDate.format(now);
		
		DateFormat defaultTime = DateFormat.getTimeInstance();
		String getTime = defaultTime.format(now);
		System.out.println(nowString);
		System.out.println(getTime);
	}

}