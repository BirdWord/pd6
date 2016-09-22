package mathstuff;

public class Classic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] some = {3, 4, 5};
		System.out.println(average(some));
	}
	public static int average(int[] arr)
	{
	    int sum = 0;
	    for(int i = 0;i < arr.length;i++)
	    {
	        sum += arr[i];
	    }
	    System.out.println(sum);
	    int numItems = arr.length;
	    int avg = sum / numItems;
	    return avg;
	    
	}

}
