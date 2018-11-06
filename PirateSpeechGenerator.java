import java.util.Scanner;

public class PirateSpeechGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean x = true;
		while (x) {
			System.out.println("Bitte geben Sie einen Text ein: ");

			String eingabe = sc.nextLine();
			if (eingabe.equals("Ende")) {
				sc.close();
				x = false;
			} else {
			

				eingabe = eingabe.replace("a", "arr");
				eingabe = eingabe.replace("e", "err");
				eingabe = eingabe.replace("o", "orr");
				eingabe = eingabe.replace("u", "urr");
				eingabe = eingabe.replace("i", "irr");
				System.out.println(eingabe);
				eingabe = eingabe.replace("arrurr", "aauurghs");
				eingabe = eingabe.replace("errurr", "eeuurghs");	
			}

			System.out.println(eingabe);
		}

	}

}
