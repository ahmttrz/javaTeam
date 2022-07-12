package javaLEKTION8;

import java.util.Scanner;

public class pratisch01 {

	public static void main(String[] args) {
		// Schreiben Sie ein Programm, 
		//um den Namen und das Alter des Benutzers zu erhalten
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Schreiben Sie BITTE Ihren Namen");
		
		String name = scan.next();
		
		System.out.println("Schreiben Sie BİTTE Ihren Alter");
		
		int alter = scan.nextInt();
		
		System.out.println("Ihren Alter  :"+name+ "\nIhren Alter  :"  + alter  );
		
		
		
		
		
		
		
		
		scan.close();
	}

}
