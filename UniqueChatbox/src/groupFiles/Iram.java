package groupFiles;

import Raybot.Iram;
import java.util.Random;
import java.util.Scanner;


public class Iram implements Topic{

	private boolean inLikeLoop;
	private String likeResponse;

	public boolean isTriggered(String userInput) {
		String[] triggers = {};
		if(Raybot.findKeyword(userInput, "", 0) >= 0){
			return true;
		}
		return false;
	}

}
