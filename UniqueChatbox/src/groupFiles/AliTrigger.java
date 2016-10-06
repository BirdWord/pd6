package groupFiles;

public class AliTrigger implements Topic 
{
	private static String[] compSciQuestions = {"What is Recursion?","What is Mr.Ip's favorite college?","What is a primitive data type?"};
	private static String[] answerKey = {"repeat","Berkeley","data that is not in its own class",};
	private int answer;
	private boolean questionCycle;
	private String userAnswer;
	public void talk()
	{
		Raybot.print("Do you wanna test your abilities in computer science?");
		while(questionCycle)
		{
			
			answer=(int)(Math.random()*compSciQuestions.length);
			Raybot.print(compSciQuestions[answer]);
			userAnswer =Raybot.getInput();
			checkAnswer(userAnswer, answer);
		}

	}
	public void checkAnswer(String userAnswer , int number)
	{
		if (number==0)
		{
			if (userAnswer == answerKey[0])
			{
				Raybot.print("you're correct!");
			}
			else
			{
				Raybot.print("Try again");
			}
		}
		else if (1 == number)
		{
			if (userAnswer == answerKey[1])
			{
				Raybot.print("you're correct!");
			}
			else
			{
				Raybot.print("Try again");
			}
		}
		else
		{

			if (userAnswer == answerKey[2])
			{
				Raybot.print("you're correct!");
			}
			else
			{
				Raybot.print("Try again");

			}
		}
	}
//	public String getResponse {
//		
//	}
	public boolean isTriggered(String userInput){
		String[] triggers = {"grammar","punctuation"};
		for(int i=0; i<triggers.length; i++)
		{
			if(Raybot.findKeyword(userInput, triggers[i], 0) >= 0){
				return true;
			}
		}
		return false;
	}
//	public static void talk(){
//	}
//
}
