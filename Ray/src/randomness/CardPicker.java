package randomness;

public class CardPicker {
	public static void main(String[] args){
		for(int i = 0; i<20; i++)
			System.out.println(pickCard());
	}
	public static String pickCard(){
		String[] title = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
		int titlePick = (int)(Math.random()*13);
		int suitPick = (int)(Math.random()*4);
		return "The "+title[titlePick]+" of "+suit[suitPick];
	}
}
