package groupFiles;

import Raybot.Iram;
import java.util.Random;
import java.util.Scanner;


public class Iram implements Topic{

	private boolean inLikeLoop;
	private String likeResponse;

	public boolean isTriggered(String userInput) {
		String[] triggers = {};
		if(Raybot.findKeyword(userInput, "", 0) >= 0){
			return true;
		}
		return false;
	}

	public void talk(){
		Iram.print("Think of a number between 1 to 1000");// make the thousand any random number
		Scanner keyboard = new Scanner(System.in);
		int a = 1 + (int) (Math.random() * 999);
		int guess;
		while((guess != a)){
			if (guess > a)
			{  
				System.out.println("Too high");
			}
			else 
			{
				System.out.println("Too low");
			}
			if (guess >= a-50)
			{
				System.out.println("You are getting closer go a little higher");
			}
			if(guess <= a+50 )
			{
				System.out.println("You are getting closer go a little lower");

			}
		}
	}

}
