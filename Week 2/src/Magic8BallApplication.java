import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.*
;public class Magic8BallApplication
{
	public static void main ( String[] args )
	{
		
		String question, proceed;
		MagicBackEnd backend = new MagicBackEnd();
		
		Scanner keyboard = new Scanner(System.in);
	
	
		do {
			

		System.out.println("Ask a question");
		question = keyboard.nextLine();
		
		
		System.out.println( "MAGIC 8-BALL SAYS: " + backend.userResponse() );
		backend.storeQuestions(question);
		System.out.println("Continue (Y/N)");
		proceed = keyboard.nextLine();
		
		} while (proceed.equalsIgnoreCase("Y"));
		System.out.println(backend.returnArray());
	}
	

	
}