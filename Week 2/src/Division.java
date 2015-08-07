import java.util.Scanner;

class Division {
	public static void main(String[] args) {

		int a, b, result;

		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");
		try {
			a = input.nextInt();
			b = input.nextInt();

			result = a / b;

			System.out.println("Result = " + result);
		} catch (ArithmeticException e) {
			System.out.println("you can't divide by 0 idiot");
		}
	    finally {
	        System.out.println("finally block will execute.");
	  }


	}

}