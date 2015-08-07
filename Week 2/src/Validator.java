
import java.util.Scanner;

public class Validator
{
public static String getString(Scanner sc, String prompt)
{
    System.out.print(prompt);
    String s = sc.next();  // read user entry
    sc.nextLine();  // discard any other data entered on the line
    return s;
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

public static int getAgeInt(Scanner sc, String prompt,
int min, int max)
{
    int i = 0;
    boolean isValid = false;
    min = 1;
    max = 100;
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

public static int getHeightInt(Scanner sc, String prompt, int min, int max)
{
    int i = 0;
    boolean isValid = false;
    min = 36;
    max = 92;
    while (isValid == false)
    {
        i = getInt(sc, prompt);
        if (i > max)
            System.out.println(
                "Error! Number must be less than " + max + ".");
        else if (i < min){
        	System.out.println(
                    "Error! Number must be less than " + min + ".");}
        else
            isValid = true;
    }
    return i;
}

public static int getWeightInt(Scanner sc, String prompt, int min, int max)
{
    int i = 0;
    boolean isValid = false;
    min = 80;
    max = 400;
    while (isValid == false)
    {
        i = getInt(sc, prompt);
        if (i > max)
            System.out.println(
                "Error! Number must be less than " + max + ".");
        else if (i < min){
        	System.out.println(
                    "Error! Number must be less than " + min + ".");}
        else
            isValid = true;
    }
    return i;
}



public static double getDecimalDouble(Scanner sc, String prompt, int min, int max)
{
    double d = 0;
    boolean isValid = false;
    min = 0;
    max = 1;
    while (isValid == false)
    {
        d = getDouble(sc, prompt);
        if (d > max)
            System.out.println(
                "Error! Number must be less than " + max + ".");
        else if (d < min){
        	System.out.println(
                    "Error! Number must be less than " + min + ".");}
        else
            isValid = true;
    }
    return d;
}

public static double getDouble(Scanner sc, String prompt)
{
    double d = 0;
    boolean isValid = false;
    while (isValid == false)
    {
        System.out.print(prompt);
        if (sc.hasNextDouble())
        {
            d = sc.nextDouble();
            isValid = true;
        }
        else
        {
            System.out.println("Error! Invalid decimal value. Try again.");
        }
        sc.nextLine();  // discard any other data entered on the line
    }
    return d;
}

public static double getDouble(Scanner sc, String prompt,
double min, double max)
{
    double d = 0;
    boolean isValid = false;
    while (isValid == false)
    {
        d = getDouble(sc, prompt);
        if (d > max)
            System.out.println(
                "Error! Number must be less than " + max + ".");
        else
            isValid = true;
    }
    return d;
}
}