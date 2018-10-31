
import java.util.Scanner;

public class Sqare2 {


		public static void main(String[] args) {
			// Deklaration der Variablen
			// Ganze Zahl, bis zu der multipliziert wird
			int square;
			// Ganze Zahl, die jeweils an der Reihe ist
			int i;
			// Festlegen der Startwerte der Variablen
			square = 0;

			Scanner sc = new Scanner(System.in);

			System.out.println("Bitte eine Zahl eingeben:");
			int number = sc.nextInt();
			// Berechnen des Produktes product ueber alle Zahlen von 1 bis boundary

			for (i = 1; i <= number+number; i++) {
				
				
				 if (i%2 != 0)		
				 square = square + i;
			}

			// Ausgeben der Summe, gemeinsam mit erläuterndem Text
			System.out.print("Das Quadrat von " + number + " durch " + number+" maliges Addieren von " + number);
			System.out.print(" ist ");
			System.out.println(square);
		}
	}

