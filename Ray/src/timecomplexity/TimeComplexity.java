package timecomplexity;

import java.util.Arrays;

public class TimeComplexity {
	private static boolean b;
	public static void main(String[] args) {
		String[] wordList = {"dog", "cat", "horse", "rabbit", "bird", "tiger", "unicorn"};
					String word = "";
					for(int i = 0; i < wordList.length; i+=2)
				{
					  word += wordList[i].substring(0, wordList[i].length()/2);
				}
				System.out.print(word);

	}
}
