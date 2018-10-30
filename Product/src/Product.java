import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		// Deklaration der Variablen
		// Ganze Zahl, bis zu der multipliziert wird

		// Summe der bisher multiplizierten ganzen Zahlen
		int product;
		// Ganze Zahl, die jeweils an der Reihe ist
		int i;
		// Festlegen der Startwerte der Variablen

		product = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte eine Zahl eingeben:");
		int boundary = sc.nextInt();
		// Berechnen des Produktes product ueber alle Zahlen von 1 bis boundary

		for (i = 1; i <= boundary; i++) {
			product = product * i;
		}

		// Ausgeben der Summe, gemeinsam mit erläuterndem Text
		System.out.print("Das Produkt der Zahlen von 1 bis ");
		System.out.print(boundary);
		System.out.print(" ist ");
		System.out.println(product);
	}
}