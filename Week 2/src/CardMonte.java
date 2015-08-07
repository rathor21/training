import java.util.*;

public class CardMonte {
	static int choice = 0;
	String result = "";
	private int aceLocation, fakeLocation;
	String graph = "", initialGraph = "";
	double bet, currentWallet;
	private boolean win;
	public boolean isWin() {
		return win;
	}

	public void setWin(boolean win) {
		this.win = win;
	}

	public double getBet() {
		return bet;
	}

	public void setBet(double bet) {
		this.bet = bet;
	}

	public double getCurrentWallet() {
		return currentWallet;
	}

	public void setCurrentWallet(double currentWallet) {
		this.currentWallet = currentWallet;
	}

	public static int getChoice() {
		return choice;
	}

	public static void setChoice(int choice) {
		CardMonte.choice = choice;
	}

	public CardMonte(){}
	
	public String randomGenerator() {
		Random r = new Random();
		aceLocation = 1 + r.nextInt(3);
		
			if (choice == aceLocation)
			{
				result = "You guessed correctly. You win!";
				win = true;
			}
			else
			{
				result = "Wrong!";
				win = false;
			}
		return result;	
	}
	
	public String initialGraphic() {
		Random ir = new Random();
		fakeLocation = 1 + ir.nextInt(3);
		if (fakeLocation == 1)
			initialGraph = "A J J";
		else if (fakeLocation == 2)
			initialGraph = "J A J";
		else if (fakeLocation == 3)
			initialGraph = "J J A";
		return initialGraph;
	}
	
	public String endGraphic() {
		if (aceLocation == 1)
			graph = "A J J";
		else if (aceLocation == 2)
			graph = "J A J";
		else if (aceLocation == 3)
			graph = "J J A";
		return graph;
	}
	
	public double bettingSystem(){
		currentWallet = currentWallet - bet;
		return currentWallet;
	}
	
	public int getAceLocation() {
		return aceLocation;
	}

	public void setAceLocation(int aceLocation) {
		this.aceLocation = aceLocation;
	}	
	
}
