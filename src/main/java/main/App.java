package main;

import java.util.Scanner;



/**
* Hello world!
*/
public class App {
	static String ask(Scanner in, String promt) {
		System.out.print(promt);

		return in.next();
	}

	static void NaytaAutonTila(Car auto) {
		System.out.println(String.format("Auto: %s %s, Nopeus: %d km/h", auto.brand, auto.model, auto.get_speed()));
	}

	static void MuokkaaAutonMerkkiaJaMallia(Scanner in, Car auto) {
		auto.brand = ask(in, "Anna uusi auton merkki: ");
		auto.model = ask(in, "Anna uusi auton malli: ");
	}

	static void KiihdytaAutoa(Scanner in, Car auto) {
		int delta = Integer.parseInt(ask(in, "Kuinka monta km/h haluat kiihdyttää? "));

		try {
			auto.accelerate(delta);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	static void HidastaAutoa(Scanner in, Car auto) {
		int delta = Integer.parseInt(ask(in, "Kuinka monta km/h haluat hidastaa? "));

		try {
			auto.deaccel(delta);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	static int get_selection(Scanner in) {
		System.out.println("1) Näytä auton tila");
		System.out.println("2) Muokkaa auton merkkiä ja mallia");
		System.out.println("3) Kiihdytä autoa");
		System.out.println("4) Hidasta autoa");

		System.out.println("0) Lopeta ohjelma");

		return in.nextInt();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int selection = -1;

		Car auto = new Car();

		auto.brand = ask(in, "Anna auton merkki: ");
		auto.model = ask(in, "Anna auton malli: ");

		while (selection != 0) {
			selection = App.get_selection(in);

			if (selection == 0) {
				// pass

			} else if (selection == 1) {
				NaytaAutonTila(auto);

			}else if (selection == 2) {
				MuokkaaAutonMerkkiaJaMallia(in, auto);

			}else if (selection == 3) {
				KiihdytaAutoa(in, auto);

			}else if (selection == 4) {
				HidastaAutoa(in, auto);

			} else {
				System.out.println("Syöte oli väärä");

			}
		}

		System.out.println("Kiitos ohjelman käytöstä.");

		in.close();
	}
}
