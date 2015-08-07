import java.util.*;

public class CalculatorApp {

	public static void main(String[] args) {
		int firstNumber = 0;
		int operationSelection = 0;
		int secondNumber = 0;
		Calculator c = new Calculator();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the first number? ");
		firstNumber = keyboard.nextInt();
		c.setFirstNumber(firstNumber);
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		System.out.println("5 - Modulus");
		System.out.println("What do you want to do?");
		operationSelection = keyboard.nextInt();
		c.setOperationSelection(operationSelection);
		System.out.println("What is the second number?");
		secondNumber = keyboard.nextInt();
		c.setSecondNumber(secondNumber);
		System.out.println(firstNumber + " " + c.operationOutput() + " " +secondNumber + " = " + c.operation());
	}

}
