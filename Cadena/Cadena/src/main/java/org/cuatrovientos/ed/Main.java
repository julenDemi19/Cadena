package org.cuatrovientos.ed;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner miScanner = new Scanner (System.in);
		char caracter = 'u';
		String palabra = "Julentxo";
		Cadena cadena = new Cadena();
		
		System.out.println(cadena.longitud(palabra));
		System.out.println(cadena.vocales(palabra));
		System.out.println(cadena.invertir(palabra));
		System.out.println(cadena.contarLetra(palabra, caracter));


		
	}

}
