package groupFiles;

public class KristyIsTriggered implements Topic
{
	public boolean isTriggered (String userInput)
	{

		if (Raybot.findKeyword(userInput, "bye", 0)>=0)
		{
			return true;
		}
		if (Raybot.findKeyword(userInput, "goodbye", 0)>=0)
		{
			return true;
		}
		return false;
	}
}
