package groupFiles;
import java.util.*;

public class KristyIsTriggered implements Topic 
{
	private int low;
	private int high;
	private static String[] winningStatement={"Yay, you have won", "You win!"};
	private static String[] losingStatement = {"it's alright that you lost", "loser","You lost"};
	private int answer;
	private boolean gameTime;
	private int counter;
	private String[] triggerArray = {"bored", "game","play"};
	
	public void KristyHello()
	{
		low = 0;
		high = 100;
		answer = (int)(Math.random()*high);
		while (answer = 0)
		{
			answer = (int)(Math.random()*high);
		}
		counter = 0;
	}
	public void talk()
	{
		gameTime = true;
		while(gameTime)
		{
			counter++;
			
			int helloResponse = getIntegerInput();
			printResponse(helloResponse);
			if (giveUp())
			{
				gameTime = false;
				
				int responseIndex = (int)(Math.random()*losingStatement.length);
				Raybot.print(losingStatement[responseIndex]);
				Raybot.talkForever();
			}
			
		}
	}
	private static int getIntegerInput() {
		 Raybot.print("Please enter an integer.");
		 String integerString = Raybot.getInput();
		 boolean isInteger = false;
		 int value = 0;
		 while(!isInteger){
		 try{
		 value = Integer.parseInt(integerString);
		 //will not continue if an error above is thrown
		 isInteger = true;//exits loop if entry is valid
		 }catch(NumberFormatException e){
		 Raybot.print("You must enter an integer. You better try again.");
		 integerString = Raybot.getInput();
		 }
		 }
		 return value;
		 }
	public void printResponse(int userInput)
	{
		int responseIndex = 0;
		if (userInput == answer)
		{
			responseIndex = (int)(Math.random()*winningStatement.length);
			Raybot.print(winningStatement[responseIndex]);
			gameTime = false;
			Raybot.talkForever();
			
		}
		else if(userInput >= high || userInput <= low)
		{
			Raybot.print("pick again");
		}
		else if (userInput >= answer)
		{
			high = userInput;
			Raybot.print("please pick a number between" + low +"and"+ high);
		}
		else 
		{
			low = userInput;
			Raybot.print("please pick a number between" + low +"and"+ high);
		}
	}
	public boolean giveUp ()
	{
		if (counter== 6)
		{
			return true;
		}
		return false;
	}
	public boolean isTriggered(String userinput){
		for(String trigger: triggerArray){
			if(Arrays.asList(triggerArray).contains(trigger))
				return true;
		}
		return false;
	}
}
