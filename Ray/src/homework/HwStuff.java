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
<<<<<<< HEAD
=======
		System.out.println("Gimme a working one: ");
		int lookingFor = Integer.parseInt(scan.nextLine());
		System.out.println(searchSorted(a,lookingFor));
		System.out.println("Gimme a broken one: ");
		int broken = Integer.parseInt(scan.nextLine());
		System.out.println(searchSorted(a,broken));
>>>>>>> refs/remotes/origin/master
	}
<<<<<<< HEAD
=======
	/*public static int searchSorted(int[] sortedArrayToSearch, int key){
		int low = 0;
		int high = sortedArrayToSearch.length-1;
		int piv = (low+high)/2;
		while(low<=high && sortedArrayToSearch[piv] != key){
			if(sortedArrayToSearch[piv] < key){
				low = piv+1;
			}
			else{
				high = piv-1;
			}
			piv = (low+high)/2;
			if(low>high){
				piv = -1;
			}
		}
		return piv;
    }*/
	public static int searchSorted(int[] sortedArrayToSearch, int key){
		int min = 0;
		int max = sortedArrayToSearch.length-1;
		int mid = (min+max)/2;
		while(min<max){
			if(key>sortedArrayToSearch[mid]){
				min = mid+1;
			}
			else if(key<sortedArrayToSearch[mid]){
				max = mid-1;
			}
			else{
				max = mid;
				min = mid;
			}
			mid = (min+max)/2;
			if(min>max){
				mid = -1;
			}
			System.out.println("min: "+min+" mid: "+mid+" max: "+max);
		}
		return mid;
    }
>>>>>>> refs/remotes/origin/master
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
