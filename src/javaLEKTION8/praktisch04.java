package javaLEKTION8;

import java.util.Scanner;

public class praktisch04 {

	public static void main(String[] args) {
		// Wei viel Stunden Schlafen Sie in einem Tage?

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Wei viel Stunden Schlafen Sie in einem Tage?");
		
		double Stunde = scan.nextDouble();
		
		System.out.println("in einem Tage   " +(Stunde));
		System.out.println("der Tag, an dem Sie in einer Woche schlafen  "+(Stunde*7/24));
		System.out.println("der Tag, an dem Sie in einem Monate schlafen "+(Stunde*30/24));
		System.out.println("der Tag, an dem Sie in einem Jahr schlafen   "+(Stunde*365/24));
		System.out.println("der Tag, an dem Sie Durchschnittliche Lebensdauer von 60 Jahren schlafen"+(Stunde*365*60/24/365));
		
		
		
		

		
		
		scan.close();
		
		
		
	}

}
