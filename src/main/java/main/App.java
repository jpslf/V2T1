package main;

import java.util.Scanner;

/**
* Hello world!
*/
public class App {
	static void NaytaAutonTila() {
		System.out.println("Näytä auton tila");
	}

	static void MuokkaaAutonMerkkiaJaMallia() {
		System.out.println("Muokkaa auton merkkiä ja mallia");
	}

	static void KiihdytaAutoa() {
		System.out.println("Kiihdytä autoa");
	}

	static void HidastaAutoa() {
		System.out.println("Hidasta autoa");
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

		while (selection != 0) {
			selection = App.get_selection(in);

			if (selection == 0) {
				// pass

			} else if (selection == 1) {
				NaytaAutonTila();

			}else if (selection == 2) {
				MuokkaaAutonMerkkiaJaMallia();

			}else if (selection == 3) {
				KiihdytaAutoa();

			}else if (selection == 4) {
				HidastaAutoa();

			} else {
				System.out.println("Tuntematon valinta, yritä uudestaan.");

			}
		}

		System.out.println("Kiitos ohjelman käytöstä.");
	}
}
