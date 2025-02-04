
//Provides Fighter template

public abstract class Fighter {
	//Instantiate variables for method use
	String name;
	int health;
	int max_damage;
	
	//Add functions to allow customised variables for child classes
	public int ReturnHealth() {
		return health;
	}
	
	public int ReturnMaxDamage() {
		return max_damage;
	}
	
	public String ReturnName() {
		return name;
	}
	
	public void SetHealth(int new_health) {
		health = new_health;
	}
}
