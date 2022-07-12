package javaLEKTION9;

import java.util.Scanner;

public class pratich01 {

	public static void main(String[] args) {
		/*Schreiben Sie ein Programm, das anzeigt,
		 * ob die ID-Nummer dem Format entspricht
		 * Regel 1:Die ID-Nummer darf nicht mit 0 beginnen
		 * Regel 2:Die ID-Nummer muss 11-stellig sein
		 * Regel 3: ID-Nummer darf nicht mit 0 enden
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Schreiben Sie Bitte einen ID number");
		
		long IdNummer= scan.nextLong();
		
		if(IdNummer %2==0 && IdNummer /10000000000l !=0 && IdNummer/100000000000l==0/*hier mathe:)*/) {
			
			System.out.println("IdNummer ist richtig");
		}else {
			System.out.println("IdNummer ist nicht gultig");
		}
		
		
		scan.close();
		
		
		
	}

}
