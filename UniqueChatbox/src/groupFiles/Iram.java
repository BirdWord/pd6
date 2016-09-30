package groupFiles;

import Raybot.Iram;
public class Iram implements Topic{
	public boolean isTriggered(String userInput) {
		String[] triggers = {"school", "class", "teacher"};
		if(Iram.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if(Iram.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		return false;
	}
	public static void talk(){

	}
}
