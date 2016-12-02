package pokepackage;

public class MainBattle {

	public static void main(String[] args) {
		 Pokemon raticate = new Pokemon("Raticate",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 Attack superFang = new Attack(){
			 public void attack(Pokemon target) {
				 int hp = target.getHP();
				 target.setHP(hp/2);
			 }
		 };
		 Attack poisonPowder = new Attack() {
			 public void attack(Pokemon target) {
				 target.setPoisoned(true);
			 }
		 };
		 raticate.iChooseYou();
		 bulbasaur.iChooseYou();
		 System.out.println("Raticate is preparing to attack with Super Fang.");
		 raticate.attack(bulbasaur, superFang);
		 System.out.println("Bulbasaur is preparing to attack with Poisonpowder.");
		 bulbasaur.attack(raticate, poisonPowder);
		 raticate.lapse();
		 bulbasaur.lapse();
		 printScore(raticate, bulbasaur);
	}
	public static void printScore(Pokemon poke1, Pokemon poke2){
		System.out.println(poke1.getName()+": "+poke1.getHP());
		System.out.println(poke2.getName()+": "+poke2.getHP());
	}

}
