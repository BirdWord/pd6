
package stringstuff;
import java.util.Scanner;
public class StringPrac {
	static Scanner scan;
	static String user;
	static int lineCount;
	public static void main(String[] args) {
		createScanner();
		//demonstrateStringMethods();
		promptName();
		talkForever();
	}
	public static void createScanner() {
		scan = new Scanner(System.in);
		lineCount = 0;
	}
	public static void print(String x){
		lineCount++;
		System.out.println("Line#: "+lineCount+" "+x);
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
		while(true){
			promptInput();
		}
	}
	public static void promptName(){
		print("Hi o-o");
		print("da mihi factum, dabo tibi ius \n"+"data venia.");
		user = scan.nextLine();
		print("datum perficiemus munus");
		print("I'll call you "+user+".");
		
	}

}
