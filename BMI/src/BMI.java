
import java.util.Scanner;

public class BMI {


		public static void main(String[] args) {
			// Deklaration der Variablen

			// Ganze Zahl, die jeweils an der Reihe ist

			// Festlegen der Startwerte der Variablen
			

			Scanner sc = new Scanner(System.in);

			System.out.println("Bitte geben Sie ihr Körpergewicht in KG an: ");
			double Gewicht = sc.nextDouble();
			System.out.print("Bitte geben Sie ihre Körpergröße in m an: ");
			double Groesse = sc.nextDouble();
			System.out.print("Bitte geben Sie ihr Alter an: ");
			double Alter = sc.nextDouble();
			
			double BMI = Gewicht/(Groesse*Groesse);
			
			System.out.println("Der BMI Beträgt " + BMI);
			System.out.println("__________________________");

		if (Alter >= 19 && Alter <= 24) {
			if (BMI >= 19 && BMI <= 24) {
				System.out.println("Ihr BMI liegt im optimalen Bereich");
			} else if (BMI < 19) {
				System.out.println("Ihr BMI liegt unterhalb des optimalen Berecihs");
			} else if (BMI > 24) {
				System.out.println("Ihr BMI liegt oberhalb des optimalen Berecihs");
			}
		}

		if (Alter >= 25 && Alter <= 34) {
			if (BMI >= 20 && BMI <= 25) {
				System.out.println("Ihr BMI liegt im optimalen Bereich");
			} else if (BMI < 20) {
				System.out.println("Ihr BMI liegt unterhalb des optimalen Berecihs");
			} else if (BMI > 25) {
				System.out.println("Ihr BMI liegt oberhalb des optimalen Berecihs");
			}
		}

		else if (Alter >= 35 && Alter <= 44) {
			if (BMI >= 21 && BMI <= 26) {
				System.out.println("Ihr BMI liegt im optimalen Bereich");
			} else if (BMI < 21) {
				System.out.println("Ihr BMI liegt unterhalb des optimalen Berecihs");
			} else if (BMI > 26) {
				System.out.println("Ihr BMI liegt oberhalb des optimalen Berecihs");
			}
		}

		else if (Alter >= 45 && Alter <= 54) {
			if (BMI >= 22 && BMI <= 27) {
				System.out.println("Ihr BMI liegt im optimalen Bereich");
			} else if (BMI < 22) {
				System.out.println("Ihr BMI liegt unterhalb des optimalen Berecihs");
			} else if (BMI > 27) {
				System.out.println("Ihr BMI liegt oberhalb des optimalen Berecihs");
			}
		}

		else if (Alter >= 55 && Alter <= 64) {
			if (BMI >= 23 && BMI <= 28) {
				System.out.println("Ihr BMI liegt im optimalen Bereich");
			} else if (BMI < 23) {
				System.out.println("Ihr BMI liegt unterhalb des optimalen Berecihs");
			} else if (BMI > 28) {
				System.out.println("Ihr BMI liegt oberhalb des optimalen Berecihs");
			}
		}

		else if (Alter >= 64) {
			if (BMI >= 24 && BMI <= 29) {
				System.out.println("Ihr BMI liegt im optimalen Bereich");
			} else if (BMI < 24) {
				System.out.println("Ihr BMI liegt unterhalb des optimalen Berecihs");
			} else if (BMI > 29) {
				System.out.println("Ihr BMI liegt oberhalb des optimalen Berecihs");
			}
		}
			
		}
	}

