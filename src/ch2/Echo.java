package ch2;

import java.util.Scanner;

public class Echo {

	/**
	 * Gibt ein Echo der Benutzereingabe aus
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ihr Text: ");
		String input = scan.nextLine();
		System.out.println("Mein Echo:\n\"" + input + "\"");
	}
}
