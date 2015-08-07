import java.util.ArrayList;
import java.util.Random;


public class MagicBackEnd {
	private String response = "";
	ArrayList<String> questionArray = new ArrayList<String>();
	ArrayList<String> responseArray = new ArrayList<String>();
	
	public MagicBackEnd(){}
	
	public String userResponse(){
		
	Random r = new Random();
	int choice = 1 + r.nextInt(20);
	
	if ( choice == 1 )
		response = "It is certain";
	else if ( choice == 2 )
		response = "It is decidedly so";
	else if ( choice == 3 )
		response = "Without a doubt";
	else if ( choice == 4 )
		response = "Yes - definitely";
	else if ( choice == 5 )
		response = "You may rely on it";
	else if ( choice == 6 )
		response = "As I see it, yes";
	else if ( choice == 7 )
		response = "Most likely";
	else if ( choice == 8 )
		response = "Outlook good";
	else if ( choice == 9 )
		response = "Signs point to yes";
	else if ( choice == 10 )
		response = "Yes";
	else if ( choice == 11 )
		response = "Reply hazy, try again";
	else if ( choice == 12 )
		response = "Ask again later";
	else if ( choice == 13 )
		response = "Better not tell you now";
	else if ( choice == 14 )
		response = "Cannot predict now";
	else if ( choice == 15 )
		response = "Don't count on it";
	else if ( choice == 16 )
		response = "My reply is no";
	else if ( choice == 17 )
		response = "My souces say no";
	else if ( choice == 18 )
		response = "Outlook not so good";
	else if ( choice == 19 )
		response = "Very doubtful";
	else if ( choice == 20 )
		response = "Cannot predict now";
	else 
		response = "8-BALL ERROR!";
	responseArray.add(response);
	return response;

	}
	
public void storeQuestions(String response)  {
	questionArray.add(response);

}
	
public String returnArray(){

	String Q="";
	String R="";
	
	for (int i = 0; i < questionArray.size(); i++) {
		Q += questionArray.get(i) +"\n";
		R += responseArray.get(i) +"\n";
	}
	
	
	return (Q+R);
	}
}

