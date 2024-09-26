package ch2;

import java.util.Scanner;

public class Grading {

	/**
	 * Berechnet einen Prozentwert und eine Schulnote
	 * auf Basis der erreichten Punkte
	 */
	public static void main(String[] args) {
		final int MAX_POINTS = 20;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Erreichte Punkte eingeben: ");
		int points = scan.nextInt();
		
		double percentage = (double) points / MAX_POINTS * 100;
		double grade = (double) points / MAX_POINTS * 5 + 1;
		
		System.out.println("Sie haben " + points + " von " + MAX_POINTS + " Punkten erreicht");
		System.out.println("Dies entspricht " + percentage + " Prozent");
		System.out.println("Schulnote: " + grade);
	}
}
