
public class Calculator {
	private int firstNumber = 0;
	private int operationSelection = 0;
	private int result = 0;
	private String sign = "";
	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getOperationSelection() {
		return operationSelection;
	}

	public void setOperationSelection(int operationSelection) {
		this.operationSelection = operationSelection;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	private int secondNumber = 0;
	
	public int operation(){
		if (operationSelection == 1)
			result = firstNumber + secondNumber;
		else if (operationSelection == 2)
			result = firstNumber - secondNumber;
		else if (operationSelection == 3)
			result = firstNumber * secondNumber;
		else if (operationSelection == 4)
			result = firstNumber / secondNumber;
		else if (operationSelection == 5)
			result = firstNumber % secondNumber;
		return result;
	}
	
	public String operationOutput(){
		if (operationSelection == 1)
			sign = "+";
		else if (operationSelection == 2)
			sign = "-";
		else if (operationSelection == 3)
			sign = "*";
		else if (operationSelection == 4)
			sign = "/";
		else if (operationSelection == 5)
			sign = "%";
		return sign;
	}
}
