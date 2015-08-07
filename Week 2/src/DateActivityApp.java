import java.util.*;

public class DateActivityApp {

	public static void main(String[] args) {
		String inputDate = "";
		Scanner keyboard = new Scanner(System.in);
		DateActivity d = new DateActivity();
		
		System.out.println("Input Date: (mm/dd/yyyy)");
		inputDate = keyboard.next();
		
		Date date = d.processDate(inputDate);
		String weather = d.weather();
		int temp = d.temp();
		long elapsed = d.daysBetween(date);
		System.out.println("That was a " +d.dayoftheweek(date)+". It was a " +weather +" and the temperature was " +temp + " degrees.") ;
		System.out.println("It was " +elapsed + " days ago" );
	}

}
