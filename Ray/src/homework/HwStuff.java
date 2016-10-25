package homework;

import java.util.Scanner;

public class HwStuff {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[100];
		int start = 0;
		for(int i = 0; i<100; i++){
			start+=(int)(Math.random()*20)+1;
			a[i] = start;
		}
		printIntArray(a);
	}
	private static void printIntArray(int[] arr, int startidx, int endidx){
		System.out.print("[");
		for(int i = startidx; i<endidx; i++){
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[endidx]+"]");
		System.out.println();
	}
	private static void printIntArray(int[] arr){
		System.out.print("[");
		for(int i = 0; i<arr.length-1; i++){
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[arr.length-1]+"]");
		System.out.println();
	}
    

}
