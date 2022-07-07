package javaLEKTION7;

public class praktisch04 {

	public static void main(String[] args) {
		// concat: Verkettet 2 oder mehr String
		
		String name="Ahmet";
		String nachname = " TERZI";
		String adresse = " Zeitzer strasse 555 Berlin";
		String alt = " 31";
		 System.out.println(name);
		 System.out.println(name);
		 System.out.println(name+nachname);
		 System.out.println(name.concat(nachname)); // String nameNachname = name.concaat(nachname);  GLEICH 
		 System.out.println(name.concat(nachname).concat(adresse).concat(alt));
		 System.out.println(name.concat(nachname).concat(adresse).concat(alt).length());// Wie viel Zeichen gibt es ? ANZAHL VON CHARAKTEREN
		 
	}

}
