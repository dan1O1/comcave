import java.util.Scanner;

public class PirateSpeechGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Bitte geben Sie einen Text ein: ");

			String eingabe = sc.nextLine();
			if (eingabe.equals("Ende")) {
				sc.close();
			} else {

				eingabe = eingabe.replace('a', 'r');
				eingabe = eingabe.replace('e', 'r');
				eingabe = eingabe.replace('i', 'r');
				eingabe = eingabe.replace('o', 'r');
				eingabe = eingabe.replace('u', 'r');
			}

			System.out.println(eingabe);
		}

	}

}
