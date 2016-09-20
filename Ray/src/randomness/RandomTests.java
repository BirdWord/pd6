
package randomness;
import java.util.*;
public class RandomTests {

	public static void main(String[] args) {
		for(int i = 0; i<10; i++){
			System.out.println("Roll #"+(i+1)+": "+rollFairDie());
			System.out.println("Roll #"+(i+1)+": "+rollUnfairDie());
		}
	}
	public static int rollFairDie(){
		Random gen = new Random();
		return gen.nextInt(6)+1;
	}
	public static int rollUnfairDie(){
		Random roll = new Random();
		int testRoll = roll.nextInt(6)+1;
		if(testRoll<6)
			testRoll = roll.nextInt(6)+1;
		return testRoll;
	}

}
