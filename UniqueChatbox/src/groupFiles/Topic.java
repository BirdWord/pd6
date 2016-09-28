package groupFiles;

public interface Topic {
	public static boolean isTriggered(String userInput){
		//make string away for trigger words and to use for loop
		if(Raybot.findKeyword(userInput, "school", 0)>=0){
			return true;
		}
		return false;
	}
	public static void talk(){
	}
}
