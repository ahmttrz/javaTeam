package javaLEKTION8;

import java.util.Scanner;

public class scanner01 {

	public static void main(String[] args) {
		// Daten vom Benutzer abrufen

		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte schreiben Sie Ihren Namen");
		
		String name = scan.next();
		System.out.println("NAME : "+ name);
		scan.close();
	}

}
