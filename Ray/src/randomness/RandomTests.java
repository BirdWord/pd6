
package randomness;
import java.util.*;
public class RandomTests {

	public static void main(String[] args) {
		/*for(int i = 0; i<10; i++){
			System.out.println("Roll #"+(i+1)+": "+rollFairDie());
		}
		for(int i = 0; i<10; i++){
			System.out.println("Roll #"+(i+11)+": "+rollUnfairDie());
		}*/
		int[] result = new int[6];
		int times = 1000000;
		for(int b = 0; b < times+1; b++){
			result[rollUnfairDie()-1]++;
		}
		for(int x = 0; x < 6; x++){
			System.out.println((x+1)+": "+(int)((double)result[x]/(times/100)));
		}
	}
	public static int rollFairDie(){
		double rand = Math.random();
		int roll = (int)(6*rand)+1;
		return roll;
		//Random gen = new Random();
		//return gen.nextInt(6)+1;
	}
	public static int rollUnfairDie(){
		Random roll = new Random();
		int testRoll = roll.nextInt(6)+1;
		if(testRoll<6)
			testRoll = roll.nextInt(6)+1;
		return testRoll;
	}

}
