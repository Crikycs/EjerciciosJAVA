package edu.femxa.val;

import java.util.Scanner;

public class PalabrasyLetras {
	
	 
	
	public boolean siLetraEnPalabra (String palabra , char letra)
	
	
	{
		boolean valor = false;
		
		/**
		 * Mientras que no haya encontrado y no haya llegado al final ir al siguiente. 
		 * Si lo comparo y son iguales es que lo he encontrado, sino, voy al siguiente
		 * metodo que reciba una palabra y muestre todas las letras de esa palabra.
		 */
		
		
		palabra.charAt(0);
		
		return valor;
	}
	
	public static void muestraLetra (String palabra)
	
	
	{
		int longitud = palabra.length();
		int indice = 0;
		
		while (indice < longitud)
		{
			
			System.out.println(palabra.charAt(indice));
		
		indice++;
		
		}
		
	
	}
	

	
	
	
	
	
	public static void main(String[] args) {
		
		String palabra = "hola";
		
		muestraLetra(palabra);
	
		
	}

}
