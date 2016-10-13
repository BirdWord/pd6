package newarrays;

public class ArrayHelpers {
	public static void main(String[] args){
		//Populate and print an array with the numbers 1 - 50.
		int[] array1 = new int[50];
		for(int i = 1; i<51; i++){
			array1[i] = i;
		}
		//Populate and print an array with random integers. how long? range of integers?
		int arrayLength = 3;
		int low = 1;
		int high = 10;
		//Populate an array with the roll of two dice. Verify Math.random() is random.
		int rolls = 100;
		int arrayLengths = rolls * 2;
		int[] rollArray = new int[arrayLengths];
		int j = 0;
		int k = 1;
		while(true){
			rollArray[j] = rollDice();
			rollArray[k] = rollDice();
			if(rollArray.length == arrayLengths)
				break;
		}
	}
	private static int rollDice(){
		return (int)(Math.random()*6)+1;
	}
}
