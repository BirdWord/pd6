package homework;

import java.util.Scanner;

public class HwStuff {

	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,7,8,9,10};
		int[] b = {8,9,10};
		System.out.println(searchSorted(a, 6));
	}
	public static int searchSorted(int[] sortedArrayToSearch, int key){
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
			System.out.println(piv);
		}
		return piv;
    }
	public static boolean contains(int[] arr, int[] subarr){
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == subarr[0]){
				for(int j = 1; j<subarr.length; j++){
					if(i+j+1 < arr.length){
						if(subarr[j] != arr[i+j])
							return false;
					}
				}
				return true;
			}
		}
		return false;
	}
	public static int[] getSubArray(int[] arr, int startIndex, int endIndex){
		int[] ret = new int[endIndex-startIndex+1];
		for(int i = 0; i<ret.length; i++){
			ret[i] = i+startIndex;
		}
		return ret;
	}
	//count num of elements <d in arr
	public static int countUnderBound(double[] arr, double d){
		int count = 0;
		for(double dub: arr){
			if(dub<d)
				count++;
			else 
				break;
		}
		return count;
	}
	public static int calcMedian(double[] arr){
		return -1;
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
