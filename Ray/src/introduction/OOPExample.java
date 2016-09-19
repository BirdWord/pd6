/**
 * 
 */
package introduction;
/**
 * @author Student 6
 *
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student petunia = new Student("Petunia");
		Senior alex = new Senior("Alex", "human banana");
		Junior meg = new Junior("Meg", true);
		meg.conversate();
		alex.talk();
		petunia.talk();
	}

}
