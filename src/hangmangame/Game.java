package hangmangame;

import java.util.Scanner;


public class Game {

private static int DIFFICULTY;
	
private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Dags för hänga gubbe förhelvete!");
		
		System.out.println("Välj svårhetsgrad(1 eller 2)");
		 
		int svar = input.nextInt();
		
		if(svar <= 1){
			
			DIFFICULTY = 1;
			
		}else if (svar >= 2) {
			
			DIFFICULTY = 2;
			
		}
		
		System.out.println("Du valde svårighetsgrad " + DIFFICULTY );
		
		
	}
}
