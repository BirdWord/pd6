package chatbox;

public class HelloHello implements Topic{
	private boolean inHelloLoop;
	private String helloResponse;
	private int helloCount;
	private static String[] calmResponse = {"We've already said hello.", "Hello to you, how about we actually talk?"};
	private static String[] angryResponse = {"SERIOUSLY?", "You are beginning to annoy me.", "WE'VE ALREADY SAID HELLO!"};
	public HelloHello(){
		helloCount = 0;
	}
	public void talk(){
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();
			helloResponse = Raybot.getInput();
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				Raybot.talkForever();
			}
		}
	}
	public boolean isTriggered(String userInput){
		if(Raybot.findKeyword(userInput, "hi", 0)>=0){
			return true;
		}
		if(Raybot.findKeyword(userInput, "hello", 0)>=0){
			return true;
		}
		return false;
	}
	private void printResponse(){
		int responseIndex = 0;
		if(helloCount<5){
			responseIndex = (int)(Math.random()*calmResponse.length);
			Raybot.print(calmResponse[responseIndex]);
		}
		else{
			responseIndex = (int)(Math.random()*angryResponse.length);
			Raybot.print(angryResponse[responseIndex]);
		}
	}
}
