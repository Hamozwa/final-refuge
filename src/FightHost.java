import java.util.Scanner;
import java.util.Arrays;

public class FightHost {
	private int GetInput() {
		int result = -1;
		Integer[] valid_results = { 0 };
		
		Scanner input = new Scanner(System.in);
		
		while (!Arrays.asList(valid_results).contains(result)){
			System.out.print("Enter a valid option number: ");
            result = input.nextInt();
		}
		
		input.close();
		return result;
	}
	
	private void PrintResult(Fighter player, Fighter enemy) {
		System.out.println("Your Health: " + player.ReturnHealth());
		System.out.println(enemy.ReturnName() + " Health: " + enemy.ReturnHealth());
		System.out.println("Options");
		System.out.println("0: Attack");
	}
	
	protected void CreateFight(Fighter player, Fighter enemy) {
		
		//Create input system
		
		while (enemy.ReturnHealth() > 0) {
			//player's turn
			PrintResult(player, enemy);
			
		}
			
	}
}
