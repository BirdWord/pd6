package newarrays;

public class Arrayser {

	public static void main(String[] args) {
		//Arrays, when born with the new keyword, start with the values of integer 0, double 0.0, boolean false and string null.
		long start = System.currentTimeMillis();
		arrayIntro();
		long end = System.currentTimeMillis();
		p("It took "+(end-start)+" millisecond(s).");
	}
	public static void p(String s){
		System.out.println(s);
	}
	public static void arrayIntro(){
		int[] num1 = new int[2];
		int[] num2 = {0, 0};
		int[] num3 = new int[]{0, 0};
		System.out.println(num1.length+", "+num2.length+", "+num3.length);
		
		String[] string1 = {"zero", "one", null};
		String[] string2 = new String[3];
		String[] string3 = {null, null, null};
		System.out.println(string1.length+", "+string2.length+", "+string3.length);
		
		//ITERATION
		int[] numArray = {6, 7, 5, 2, 5};
		for(int i = 0; i<numArray.length; i++){
			System.out.println(numArray[i]);
		}
		for(int number: numArray){
			System.out.println(number);
		}
		boolean[] booleanArray = new boolean[10];
		for(boolean bool: booleanArray){
			System.out.print(bool+" ");
		}
		p("");
	}

}
