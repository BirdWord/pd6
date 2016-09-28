package chatbox;

public class School implements Topic {
	private static boolean inSchoolLoop;
	private static String response;
	public static void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			Raybot.print("Do something.");
			response = Raybot.getInput();
			if(response.indexOf("stop")>-1)
				inSchoolLoop = false;
			Raybot.print("That's my favorite part of school too.");
		}

	}
	public boolean isTriggered(String userInput) {
		// TODO Auto-generated method stub
		return false;
	}

}
