package timecomplexity;

public class TimeComplexity {

	public static void main(String[] args) {
		move();;
	}
	/*	Line 0: public double getAverage(double[] values){
		Line 1:     double sum=0.0;							1
		Line 2:     for(int i = 0; i<values.length; i++){	2(n+1)
		Line 3:         sum+=values[i];						2n
		Line 4:     }
		Line 5:     return sum/values.length;				2
		Line 6: }
															4n+5 ms
		
		Line 0: public boolean isPrime(int n){
		Line 1:     boolean prime = true; 					1
		Line 2:     for(int i = 2; i<n; i++){ 				2n-2
		Line 3:         if(n%i==0) prime = false;   BC: 2n-4 WC: 3n-6
		Line 4:     }
		Line 5:     return prime; 							1
		Line 6: }
													BC: 4n-4 WC: 5n-6
		
		Line 0: public boolean isPrime(int n){
		Line 1:     boolean prime = true; 					1
		Line 2:     for(int i = 2; i<Math.sqrt(n); i++){ 	3(sqrt(n)-1)
		Line 3:         if(n%i==0) prime = false;  	BC: 2(sqrt(n)-2) WC: 3(sqrt(n)-2)
		Line 4:     }
		Line 5:     return prime;							1
		Line 6: }
													BC: 5sqrt(n)-5 WC: 6sqrt(n)-7
		
		Line 0: public boolean isPrime(int n){
		Line 1:     boolean prime = true; 					1
		Line 2:     double sqrt = Math.sqrt(n); 			2
		Line 3:     for(int i = 2; i<sqrt); i++){ 			2(sqrt(n)-1)
		Line 4:         if(n%i==0) prime = false;  	BC: 2(sqrt(n)-2) WC: 3(sqrt(n)-2)
		Line 5:     }
		Line 6:     return prime; 							1
		Line 7: }
											BC: 4sqrt(n)-2 WC: 5sqrt(n)-4
	*/

	private static void move() {
		// TODO Auto-generated method stub
		
	}
	

}
