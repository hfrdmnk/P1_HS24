package ch2;

import java.util.Scanner;

public class AgeComment {

	/**
	 * Gibt einen Kommentar auf Basis des Alters aus
	 */
	public static void main(String[] args) {
		final int MINOR = 18;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Ihr Alter: ");
		int age = scan.nextInt();

		if (age < MINOR)
			System.out.println("Jugend ist kein Fehler");
		else
			System.out.println("Alter ist kein Verdienst");

		System.out.println("Alter ist eine Zahl.");
	}
}
