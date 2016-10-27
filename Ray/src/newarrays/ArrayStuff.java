package newarrays;

public class ArrayStuff {

	public static void main(String[] args) {
		testPrimes(5);
	}
	private static void shuffle(int[] arr){
		for(int i = 0; i<arr.length; i++){
			int rand = (int)(Math.random()*(arr.length));
			swap(arr, i, rand);
		}
	}
	private static void swap(int[] arr, int i1, int i2){
		int hold = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = hold;
	}
	private static void popRand(int[] arr, int length){
		//make a rand array filled with distinct rand numbers from arr with given length
	}
	public static void testPrimes(int numberToTest){
		int lastToCheck = (int)(Math.sqrt(numberToTest));
		boolean[] theNumbers = new boolean[numberToTest];
		for(int i = 0; i<numberToTest; i++){
			theNumbers[i] = true;
		}
		theNumbers[0] = false;
		theNumbers[1] = false;
		for(int i = 2; i<=numberToTest; i++){
			int increment = i+i;
			for(int test = increment; test<=lastToCheck; test+=increment){
				theNumbers[test] = false;
			}
		}
		for(int i = 0; i<theNumbers.length; i++){
			if(theNumbers[i]){
				System.out.println(i+" is prime.");
			}
		}
	}
}
