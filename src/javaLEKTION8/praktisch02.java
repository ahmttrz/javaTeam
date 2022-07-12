package javaLEKTION8;

import java.util.Scanner;

public class praktisch02 {

	public static void main(String[] args) {
		// "BITTE in einen PrimitiveDataType-Wert schreiben"

	   Scanner scan = new Scanner(System.in);
	   System.out.println("BITTE in einen Byte-Wert schreiben");
	   byte wert1= scan.nextByte();
	   System.out.println("BITTE in einen Short-Wert schreiben");
	   short wert2= scan.nextShort();
	   System.out.println("BITTE in einen int-Wert schreiben");
	   int wert3= scan.nextInt();
	   System.out.println("BITTE in einen long-Wert schreiben");
	   long wert4= scan.nextLong();
	   System.out.println("BITTE in einen float-Wert schreiben");
	   float wert5= scan.nextFloat();
	   System.out.println("BITTE in einen double-Wert schreiben");
	   double wert6= scan.nextDouble();
	   System.out.println("BITTE in einen boolean-Wert schreiben");
	   boolean wert7= scan.hasNext();
	   System.out.println("BITTE in einen char-Wert schreiben");
	   char wert8= scan.next().charAt(0);
		
		//1891! sn ye
       
       
       
       System.out.println("wert1 "+ wert1);
       System.out.println("wert2 "+ wert2);
       System.out.println("wert3 "+ wert3);
       System.out.println("wert4 "+ wert4);
       System.out.println("wert5 "+ wert5);
       System.out.println("wert6 "+ wert6);
       System.out.println("wert7 "+ wert7);
       System.out.println("wert8 "+ wert8);
       
       
       scan.close();
       
       
       
       
       
	}     
       
}
