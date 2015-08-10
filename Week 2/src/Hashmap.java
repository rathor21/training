import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Hashmap {

	public static void main(String[] args) {
		
		 //get a filename
		String filename = (System.getProperty("user.dir") + File.separatorChar +"mybooks.txt");
		
		Scanner sc = new Scanner(System.in);
		 PrintWriter writer;
		
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
		
		 //write to a file
		try {
			writer = new PrintWriter(new File(filename));
			 writer.println("this is a string");
			 writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 //read a file
		 BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filename));
			String line = reader.readLine();
			 System.out.println(line);
			 reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
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
