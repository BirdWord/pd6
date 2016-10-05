package groupFiles;

import java.util.*;
public class Iram implements Topic{
	private boolean inLoop;
	private String grammerResponse;

	public void talk(){
		System.out.println("Describe to me in a sentence why this is a cool program.");
		while(inLoop)
		{
			String input = Raybot.getInput();
			if(!checkPunc(input) && !checkCaps(input)){
				System.out.println("Check your capitalization and your punctuation!");
			}
			else if(!checkCaps(input)){
				System.out.println("Check your capitalization.");
			}
			else if(!checkPunc(input)){
				System.out.println("Check your punctuation.");
			}
			else if(!checkPunc(input) && checkCaps(input)){
				System.out.println("Your capitalization is correct but fix your punctuation.");
			}
			else if(!checkCaps(input) && checkPunc(input)){
				System.out.println("Your punctuatuation is right but your capitalization is wrong.");
			}
			else{
				System.out.println("Great grammar keep it up!");
			}
		}
	}
	public static boolean checkPunc(String str){
		char lstPsn = str.charAt(str.length());
		String[] punctuation = {"!",".","?"};
		if(Raybot.getInput().contains(""+lstPsn)){
			return true;
		}
		return false;
	}
	public static boolean checkCaps(String str){
		char firstLetter = str.charAt(0);
		if(Character.isUpperCase(firstLetter)){
			return true;
		}
		return false;
	}

	public boolean isTriggered(String userInput) {
		String[] triggers = {"grammer","punctuation"};
		if(Raybot.findKeyword(userInput, "", 0) >= 0){
			return true;
		}
		return false;
	}
}
