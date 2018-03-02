package hangmangame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	static Scanner sc = new Scanner(System.in);
	static int DIFFICULTY;
	static String word;
	static int lifes;
	static String hiddenWord;
	static String underscore;
	static String newunderscore;

	public static ArrayList<String> ORDLISTA = new ArrayList<String>();

	public static void run() throws FileNotFoundException {

		lifes = 7;
		printWelcomeMessage();
		promptDifficulty();
		chooseWord();
		hidden();
		while (lifes >= 1 && underscore.contains("_")) {
			String gissa = sc.next();
			gissa = gissa.toUpperCase();
			guessaLetter(gissa);
		}

	}

	// METODER
	public static void printWelcomeMessage() {

		System.out.println("Dags för hänga gubbe förhelvete!");

	}

	public static void promptDifficulty() {

		System.out.println("Välj svårhetsgrad, 1(lätt) eller 2(svår).");

		int svar = sc.nextInt();

		if (svar <= 1) {

			DIFFICULTY = 1;

		} else if (svar >= 2) {

			DIFFICULTY = 2;

		}

		System.out.println("Du valde svårighetsgrad " + DIFFICULTY);

	}

	private static void setup(File ord) throws FileNotFoundException {

		Scanner fileReader = new Scanner(ord);

		while (fileReader.hasNextLine()) {

			ORDLISTA.add(fileReader.nextLine());

		}
		word = ORDLISTA.get((int) (Math.random() * ORDLISTA.size()));
		fileReader.close();

		underscore = new String(new char[word.length()]).replace("\0", "_ ");
	}

	public static void chooseWord() throws FileNotFoundException {

		if (DIFFICULTY == 1) {

			setup(new File("ord1"));

		} else if (DIFFICULTY == 2) {

			setup(new File("ord2"));

		}

		word = word.toUpperCase();

	}

	static void hidden() {

		hiddenWord = "";

		for (int i = 0; i < word.length(); i++) {

			hiddenWord += "_ ";

		}
		System.out.println(hiddenWord);
	}

	public static void guessaLetter(String gissa) throws FileNotFoundException {

		newunderscore = "";

		for (int i = 0; i < word.length() * 2; i += 2) {

			if (word.charAt(i / 2) == gissa.charAt(0)) {
				newunderscore += gissa.charAt(0);
			} else if (underscore.charAt(i) != '_') {
				newunderscore += word.charAt(i / 2);
			} else {
				newunderscore += "_";
			}
			newunderscore += " ";
		}

		System.out.println(newunderscore);

		if (underscore.equals(newunderscore)) {
			lifes--;
			PaintMan.print(lifes);
		} else {
			underscore = newunderscore;
		}
		if (!underscore.contains("_")) {
			System.out.println("Du vann! Ordet var " + word + "!");
			System.out.println("Vill du spela igen!(ja/nej)");
			String villduspelaigen = sc.next();
			villduspelaigen = villduspelaigen.toUpperCase();
			if (villduspelaigen.equals("JA")) {

				run();

			} else if (villduspelaigen.equals("NEJ")) {

				System.exit(0);

			} 

		}

	}
}
