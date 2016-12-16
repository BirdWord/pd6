package threading;

public class Sleeper implements Runnable{
	private int number;
	private int sleepTime;
	public Sleeper(int num) {
		number = num;
		this.sleepTime = (int)(10*Math.random());
	}

	public static void main(String[] args) {
		Thread one = new Thread(new Sleeper(1));
		Thread two = new Thread(new Sleeper(2));
		Thread three = new Thread(new Sleeper(3));
		Thread four = new Thread(new Sleeper(4));
		one.start();
		two.start();
		three.start();
		four.start();
	}

	@Override
	public void run() {
		System.out.println("Thread #"+number+" will sleep for "+sleepTime+" ms.");
		try {
			Thread.sleep(sleepTime);
			System.out.println("Thread #"+number+" woke up.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
