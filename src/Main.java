
public class Main {
	
	//initiate game
	public static void main(String[] args) {
		
		//test fight method
		Fighter player = new Human();
		Fighter enemy = new Alien();
		
		FightHost fight = new FightHost();
		
		fight.CreateFight(player, enemy);
	}

}
