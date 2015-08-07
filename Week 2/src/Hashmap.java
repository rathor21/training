import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		boolean choice = false;
		String stringValue = "";
		String value;
		String tryAgain = "";
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		do {
			System.out.println("Enter a number: ");
			number = sc.nextInt();
			System.out.println("You entered: " + number);
			if (myMap.containsKey(number)) {
				value = myMap.get(number);
				System.out.println(value);
			} else {
				stringValue = convertString(number);
				myMap = process(number, stringValue);
				value = myMap.get(number);
				System.out.println(value);
			}
			System.out.println("Try again? (y/n)");
			tryAgain = sc.next();
			switch (tryAgain) {
			case ("y"):
				choice = true;
				break;
			case ("n"):
				choice = false;
				break;
			}
		} while (choice == true);

	}

	public static String convertString(int number) {

		String wordValue = "";
		switch (number) {
		case 1:
			wordValue = "one";
			break;
		case (2):
			wordValue = "two";
			break;
		case (3):
			wordValue = "three";
			break;
		case (4):
			wordValue = "four";
			break;
		case (5):
			wordValue = "five";
			break;
		case (6):
			wordValue = "six";
			break;
		case (7):
			wordValue = "seven";
			break;
		case (8):
			wordValue = "eight";
			break;
		case (9):
			wordValue = "nine";
			break;
		case (10):
			wordValue = "ten";
			break;
		}
		return wordValue;
	}

	public static HashMap process(int number, String stringValue) {
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(number, stringValue);
		myMap.get(number);
		return myMap;
	}
}
