package javaLEKTION9;

import java.util.Scanner;

public class praktisch02 {

	public static void main(String[] args) {
		/*Schreiben 	Sie bitte eine E-Mail-AdreSse
		 * Regel 1: E-Mail-Adresse muss ein @-Zeichen haben
		 * Regel 2:"g.mail" muss nach dem @-Zeichen kommen.
*/
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Schreib eine E-Mail-Adresse");
		
		String eMailAdresse= scan.nextLine();
		
		if(eMailAdresse.contains("@gmil.com") ){
			System.out.println("Email Adresse ist gültig");
		}else {
			System.out.println("Email Adresse ist nicht gültig ");
		}
				
		
		
		
	}

}
