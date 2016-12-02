package recursion;

public class Recursion {

	public static void main(String[] args) {
		int numberOfTimes = 5;
		System.out.println("For Loop:");
		for(int i = 0; i<numberOfTimes; i++){
			System.out.println("Hi there.");
		}
		Action sayHi = new Action(){
			public void act(){
				System.out.println("Hi there.");
			}
		};
		System.out.println("first Recursion:");
		forLoop1(numberOfTimes, sayHi);
		System.out.println("second Recursion:");
		forLoop2(numberOfTimes, sayHi);
	}
	//standard w/ base case
	private static void forLoop1(int numberOfTimes, Action action) {
		if(numberOfTimes <= 1)
			action.act();
		else {
			action.act();
			forLoop1(numberOfTimes-1, action);
		}
	}
	//test for spd
	private static void forLoop2(int numberOfTimes, Action action) {
		action.act();
		if(numberOfTimes > 1)
			forLoop2(numberOfTimes-1, action);
	}
}
