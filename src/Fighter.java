
public abstract class Fighter {
	String name;
	int health;
	int max_damage;
	
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
