
public abstract class Fighter {
	int health = 1;
	int max_damage;
	
	public int ReturnHealth() {
		return health;
	}
	public int ReturnMaxDamage() {
		return max_damage;
	}
	public void SetHealth(int new_health) {
		health = new_health;
	}
}
