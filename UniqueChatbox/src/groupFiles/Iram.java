package groupFiles;

public class Iram implements Topic{
	public boolean isTriggered(String userInput) {
		String[] triggers = {};
		if(Raybot.findKeyword(userInput, "", 0) >= 0){
			return true;
		}
		return false;
	}
	public static void talk(){

	}
}