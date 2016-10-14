package newarrays;
import java.util.Arrays;
public class Testing {
	public static void main(String[] args){
		a();
		c();
	}
	private static void a(){
		int[] a = {1,1,1};
		System.out.println("array before: "+Arrays.toString(a));
		b(a);
		System.out.println("array after: "+Arrays.toString(a));
	}
	private static void b(int[] x){
		x[2] = 6;
	}
	private static void c(){
		int banana = 0;
		System.out.println("c method banana before: "+banana);
		d(banana);
		System.out.println("c method banana after: "+banana);
	}
	private static void d(int banana){
		System.out.println("d method banana before: " + banana);
		banana++;
		System.out.println("d method banana after: " + banana);
	}
}
