
public class LittleWitch {

	public static void main(String[] args) {

		String morgen = null;
		int clock = 6;

		for (int i = 6; i <= 12; i++) {

			clock = i;

			if (clock <= 10) {
				morgen = "Morgens fr�h um ";
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
				System.out.println("schabt sie gelbe R�ben.");
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
				System.out.println("hackt sie Holz und Sp�n. ");
				break;
			}
			case 12: {
				System.out.println("Fr�schebein und Krebs und Fisch. ");
				System.out.println("Hurtig Kinder kommt zu Tisch! ");
				break;
			}

			}
		}
	}
}
