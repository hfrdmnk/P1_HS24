package ch2;

public class BookStatistics {

	/**
	 * Demonstriert das Referenzieren von Variablen
	 */
	public static void main(String[] args) {
		int pages;
		pages = 256;
		int figures = 46, tables;
		tables = 17;
		
		System.out.println("Anzahl Seiten: " + pages);
		System.out.println("Anzahl Abbildungen: " + figures
				+ "; Anzahl Tabellen: " + tables);
	}
}
