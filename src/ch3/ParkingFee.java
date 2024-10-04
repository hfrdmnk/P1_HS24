package ch3;

import java.util.Scanner;

public class ParkingFee {
	
	public static void main(String[] args) {
		
		final double FEE_PER_HOUR = 2.5; // für die ersten X Stunden
		final int MAX_HOURS = 5;
		final double FACTOR = 1.5; // Faktor ab X Stunden
		
		Scanner scan = new Scanner(System.in);
		
		double fee = 0.0;
		System.out.print("Parkzeit in ganzen Stunden eingeben: ");
		int parkingTime = scan.nextInt();
		
		if (parkingTime <= MAX_HOURS)
			fee = parkingTime * FEE_PER_HOUR;
		else {
			int additionalHours = parkingTime - MAX_HOURS;
			fee = MAX_HOURS * FEE_PER_HOUR;
			fee += additionalHours * FEE_PER_HOUR * FACTOR;
		}
		System.out.println("Zu bezahlen: " + fee + " CHF");

	}

}
