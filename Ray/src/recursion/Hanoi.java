package recursion;

public class Hanoi {

	public static void main(String[] args) {
		hanoi(10, "A", "B", "C");
	}
	public static void hanoi(int discs, String from, String mid, String to){
		if(discs <= 1){
			print("Move from "+from+" to "+to+".");
			moveCount++;
		}
		else{
			//move all but last to B
			hanoi(discs-1, from, to, mid);
			//move last to C
			hanoi(1, from, mid, to);
			//move all but last one to C
			hanoi(discs-1, mid, from, to);
		}
	}
	private static int moveCount = 1;
	private static void print(String string) {
		System.out.println("Move #"+moveCount+": "+string);
	}

}
