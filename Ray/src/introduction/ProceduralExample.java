/**
 * 
 */
package introduction;

/**
 * @author Student 6
 *
 */
public class ProceduralExample {
	public static void main(String[] args){
		String[] names = {"Jillian", "Joseph", "Jordan"};
		String[] years = {"senior", "sophmore", "junior"};
		int i;
		for(i = 0; i<years.length; i++)
		{
			System.out.println("My name is " + names[i] + " and I am a "+ years[i] + ".");
		}
	}
}
