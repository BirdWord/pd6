package homework;

public class HwStuff {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5,6,7,8,9,10,12};
		int[] a2 = {9,6,3,4,3,6,7};
		System.out.println(searchSorted(a1, 10));
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
	public static int searchSorted(int[] sortedArrayToSearch, int key){
		int low = 0;
		int high = sortedArrayToSearch.length-1;
		while(low<=high){
			int piv = (low+high)/2;
			if(key>sortedArrayToSearch[piv]){
				low = piv+1;
			}
			else
				high = piv;
		}
		return low;
    }
    

}
