package chatbox;

import java.util.Scanner;
public class Raybot {
	static Topic school;
	static Scanner scan;
	static String user;
	static boolean inLoop;
	static String response;
	//static int lineCount;
	public static void main(String[] args) {
		createTopics();
		//demonstrateStringMethods();
		promptName();
		talkForever();
		//print(skipLines("Hi, this is going to be a really nice and wonderful string that wants to be torn to smithereens.", 
		//		30));
	}
	public static void createTopics() {
		scan = new Scanner(System.in);
		school = new School();
		//lineCount = 0;
	}
	public static void print(String x){
		//lineCount++;
		System.out.println(x);
	}
	public static void demonstrateStringMethods(){
		String text1 = new String("Hello world");
		String text2 = "Hello world";
		String text3 = "Hello"+" world";
		System.out.println(text1.length());
		System.out.println(text1.equals(text2));
		System.out.println(text1.equals(text3));
		String word = "aardvark";
		String other = "supercalifragilisticexpialidocious";
		System.out.println(word.compareTo(other));
	}
	public static void promptInput(){
		print(user+", please input a string.");
		String userInput = scan.nextLine();
		print("Please input an integer.");
		int number = scan.nextInt();
		print("You typed "+userInput+".");
		print("You typed "+number+".");
	}
	public static void talkForever(){
		inLoop = true;
		while(inLoop){
			print("Greetings, "+user+". How are you?");
			response = getInput();
			if(response.indexOf("good") >= 0)
				print("I'm so happy you are good.");
			else 
				print("I'm sorry; I don't understand you.");
		}
	}
	public static void promptName(){
		print("Hi o-o");
		print("da mihi factum, dabo tibi ius \n"+"data venia.");
		user = scan.nextLine();
		print("datum perficiemus munus");
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