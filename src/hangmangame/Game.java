package hangmangame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

static Scanner sc = new Scanner(System.in);
static int DIFFICULTY;
static String word;
	
public static ArrayList<String> ORDLISTA = new ArrayList<String>();
	
	public static void main(String[] args) throws FileNotFoundException {

		printWelcomeMessage();
		promptDifficulty();
		chooseWord();
		
		System.out.println(word);
		
		
	}
	
	public static void printWelcomeMessage(){
		
		System.out.println("Dags f�r h�nga gubbe f�rhelvete!");
		
	}
	
	public static void promptDifficulty(){
		
		System.out.println("V�lj sv�rhetsgrad(1(l�tt) eller 2(sv�r))");
		 
		int svar = sc.nextInt();
		
		if(svar <= 1){
			
			DIFFICULTY = 1;
			
		}else if (svar >= 2) {
			
			DIFFICULTY = 2;
			
		}
		
		System.out.println("Du valde sv�righetsgrad " + DIFFICULTY );
		
	}
	
	private static void setup(File ord) throws FileNotFoundException {
		
		Scanner fileReader = new Scanner(ord);
		
		while (fileReader.hasNextLine()) {
			
			ORDLISTA.add(fileReader.nextLine());
			
		}
		word = ORDLISTA.get((int)(Math.random()*ORDLISTA.size()));
		fileReader.close();
		
	}
	
	public static void chooseWord() throws FileNotFoundException{
		
		if(DIFFICULTY==1){
			
			setup(new File("ord1"));
			
		}else if(DIFFICULTY==2){
			
			setup(new File("ord2"));
			
		}
		
		
	}
}
