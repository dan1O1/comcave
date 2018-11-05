
public class LittleWitch {

	public static void main(String[] args) {

		String morgen = null;
		int clock = 6;

		for (int i = 6; i <= 12; i++) {

			clock = i;

			if (clock <= 10) {
				morgen = "Morgens früh um ";
			} else if (clock == 11) {
				morgen = "Feuert an um ";
			} else if (clock == 12) {
				morgen = "kocht dann bis um ";
			}

			System.out.println(morgen + clock);

			switch (clock) {

			case 6: {
				System.out.println("kommt die kleine Hex.");
				break;
			}
			case 7: {
				System.out.println("schabt sie gelbe Rüben.");
				break;
			}
			case 8: {
				System.out.println("wird Kaffee gemacht. ");
				break;
			}
			case 9: {
				System.out.println("geht sie in die Scheun. ");
				break;
			}
			case 10: {
				System.out.println("hackt sie Holz und Spän. ");
				break;
			}
			case 12: {
				System.out.println("Fröschebein und Krebs und Fisch. ");
				System.out.println("Hurtig Kinder kommt zu Tisch! ");
				break;
			}

			}
		}
	}
}
