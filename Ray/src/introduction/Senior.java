package introduction;

public class Senior extends Student{
	private String internship;
	public Senior(String name, String internship) {
		super(name);
		this.internship = internship;
	}
	
	public void talk(){
		super.talk();
		System.out.println("...and I am a senior o-o");
		System.out.println("I intern as a "+internship);
				
	}
	
	
}
