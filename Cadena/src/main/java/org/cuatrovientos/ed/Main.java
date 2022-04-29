package org.cuatrovientos.ed;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner miScanner = new Scanner (System.in);
		
		Cadena cadena = new Cadena();
		
		System.out.println(cadena.longitud("yo tengo un perro"));
		System.out.println(cadena.vocales("yo tengo un perro"));
		System.out.println(cadena.invertir("yo tengo un perro"));
		System.out.println(cadena.contarLetra("yo tengo un perro", 'a'));


		
	}

}
