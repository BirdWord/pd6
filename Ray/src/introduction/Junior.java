package introduction;

public class Junior extends Student{
	private boolean status;
	public Junior(String name, boolean status) {
		super(name);
		this.status = status;
	}
	public void conversate(){
		super.talk();
		if(this.status)
			System.out.println("My name is "+getName()+"and I am bored.");
		else
			System.out.println("My name is "+getName()+"and I have a false status.");
	}

}
