package ch2;

public class AdditionConcatenation {

	/**
	 * Konkateniert bzw. addiert zwei Zahlen
	 */

	public static void main(String[] args) {
		System.out.println("Wir konkatenieren 7 und 3: " + 7 + 3);
		System.out.println(7 + 3 + ": Auswertung erfolgt von links nach rechts");
		System.out.println("Erzwingen einer anderen Reihenfolge: " + (7 + 3));
	}
}
