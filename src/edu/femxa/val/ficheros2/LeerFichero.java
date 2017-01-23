package edu.femxa.val.ficheros2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) throws IOException {
		
		//File archivo = new File("pepe");
		FileReader file_reader = new FileReader(new File ("pepe"));
		int a = 0;
		int suma = 0;
		
		/*
		 * Hacer un bucle para leer un fichero desde el principio hasta el final
		 * e imprimir el número que suman todas las letras que hay dentro del
		 * fichero.
		 */
		while ((a=file_reader.read()) != -1)
		{
			char c = (char) a; //Casting: conversión de tipos equivalentes.
			//if(c != ' ')
			//{
				System.out.println(c +" " +a);
				suma += a;
			//}
		}
		
		System.out.println(suma);
		file_reader.close();
	}
}
