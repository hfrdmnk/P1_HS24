package ch2;

import java.util.Scanner;

public class LimitCheck {

	/**
	 * Überprüft, ob die geleistete Arbeitszeit
	 * kleiner als die maximal erlaubte Zeit ist
	 */
	public static void main(String[] args) {
		// maximal erlaubte Arbeitszeit
		final int MAX_HOURS = 500;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Arbeitszeit in Stunden eingeben: ");
		int hours = scan.nextInt();
		
		if (hours > MAX_HOURS)
			System.out.println("Arbeit stoppen!");
		System.out.println("Arbeitszeit überprüft.");
		
	}
}
