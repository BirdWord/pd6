package sorts;

import java.util.Arrays;

public class AllSortsofSorts {
	public static void main(String[] args) {
		int[] arrayToSort={133,0,-5,31,12,12,2};
		quickSort(arrayToSort, 0, arrayToSort.length-1);
		System.out.println(Arrays.toString(arrayToSort));
	}
	
	public static void quickSort(int[] arr, int start, int end){
		int i = start;                          // index of left-to-right scan
        int k = end;                            // index of right-to-left scan

        if (end - start >= 1)                   // check that there are at least two elements to sort
        {
                int pivot = arr[start];       // set the pivot as the first element in the partition

                while (k > i)                   // while the scan indices from left and right have not met,
                {
                        while (arr[i] <= pivot && i <= end && k > i)  // from the left, look for the first
                                i++;                                    // element greater than the pivot
                        while (arr[k] > pivot && k >= start && k >= i) // from the right, look for the first
                            k--;                                        // element not greater than the pivot
                        if (k > i)                                       // if the left seekindex is still smaller than
                                swap(arr, i, k);                      // the right index, swap the corresponding elements
                }
                swap(arr, start, k);          // after the indices have crossed, swap the last element in
                                                // the left partition with the pivot 
                quickSort(arr, start, k - 1); // quicksort the left partition
                quickSort(arr, k + 1, end);   // quicksort the right partition
        }
        else    // if there is only one element in the partition, do not do any sorting
        {
                return;                     // the array is sorted, so exit
        }
		
	}
	public static int[] copy(int[] arr){
		int[] copy = new int[arr.length];
		for(int i = 0; i < copy.length; i++){
			copy[i]=arr[i];
		}
		return copy;
	}

	public static void swap(int[] arr, int i, int j){
		System.out.println("Swapping "+arr[i]+" and "+arr[j]);
		int placeHolder=arr[j];
		arr[j]=arr[i];
		arr[i]=placeHolder;
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arrayToSort){
		//search the array for the smallest value...
		int minIndex=0;
		int minimum=arrayToSort[0];
		for(int i=0;i<arrayToSort.length;i++){
			//first, you assume the element you are currently
			//looking at IS the smallest value...
			minIndex=i;
			minimum=arrayToSort[i];
			for(int j=i;j<arrayToSort.length;j++){
				//and if you find a smaller value,
				//re-assign the minimum
				if(arrayToSort[j]<minimum){
					minimum=arrayToSort[j];
					minIndex=j;
				}
			}
			//then swap the new minimum so that it
			//is in the earliest position in the array
			swap(arrayToSort, i, minIndex);
			//now find the NEXT smallest element...
		}
	}

	public static void insertionSort(int[] arrayToSort){
		//this algorithm takes one element at a time to 
		//add in sorted order...
		//start at 1 since the element at zero is
		//already in "sorted order" (since it is alone)
		for (int i = 1; i < arrayToSort.length; i++) {
			//with each element, i, go BACKWARDS from i, 
			//until you find a value that is smaller
			//swap as you go
			for(int j = i ; j > 0 ; j--){
				if(arrayToSort[j] < arrayToSort[j-1]){
					swap(arrayToSort,j,j-1);
				}
			}
		}
	}


	public static void bubbleSort(int[] arrayToSort){
		//go forward in the array
		for(int i=0; i < arrayToSort.length-1; i++){
			//swap pairs that are out of order
			for(int j=1; j < arrayToSort.length-i; j++){
				if(arrayToSort[j-1] > arrayToSort[j]){
					swap(arrayToSort,j-1,j);
				}
			}
			//keep doing that repeatedly, eventually the largest values will "float" to the top
		}
	}
}
