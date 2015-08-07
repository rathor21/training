import java.util.*;

public class CardMonteApp {
	
	public static void main(String[] args) {
		int choice = 0, randomLocation = 0;
		double currentWallet = 100, bet;
		String playAgain = "", graphicalInterface = "";
		CardMonte c = new CardMonte();
		Scanner keyboard = new Scanner(System.in);
		
		label:
		do 
		{
		c.randomGenerator();
		System.out.println("Current Wallet: " + currentWallet);
		System.out.println("Enter Intial Bet (min $5)");
		bet = keyboard.nextDouble();
		try {
		if (bet < 5){
			System.out.println("Error: Enter Bet over $5");
			break;
		}
		else if (bet > currentWallet){
			System.out.println("Eror: You don't have enough money");
			break;
		}
		} catch(ArithmeticException e) {
			System.out.println("Error: invalid input");
		}
		System.out.println(c.initialGraphic());
		System.out.println("1 2 3");
		System.out.println("Select a card");
		choice = keyboard.nextInt();
		c.setChoice(choice);
		System.out.println(c.randomGenerator());
		System.out.println(c.endGraphic());
		System.out.println("Play again? (Y/N)");
		playAgain = keyboard.next();
		if (c.isWin() == false)
			currentWallet = currentWallet - bet;
		else if (c.isWin() == true);
			currentWallet = currentWallet + bet;
		
		if (currentWallet < 1|currentWallet > 499)
			break label;
		
		}
		while (playAgain.equalsIgnoreCase("y"));
	System.out.println("Final Wallet: " +currentWallet);
	}
	
}
