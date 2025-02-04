import java.util.Scanner;
import java.util.Arrays;

public class FightHost {
	private int GetInput() {
		int result = -1;
		Integer[] valid_results = { 0, 1 };
		
		Scanner input = new Scanner(System.in);
		
		while (!Arrays.asList(valid_results).contains(result)){
			System.out.print("Enter a valid option number: ");
            result = input.nextInt();
		}
		
		input.close();
		return result;
	}
	
	public void PrintResult(Fighter player, Fighter enemy) {
		System.out.println("Your Health: " + player.ReturnHealth());
		System.out.println(enemy.ReturnName() + " Health: " + enemy.ReturnHealth());
		System.out.println("Options");
		System.out.println("0: Attack");
	}
	
	//Function usable from Main to run a fight sequence
	public void RunFight(Fighter player, Fighter enemy) {
		
		//fight loop
		int player_action;
		while (enemy.ReturnHealth() > 0) {
			//player's turn
			PrintResult(player, enemy);
			player_action = GetInput();
			
		}
			
	}
}
