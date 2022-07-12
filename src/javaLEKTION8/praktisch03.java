package javaLEKTION8;

import java.util.Scanner;

public class praktisch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Schreiben Sie bitte die erste Zahl");
		
		Scanner scan= new Scanner(System.in);
		
		int zahl1 =scan.nextInt();
		
		System.out.println("Schreiben Sie bitte die zweite Zahl");

		int zahl2 =scan.nextInt();
		
		
		System.out.println("gesamt=  " +(zahl1+zahl2));
		
		scan.close();
	}

}
