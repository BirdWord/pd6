package introduction;

public class Student {
	private String name;
	public Student(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void talk(){
		System.out.println("Hi, my name is "+name);
	}
}
