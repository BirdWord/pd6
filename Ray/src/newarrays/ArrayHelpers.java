package newarrays;

public class ArrayHelpers {
	private int number;
	public ArrayHelpers(int number){
		this.number = number;
	}
	public void SampleElement(int value){
		number = value;
	}
	public int getNumber(){
		return number;
	}
	public void increase(){
		number++;
	}
}
