import java.util.Scanner;


public class TestApp {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            String name = Validator.getString(
                sc, "Enter Name: ");
            int age = Validator.getAgeInt(
                sc, "Enter age 1-100:     ", 0, 1000);
            int height = Validator.getHeightInt(sc, "Enter Height (36-92 in.)",0,1000);
            int weight = Validator.getWeightInt(sc, "Enter Weight (80-400 lbs)",0,1000);
            double decimal = Validator.getDecimalDouble(sc, "Enter fav. decimal (0-1)", 0, 1000);
            // see if the user wants to continue
            choice = Validator.getString(
                sc, "Another assignment? (y/n): ");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
            System.out.println("Decimal: " + decimal);
        }
  }
}