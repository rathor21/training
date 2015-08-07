
public class Validator {

	
	
		public static boolean checkCode(String c){
			boolean check = false;
			switch(c){
			case "AP":  check = true;
			case "OR":  check = true;
			case "BA":  check = true;
			case "PE":  check = true;
			case "KI":  check = true;
			}
			return check;
		}
	
	
}
