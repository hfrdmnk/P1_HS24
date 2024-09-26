package ch2;

public class PrimFacts {

	/**
	 * Vom Umgang mit Zeichenketten
	 */
	public static void main(String[] args) {
		// Zeichenketten können konkateniert werden
		System.out.println("Es gibt unendlich viele Primzahlen. Ein System, "
				+ "welche Zahlen Primzahlen sind, ist nicht bekannt.");
		
		// Sonderzeichen werden mit Escape Sequenzen integriert
		System.out.println("\"Die Anzahl der Dummheiten übersteigt die der "
				+ "Primzahlen.\nGibt es nicht unendlich viele "
				+ "Primzahlen?\"\n\tGregor Brand");
		
		// Zeichenketten dürfen auch Ziffern enthalten
		System.out.println("Primzahlen sind natürliche Zahlen, die genau "
				+ "2 Teiler haben, nämlich 1 und sich selbst.");
		
		// Zahlen können zu Zeichenketten konkateniert werden
		// (automatische Konvertierung Zahl -> Zeichenkette)
		System.out.println("Daher zählt die " + 1 + " nicht zu den Primzahlen.");
	}
}
