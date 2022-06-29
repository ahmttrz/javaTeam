package javaLEKTION6;

public class praktisch03 {

	public static void main(String[] args) {
		//Schreiben Sie ein Programm
        //das die Fläche und den Umfang eines Rechtecks ​​mit einer kurzen Seitenlänge von 10 und einer langen Seitenlänge von 15 berechnet.

		int kurzenSeitenlänge = 10;
		int langenSteitenlänge= 15;
		 
		int umfangsLänge = 2*(kurzenSeitenlänge+langenSteitenlänge);
		int fläche  = langenSteitenlänge*kurzenSeitenlänge;
		System.out.println("umfangsLänge Ç:"+umfangsLänge);
		System.out.println("fläche :"+ fläche);
	}
}