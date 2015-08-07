import java.text.SimpleDateFormat;
import java.util.*;


public class DateActivity {

	String inputDate = "";
	int weatherSelection = 0, tempSelection = 0;
	String weatherOutput = "";
	
	public Date processDate(String inputDate){
		String[] d = inputDate.split("/"); 
		int month = Integer.parseInt(d[0])-1;
		int day = Integer.parseInt(d[1]);
		int year = Integer.parseInt(d[2]);
		GregorianCalendar date = new GregorianCalendar(year, month, day);
		Date returnDate = date.getTime();
		return returnDate;
	}
	
	public String dayoftheweek(Date d){
		String weekOutput = new SimpleDateFormat("EEEEEEEEE").format(d);
		return weekOutput;
	}
	
	public String weather(){
		Random r = new Random();
		weatherSelection = 1 + r.nextInt(3);
		if (weatherSelection == 1)
			weatherOutput = "Sunny day";
		else if (weatherSelection == 2)
			weatherOutput = "Rainy day";
		else if (weatherSelection == 3)
			weatherOutput = "Snowy day";
		return weatherOutput;	
	}
	
	public int temp(){
		Random r = new Random();
		tempSelection = r.nextInt(100);
		return tempSelection;
	}
	
	public long daysBetween(Date d){
		Date currentDate = new Date();
		long todaysDateMS = currentDate.getTime();
		long userDateMS = d.getTime();
		long elapsedMS = todaysDateMS - userDateMS;
		long elapsedDays = elapsedMS / (24*60*60*1000);
		return elapsedDays;
	}
	
	public String getInputDate() {
		return inputDate;
	}

	public void setInputDate(String inputDate) {
		this.inputDate = inputDate;
	}



}
