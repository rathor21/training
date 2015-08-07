import java.util.Scanner;


public class Validator {
	
	 boolean isValid;
	
	public static String getCourse(Scanner sc, String prompt)
	{
	    System.out.print(prompt);
	    String s = sc.next();  // read user entry
	    sc.nextLine();  // discard any other data entered on the line
	    return s;
	}
	


	public static int getCredits(Scanner sc, String prompt,
			int min, int max)
			{
			    int i = 0;
			    boolean isValid = false;
			    min = 1;
			    max = 4;
			    while (isValid == false)
			    {
			        i = getInt(sc, prompt);
			        if (i > max)
			            System.out.println(
			                "Error! Number must be less than " + max + ".");
			        else if (i < min){
			        	System.out.println(
			                    "Error! Number must be less than " + min + ".");
			        }
			        else isValid = true;
			    }
			    return i;
			}
	
	
	public static int getInt(Scanner sc, String prompt)
	{
	    int i = 0;
	    boolean isValid = false;
	    while (isValid == false)
	    {
	        System.out.print(prompt);
	        if (sc.hasNextInt())
	        {
	            i = sc.nextInt();
	            isValid = true;
	        }
	        else
	        {
	            System.out.println("Error! Invalid integer value. Try again.");
	        }
	        sc.nextLine();  // discard any other data entered on the line
	    }
	    return i;
	}
	
	public static String getGrade(Scanner sc, String prompt)
	{
	    System.out.print(prompt);
	    String s = sc.next();  // read user entry
	    sc.nextLine();  // discard any other data entered on the line
	    return s;
	}

}
