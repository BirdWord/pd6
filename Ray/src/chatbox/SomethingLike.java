package chatbox;

public class SomethingLike implements Topic{
	private boolean inLikeLoop;
	private String likeResponse;
	public void talk(){
		Raybot.print("What are things you like?");
		inLikeLoop = true;
		while(inLikeLoop){
			likeResponse = Raybot.getInput();
			int likePsn = Raybot.findKeyword(likeResponse,"like",0);
			if(likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn+5);
				Raybot.print("You are such an interesting person because you like things like "+thingsLiked);
				if(Raybot.findKeyword(thingsLiked, "school", 0)>=0){
					inLikeLoop = false;
					Topic.talk();
				}
				else{
					inLikeLoop = false;
					Raybot.talkForever();
				}
			}
			else
				Raybot.print("I dont understand you");
			
		}
	}
	public boolean isTriggered(String userInput) {
		// TODO Auto-generated method stub
		return false;
	}
}
