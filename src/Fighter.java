import java.util.Random;
//Provides Fighter template

public abstract class Fighter {
	String name;
	int health;
	int max_damage;
	
	public int getHealth() {
		return health;
	}
	
	public String getName() {
		return name;
	}
	
	//Sorts health and damage in fighter object
	public int doDamage() {
		Random rand = new Random(); 
		
		return rand.nextInt(max_damage);
	}
	
	public int takeHit(int damage) {
		
		health -= damage;
		if (health > 0) {
			return health;
		}
		else {
			return 0;
		}
	}
}
