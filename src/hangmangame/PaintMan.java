package hangmangame;

import java.io.FileNotFoundException;

public class PaintMan {

	public static void print(int index) {

		if (index == 6) {

			utskrift1();

		} else if (index == 5) {

			utskrift2();

		} else if (index == 4) {

			utskrift3();

		} else if (index == 3) {

			utskrift4();

		} else if (index == 2) {

			utskrift5();

		} else if (index == 1) {

			utskrift6();

		} else if (index == 0) {

			utskrift7();

		}

	}

	public static void utskrift1() {

		System.out.println("Fel gissning, försök igen(du har " + Game.lifes + " liv kvar!)");
		System.out.println("    __________	");
		System.out.println("    | 		  	");
		System.out.println("    |		  	");
		System.out.println("    |			");
		System.out.println("   _|_			");
		System.out.println("  // \\\\		");
	}

	public static void utskrift2() {

		System.out.println("Fel gissning, försök igen(du har " + Game.lifes + " liv kvar!)");
		System.out.println("    __________	");
		System.out.println("    | /		  	");
		System.out.println("    |/		  	");
		System.out.println("    |			");
		System.out.println("   _|_			");
		System.out.println("  // \\\\		");
	}

	public static void utskrift3() {
		System.out.println("Fel gissning, försök igen(du har " + Game.lifes + " liv kvar!)");
		System.out.println("    __________	");
		System.out.println("    | /	      |	");
		System.out.println("    |/		  	");
		System.out.println("    |			");
		System.out.println("   _|_			");
		System.out.println("  // \\\\		");
	}

	public static void utskrift4() {
		System.out.println("Fel gissning, försök igen(du har " + Game.lifes + " liv kvar!)");
		System.out.println("    __________	");
		System.out.println("    | /	      |	");
		System.out.println("    |/	      O	");
		System.out.println("    |		 	");
		System.out.println("   _|_			");
		System.out.println("  // \\\\		");
	}

	public static void utskrift5() {
		System.out.println("Fel gissning, försök igen(du har " + Game.lifes + " liv kvar!)");
		System.out.println("    __________	");
		System.out.println("    | /	      |	");
		System.out.println("    |/	     _O_");
		System.out.println("    |	      | ");
		System.out.println("   _|_			");
		System.out.println("  // \\\\		");
	}

	public static void utskrift6() {
		System.out.println("Fel gissning, försök igen(du har " + Game.lifes + " liv kvar!)");
		System.out.println("    __________	");
		System.out.println("    | /	      |	");
		System.out.println("    |/	     _O_");
		System.out.println("    |	      | ");
		System.out.println("   _|_	     ( )");
		System.out.println("  // \\\\		");
	}

	public static void utskrift7() {
		System.out.println("Du förlora! Ordet var " + Game.word + "!");
		System.out.println("    __________	");
		System.out.println("    | /	      |	");
		System.out.println("    |/	     _X_");
		System.out.println("    |	      | ");
		System.out.println("   _|_       ( )");
		System.out.println("  // \\\\		");
		System.out.println("Vill du spela igen!(ja/nej)");

		String villduspelaigen = Game.sc.next();
		villduspelaigen = villduspelaigen.toUpperCase();
		if (villduspelaigen.equals("JA")) {

			try {
				Game.run();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (villduspelaigen.equals("NEJ")) {

			System.exit(0);
		}

	}
}
