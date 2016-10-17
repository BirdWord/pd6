package newarrays;

public class Testing {
	public static void main(String[] args){
		printIntegerArray(populate1to50());
		printIntegerArray(populateRandomIntArray(20));
		printIntegerArray(generateDiceRollArray(20));
		printStringArray(generateCardDeck());
		int[] arr = {0,1,2,3,4};
		swapItems(0, arr.length-1, arr);
		printIntegerArray(arr);
	}
	private static void printIntegerArray(int[] arr){
		System.out.print(arr[0]);
		for(int i = 1; i<arr.length; i++){
			System.out.print(", "+arr[i]);
		}
		System.out.println();
	}
	private static void printStringArray(String[] arr){
		System.out.print(arr[0]);
		for(int i = 1; i<arr.length; i++){
			System.out.print(", "+arr[i]);
		}
		System.out.println();
	}
	private static int[] populate1to50(){
		int[] arr = new int[50];
		for(int i = 0; i < 50; i++){
			arr[i] = i+1;
		}
		return arr;
	}
	private static int[] populateRandomIntArray(int length){
		int[] arr = new int[length];
		for(int i = 0; i<length; i++){
			arr[i] = (int)(Math.random()*100);
		}
		return arr;
	}
	private static int[] generateDiceRollArray(int rolls){
		int[] rollArray = new int[rolls];
		for(int i = 0; i<rolls; i++){
			rollArray[i] = (int)(Math.random()*6)+1+(int)(Math.random()*6)+1;
		}
		return rollArray;
	}
	private static String[] generateCardDeck(){
		String[] deck = new String[52];
		String[] value = {"Ace", "2", "3", "4", "5",  "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suit = {"Spades", "Diamonds", "Clubs", "Hearts"};
		int i = 0;
		for(String str: value){
			for(String rts: suit){
				deck[i] = str+" of "+rts;
				i++;
			}
		}
		return deck;
	}
	private static void swapItems(int index1, int index2, int[] arr){
		int value = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = value;
	}
	private static void shuffleArray(int[] arr){
		int[] shuf = new int[arr.length];
		
	}
	
}
