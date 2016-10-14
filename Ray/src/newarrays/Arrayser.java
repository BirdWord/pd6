package newarrays;

public class Arrayser {

	public static void main(String[] args) {
		//Arrays, when born with the new keyword, start with the values of integer 0, double 0.0, boolean false and string null.
		long start = System.currentTimeMillis();
		ArrayHelpers sample = new ArrayHelpers(10);
		sample.increase();
		System.out.println("The sample element has a number equal to "+sample.getNumber()+".");
		long end = System.currentTimeMillis();
		System.out.println((end-start)+"ms");
		
	}
	private static void passByValue(){
		//p("It took "+(end-start)+" millisecond(s).");
			//String[] string1 = {"","",""};
			///String[] string2 = new String[3];
				//string2[0] = "";
				//string2[1] = "";
				//string2[2] = "";
				//String[] string3 = new String[3];
				//for(int i = 0; i<string3.length; i++){
				//	string3[i] = "";}
				String[] someStrings = new String[102];
				populateArray(someStrings);
				printArray(someStrings);
				changeString(someStrings[100]);
				changeString(someStrings, 100);
				printArray(someStrings);
				changeArrayElement(someStrings, 99);
	}
	private static void changeArrayElement(String[] someStrings, int i) {
		someStrings[i] = "new item "+(i+1);
		
	}
	private static void changeString(String string) {
		string = "this has been changed";
	}
	private static void changeString(String[] a, int index) {
		 a[index]= "this has been changed";
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
	public static void populateArray(String[] a){
		for(int i = 0; i<a.length; i++){
			a[i] = "value "+(i+1);
		}
	}
	public static void printArray(String[] a){
		for(String b: a){
			p(b);
		}
	}
}
