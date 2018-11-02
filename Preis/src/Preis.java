
import java.util.Scanner;

public class Preis {


		public static void main(String[] args) {
			// Deklaration der Variablen

			// Ganze Zahl, die jeweils an der Reihe ist

			// Festlegen der Startwerte der Variablen
			

			Scanner sc = new Scanner(System.in);

			System.out.println("Bitte geben Sie die Stückzahl ein: ");
			double sz = sc.nextDouble();
			System.out.print("Bitte geben Sie den Einzelpreis an: ");
			double ep = sc.nextDouble();
			double Gesamtpreis;


		if (sz >10 && sz < 50) {
			 Gesamtpreis = (ep*sz)*0.95;
				System.out.println("Ihr Gesamtpreis abzüglich 5% Rabatt beträgt" + Gesamtpreis);
			} else if (sz >50) {
				 Gesamtpreis = (ep*sz)*0.90;
				System.out.println("Ihr Gesamtpreis abzüglich 10% Rabatt beträgt" + Gesamtpreis);
				} else if (sz < 10) {
					 Gesamtpreis = (ep*sz);
				System.out.println("Ihr Gesamtpreis beträgt" + Gesamtpreis);}
			}
		
		}

