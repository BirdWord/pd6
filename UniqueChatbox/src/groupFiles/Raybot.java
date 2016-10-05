package groupFiles;

import java.util.*;
public class Raybot {
	static Scanner scan;
	static String user;
	static boolean inLoop;
	static String response;
	static Topic kristy;
	static Topic ali;
	static Topic iram;
	//declare group classes
	public static void main(String[] args) {
		createTopics();
		promptName();
		talkForever();
	}
	public static void createTopics() {
		scan = new Scanner(System.in);
		Topic kristy = new KristyIsTriggered();
		Topic ali = new AliTrigger();
		Topic iram = new Iram();
	}
	public static void print(String x){
		System.out.println(x);
	}
	public static void promptInput(){
		print(user+", please input a string.");
		String userInput = scan.nextLine();
	}
	public static void talkForever(){
		inLoop = true;
		String[] userSpeech = new String[9001];
		String[] hateComments = {"Don't test me child.",
				"I don't think you are using the right hole for the right task.",
				"It is a pity that you have no shame.",
				"You are just as pitiful as a grain of sand in the hourglass of eternity.",
				"Has anything that has ever made sense come out of your mouth?"};
		int angerLevel = 0;
		while(inLoop){
			print("Greetings, "+user+". How are you?");
			response = getInput();
			if(Arrays.asList(userSpeech).contains(response))
				print(hateComments[(int)(Math.random()*hateComments.length)]);
			else if(findKeyword(response, "good", 0)>=0){
				print("Great...");
			}
			else if(findKeyword(response, "bored", 0)>=0){
				print("Would you like to play a game?");
				kristy.talk();
			}
			else if(findKeyword(response, "bored", 0)>=0){
				print("That is my field of expertise.");
				ali.talk();
			}
			
			//switch between chat boxes here
		}
	}
	public static int findKeyword(String searchString, String key, int startIndex) {
		String phrase = searchString.trim().toLowerCase();
		key.toLowerCase();
		int psn = phrase.indexOf(key);
		while(psn>=0){
			String before = " ";
			String after = " ";
			if(psn+key.length() < phrase.length()){
				after = phrase.substring(psn+key.length(), psn+key.length()+1);
			}
			if(psn>0){
				before = phrase.substring(psn-1, psn).toLowerCase();
			}
			if(before.compareTo("a")<0 && after.compareTo("a")<0){
				if(noNegations(phrase, psn))
				return psn;
			}
			psn = phrase.indexOf(key, psn+1);
		}
		return -1;
	}
	//helper methods are private.
	private static boolean noNegations(String phrase, int index){
		if(index-3 >= 0 && phrase.substring(index-3, index).equals("no ")){
			return false;
		}
		if(index-4 >= 0 && phrase.substring(index-4, index).equals("not ")){
			return false;
		}
		if(index-6 >= 0 && phrase.substring(index-6, index).equals("never ")){
			return false;
		}
		if(index-4 >= 0 && phrase.substring(index-4, index).equals("n't ")){
			return false;
		}
		return true;
	}
	public static void promptName(){
		print("Hello there, student.");
		print("I'd advise you tell me your name before you talk to me.");
		user = scan.nextLine();
		print("Alright...");
		print("I'll call you "+user+".");
	}
	public static String skipLines(String x, int cutOff){
		String returnString = "";
		while(x.length() > 0){
			String currentLine = "";
			String nextWord = "";
			while(currentLine.length() + nextWord.length() <= cutOff && x.length() > 0){
				currentLine += nextWord;
				x = x.substring(nextWord.length());
				int endOfWord = x.indexOf(" ");
				if(endOfWord == -1)
					endOfWord = x.length()-1;
				nextWord= x.substring(0, endOfWord+1);
			}
			returnString += currentLine+"\n";
		}
		return returnString;
	}
	public static String getInput(){
		return scan.nextLine();
	}

}