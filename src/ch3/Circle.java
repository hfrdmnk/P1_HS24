package ch3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		final double PI = Math.PI;
		DecimalFormat formatter = new DecimalFormat("0.0#");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Radius eingeben: ");
		double radius = scan.nextDouble();
		
		double area = radius * radius * PI;
		double circumference = 2 * radius * PI;
		
		System.out.println("Kreisfläche: " + formatter.format(area));
		System.out.println("Kreisumfang: " + formatter.format(circumference));

	}

}
