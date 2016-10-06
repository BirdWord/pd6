package groupFiles;

import java.util.*;
public class Raybot {
	static Scanner scan;
	static String user;
	static String response;
	static Topic kristy;
	static Topic ali;
	static Topic iram;
	static boolean inLoop;
	public static void main(String[] args) {
		createTopics();
		promptName();
		talkForever();
	}
	private static void createTopics() {
		scan = new Scanner(System.in);
		kristy = new KristyIsTriggered();
		ali = new AliTrigger();
		iram = new Iram();
	}
	public static void print(String x){
		System.out.println(x);
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
	public static void promptName(){
		print("Hello there, student.");
		print("I'd advise you tell me your name before you talk to me.");
		user = scan.nextLine();
		print("Alright...");
		print("I'll call you "+user+".");
	}
	public static String getInput(){
		return scan.nextLine();
	}
	public static void talkForever(){
		inLoop = true;
		String[] userSpeech = new String[100];
		String[] hateComments = {"Don't test me child.",
				"I don't think you are using the right hole for the right task.",
				"It is a pity that you have no shame.",
				"You are just as pitiful as a grain of sand in the hourglass of eternity.",
				"Has anything that has ever made sense come out of your mouth?"};
		while(inLoop){
			print("Greetings, "+user+". How are you?");
			int arrayCount = 0;
			response = getInput();
			userSpeech[arrayCount] = response;
			arrayCount++;
			if(hasItem(userSpeech, response)){
				print(hateComments[(int)(Math.random()*hateComments.length)]);
			}
			else if(keywordFound(response, "good") || keywordFound(response, "fine") || keywordFound(response, "great")){
				print("Great...");
				print("Anything you feel like doing?");
				if(kristy.isTriggered(response)){
					print("Would you like to play a game?");
					inLoop = false;
					kristy.talk();
				}
				else if(iram.isTriggered(response)){
					print("That is my field of expertise.");
					inLoop = false;
					iram.talk();
				}
				else if(ali.isTriggered(response)){
					print("Time for a quiz!");
					inLoop = false;
					ali.talk();
				}
			}
			
		}
	}
	//helpers
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
	private static boolean hasItem(String[] arr, String find){
		boolean check = false;
		for(String str: arr){
			if(str.equals(find))
				check = true;
		}
		return check;
	}
	private static boolean keywordFound(String whole, String keyword){
		return findKeyword(whole, keyword, 0)>=0;
	}
}