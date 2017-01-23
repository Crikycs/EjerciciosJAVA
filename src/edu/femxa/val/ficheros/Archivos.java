package edu.femxa.val.ficheros;

import java.io.File;

public class Archivos {

	public static void main(String[] args) {

		File file = null;
		file = new File("ficheros");

		String[] lista = null;
		lista = file.list();

		char caracter_aux = 0;
		String string_aux = null;
		
		int pos = 0;
		
		for (int i = 0; i < lista.length; i++)

		{
			string_aux = lista[i];
			boolean hay_a = false;
			while ((pos < string_aux.length()) && (!hay_a))
			
			{
				caracter_aux = string_aux.charAt(pos);
				
				if ((caracter_aux == 'a') || (caracter_aux == 'A'))

				{
					System.out.println(string_aux);
					hay_a = true;
				}
				
				pos++;
			}

		}
	}

}
