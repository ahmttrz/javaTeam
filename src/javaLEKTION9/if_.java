package javaLEKTION9;

import java.util.Random;
import java.util.Scanner;

public class if_ {

	public static void main(String[] args) {
		// if und Random (zufallig)
		//Schreiben Sie ein Programm, 
		//das den Bereich einer zufällig geschriebenen Zahl anzeigt.

		System.out.println("Wer wird springt ins Wasser?");
		
		Random zufallig = new Random();
		
		int Zahl =zufallig.nextInt(10);		
		
		if(Zahl==0) {
			System.out.println(" Ahmet :)");
		}
		
		if(Zahl==1) {
			System.out.println("Metin :)");
		}
		if(Zahl==2) {
			System.out.println("Lisa :)");
		}
		if(Zahl==3) {
			System.out.println("Tatiana :)");
		}
		if(Zahl==4) {
			System.out.println("Metin :)");
		}
		if(Zahl==5) {
			System.out.println("Ayşe :)");
		}
		if(Zahl==6) {
			System.out.println("Niko :)");
		}
		if(Zahl==7) {
			System.out.println("Daniel :)");
		}
		if(Zahl==8) {
			System.out.println("Maria :)");
		}
		if(Zahl==9) {
			System.out.println("Hans :)");
		 
		    }
		
		}
	
		
	}



