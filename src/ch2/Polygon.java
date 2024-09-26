package ch2;

public class Polygon {

	/**
	 * Demonstriert Zuweisungen zu einer Variablen
	 */
	public static void main(String[] args) {
		
		int sides = 3;
		System.out.println("Anzahl Seiten eines Trigons: " + sides);
		
		sides = 12;
		System.out.println("Anzahl Seiten eines Dodekagons: " + sides);
		
		sides = 19;
		System.out.println("Anzahl Seiten eines Nonadekagons: " + sides);
		
		// lesen (ohne Zuweisung) ändert die Variable nicht!
		System.out.println("Anzahl Seiten eines Ikosagons: " + (sides + 1));
		System.out.println("In der Variablen sides ist gespeichert: " + sides);
	}
}
