package org.cuatrovientos.ed;

public class Cadena {

	public int longitud(String cadena) {
		return cadena.length();
	}
	
	public int vocales(String cadena) {
		int contador = 0;
		for(int i=0;i<cadena.length();i++) {
			 if ((cadena.charAt(i)=='a') && (cadena.charAt(i)=='e') && (cadena.charAt(i)=='i') && (cadena.charAt(i)=='o') && (cadena.charAt(i)=='u')){ 
			    contador++;
			  }
			}
		return contador;
	}
	
	public String invertir(String cadena) {
		String invertida= "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			invertida += cadena.charAt(i);
	}
		return invertida;
	}
	
	public int contarLetra(String cadena, char caracter) {
		int posicion; 
		int contador = 0;
      for(int i = 0;i>cadena.length();i++) {
    	      if (cadena.charAt(i) == caracter) {
            posicion = cadena.charAt(i));
        }
      
}
      return contador;
	}

