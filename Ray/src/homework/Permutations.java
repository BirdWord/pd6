package homework;

public class Permutations {
	public static void main(String[] args) {
		String[] s1 = {"cat", "dog", "mouse", "cat", "moose", "cat"};
		String[] s2 = {"cat", "dog", "mouse", "cat"};
		printArray(printPermutations(s2));
    }
	/*Write a method called: public static String[] printPermutations(String[] s1)
	 *  The method should print every permutation of two strings from s1 with NO duplicates 
	 *  (DO NOT separate with a space!). This assignment is scaffolded: In the first test,
	 *  the s1 will have distinct items In a later test, the s1 will have some duplicate
	 *  entries Example: Suppose the String[] s1 = {"cat", "dog", "mouse", "cat"} Then
	 *  "every permutation of two strings from s1 with NO duplicates" would be: {"catdog",
	 *  "catmouse", "catcat", "dogcat","dogdog", dogmouse", "mousecat", mousedog", "mousemouse"}
	 *  Notice that even though "cat" is listed twice in the original array, there are no duplicates in the returned array.*/
    public static String[] printPermutations(String[] s1){
    	//need the array without duplicates
        String[] noDupesArray = removeDuplicates(s1);
        //array to store permutations has one per string each of which can be paired to any other than it 
        String[] permuArray = new String[((noDupesArray.length)*(noDupesArray.length))];
        //need a new counter for the permutation array
        int c = 0;
        //iterate thru array need this type specifically to check indexes
        for(int i = 0; i<noDupesArray.length; i++){
        	//iterate through the array a second time inside for when adding stuff
        	for(int j = 0; j<noDupesArray.length; j++){
        		permuArray[c] = noDupesArray[i]+noDupesArray[j];
        		c++;
        	}
        }
        return permuArray;
    }
    public static String[] removeDuplicates(String[] arr){
    	//check dupes in array
    	boolean[] dupesArray = new boolean[arr.length];
    	//true means keep, false means dupe aka toss
    	dupesArray[0] = true;
    	//iterate through rest of array
    	for(int i = 1; i<arr.length; i++){
    		//only have to check if item was there previously in array
    		for(int j = 0; j<i; j++){
    			if(j!=i && arr[i] == arr[j]){
    				dupesArray[i] = false;
    				break;
    			}
    			dupesArray[i] = true;
    		}
    	}
    	//check which items are true aka arent duplicates and need number of 
    	//nonduplicates to find length of array without duplicates
    	int nonDupes = 0;
    	for(boolean b: dupesArray){
    		if(b)
    			nonDupes++;
    	}
    	//now, create new array which will contain items if they werent duplicate
    	String[] ret = new String[nonDupes];
    	//counter to add to return array
    	int c = 0;
    	for(int k = 0; k<arr.length; k++){
    		if(dupesArray[k]){
    			ret[c] = arr[k];
    			c++;
    		}
    			
    	}
    	return ret;
    }
    public static void printArray(String[] s){
       String all = "[";
       for(int i=0; i<s.length-1; i++){
           all+=s[i]+", ";
       }
       all+=s[s.length-1]+"]";
       System.out.println(all);
   }
}
