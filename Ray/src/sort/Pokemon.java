package sort;

public class Pokemon {
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;

	public Pokemon(String name, int level) {
		this.name = name; 
		this.level = level;
		this.hp = 100;
		this.poisoned = false;
	}
	public void iChooseYou(){
		System.out.println(this.name);
		System.out.println(this.name);
	}
	public int getHP(){
		return this.hp;
	}
	public String getName(){
		return this.name;
	}
	public void setHP(int newHP){
		this.hp = newHP;
	}
	public void setPoisoned(boolean b){
		this.poisoned = b;
	}
	public void lapse(){
		if(this.poisoned)
			this.hp--;
		if(this.hp < 15)
			this.hp = 0;
	}
	public void attack(Pokemon target, Attack attack){
		 if(Math.random() < .9){
			 attack.attack(target);
			 System.out.println("The attack hit.");
		 }
		 else{
			 System.out.println("The attack missed.");
		 }
	}

}
