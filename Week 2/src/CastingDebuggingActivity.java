import java.util.Scanner;

public class CastingDebuggingActivity {
	public static void main(String[] args) {
		Scanner cookie = new Scanner(System.in);
		int input;
		int accumulator = 0;
		String cast = "";
		
		System.out.print("Gimme a number :");
		input = cookie.nextInt();
		cast = Integer.toString(input);
		while (cast != "")
		{
			input = Integer.parseInt(cast);
			accumulator += input;
			
			System.out.println(" running total => " + accumulator);
			System.out.print("Next number : ");
			cast = cookie.next();
		}
	}
}