package ch1;

public class Quotes {
	
	public static void printQuoteOfBill() {
		System.out.println("Bill Gates:");
		System.out.println("Deine unzufriedenen Kunden sind deine grösste Lernquelle");
	}
	
	public static void printQuoteOfSteve() {
		System.out.println("Steve Jobs:");
		System.out.println("Es ist besser ein Pirat zu sein, als der Marine beizutreten.");
	}
	
	public static void main(String[] args) {
		printQuoteOfSteve();
		printQuoteOfBill();
		printQuoteOfSteve();
	}

}
