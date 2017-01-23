package edu.femxa.val.ficheros2;

import java.util.Scanner;

public class LetraDNI {

	/**
	 * Pide al usuario que introduzca su DNI sin letra.
	 * @return El DNI introducido por el usuario
	 */
	public static int pedirDniSinLetra()
	{
		int numero_dni = 0;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			System.out.println("Introduzca el nombre del fichero: ");
			numero_dni = sc.nextInt(); 
					
		return numero_dni;
	}
	
	/**
	 * Busca la letra del DNI a partir del número de DNI.
	 * Consiste en obtener el resto de la división entera entre el número dni y 23.
	 * Esto, nos da un número, cuya posición en la lista de caracteres dada, representa
	 * la letra del DNI.
	 * @param numeroDni Número del DNI
	 * @return La letra del DNI correspondiente al número
	 */
	public static char buscarLetraDni (int numeroDni)
	{
		char letra = 0;
		String caracteresDNI="TRWAGMYFPDXBNJZSQVHLCKE";
		int pos_letra = 0;	
		
			pos_letra = numeroDni % 23;
			letra = caracteresDNI.charAt(pos_letra);
			
		return letra;
	}
	
	public static void main(String[] args) {
		
		int numero_dni = 0;
		
		numero_dni = pedirDniSinLetra();
		System.out.println(buscarLetraDni(numero_dni));
		
	}
}
