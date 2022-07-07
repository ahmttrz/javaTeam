package javaLEKTION7;

public class praktisch02 {

	public static void main(String[] args) {
		/* STRING HABEN VIELE METHODEN
		 * lengt       ZEIGT AN, AUS WIE VIELEN ZEICHEN DIE STRİNG BESTEHT
		 * concat      Verkettet 2 Strings.
		 * equals      Vergleicht 2 Strings.
		 * tolowerCase wandelt alle Zeichen im String in Kleinbuchstaben um.
		 * toUppercase wandelt alle Zeichen im String in Großbuchstaben um..
		 * contains    
		 * trim.
		 * charAt
		 * split
		 * compareTo
		 * replace
		 * substring
		 */
		
		String Information =" Tipp: Suche nur Ergebnisse auf Englisch. Sie können Ihre Suchsprache auf der Seite Einstellungen angeben";
				if(	Information.contentEquals("2005")) {
		System.out.println("True");
		System.out.println("Fasch");
	}
		
	System.out.println(Information.toLowerCase());		
      
	System.out.println(Information.toUpperCase());
	
	System.out.println(Information.length());
	}

}
