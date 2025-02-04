import java.util.Scanner;
import java.util.Arrays;

public class FightHost {
	private static int GetInput() {
		int result = -1;
		Integer[] valid_results = { 0, 1 };
		
		Scanner input = new Scanner(System.in);
		
		while (!Arrays.asList(valid_results).contains(result)){
			System.out.print("Enter a valid option number: ");
            result = input.nextInt();
		}
		
		return result;
	}
	
	private static void PrintResult(Fighter player, Fighter enemy) {
		System.out.println("Your Health: " + player.getHealth());
		System.out.println(enemy.getName() + " Health: " + enemy.getHealth());
		System.out.println("Options");
		System.out.println("1: Attack");
		System.out.println("2: Defend");
	}
	
	public static void processHit(Fighter attacker, Fighter defender) {
		int damage = attacker.doDamage();
		System.out.println(attacker.getName() + " hits " + defender.getName() + " for " + damage + " health!");
		defender.takeHit(damage);
		return;
	}
	
	//Function usable from Main to run a fight sequence
	public static void RunFight(Fighter player, Fighter enemy) {
		
		//fight loop
		while (enemy.getHealth() > 0) {
			PrintResult(player, enemy);
			
			int player_action= GetInput();
			if (player_action == 1) {
				processHit(player, enemy);
			}
			
			processHit(enemy, player);
			if (player.getHealth() == 0) {
				System.out.println("GAME OVER!");
				return;
			}
		}
		
		System.out.println(enemy.getName() + " falls. You win the fight!");
			
	}
}
