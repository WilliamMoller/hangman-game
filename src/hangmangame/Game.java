package hangmangame;

import java.util.Scanner;


public class Game {

private static int DIFFICULTY;
	
private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Dags f�r h�nga gubbe f�rhelvete!");
		
		System.out.println("V�lj sv�rhetsgrad(1 eller 2)");
		 
		int svar = input.nextInt();
		
		if(svar <= 1){
			
			DIFFICULTY = 1;
			
		}else if (svar >= 2) {
			
			DIFFICULTY = 2;
			
		}
		
		System.out.println("Du valde sv�righetsgrad " + DIFFICULTY );
		
		
	}
}
