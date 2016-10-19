package homework;

import java.util.Arrays;

public class HwStuff {

	public static void main(String[] args) {
		double[] arr = {6.0, 3.0, 4.0, 5.0, 62.0, 8.0, 46.0, 0.0};
		System.out.println(Arrays.toString(getStats(arr)));
	}
	public static double[] getStats(double[] array){
        /** 
         * This method return a double[] containing a WHOLE BUNCH of stats
         * The double array must keep the following stats about the array parameter:
         * index 0 = the mean !
         * index 1 = the max !
         * index 2 = the min !
         * index 3 = the median
         * index 4 = the number of values greater than or equal to the mean
         * index 5 = the number of values below the mean
         * */
		double[] stats = new double[6];
		double sum = 0.0;
		for(double a: array){
			sum+=a;
		}
		stats[0] = sum/array.length;
		double max = array[0];
		for(double b: array){
			if(b > max){
				max = b;
			}
		}
		stats[1] = max;
		double min = array[0];
		for(double c: array){
			if(c < min){
				min = c;
			}
		}
		stats[2] = min;
		for(int i = 0; i < array.length-1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index]) 
                    index = j;
      
            double smallerNumber = array[index];  
            array[index] = array[i];
            array[i] = smallerNumber;
        }
		if(array.length%2 == 0){
			stats[3] = (array[array.length/2]+array[(array.length/2)-1])/2;
		}
		else
			stats[3] = array[(array.length-1)/2];
		int greaterEqual = 0;
		for(double d: array){
			if(d >= stats[0])
				greaterEqual++;
		}
		stats[4] = greaterEqual;
		int lesser = 0;
		for(double e: array){
			if(e < stats[0])
				lesser++;
		}
		stats[5] = lesser;
        return stats;
    }
	
    

}
