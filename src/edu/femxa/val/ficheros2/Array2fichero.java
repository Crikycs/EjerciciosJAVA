package edu.femxa.val.ficheros2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Array2fichero {

	public static String [] fromFichero2Array (File file) throws IOException
	{
		String [] lista_cadena = new String [3];
		BufferedReader br = new BufferedReader (new FileReader(file));
		int longi = lista_cadena.length;
		String aux = "";
		int pos = 0;
		aux = br.readLine();

		while (aux != null) 

		{

			lista_cadena [pos]= aux;
			aux = br.readLine();
			pos++;
		}

		br.close();
		return lista_cadena;
	}

	public static boolean FromArray2fichero (String [] lista_cadena) throws IOException
	{
		boolean ok= false;
		File file = null;
		file = new File(".\\nuevo");
		boolean esta_creado = false;

		esta_creado= file.createNewFile();
		
			if (esta_creado)
			{
				System.out.println("Esta creado");
			}
		else 
			{
				System.out.println("No esta creado");
			}


		BufferedWriter bw = new BufferedWriter (new FileWriter(file));	

		for (int i = 0; i < lista_cadena.length; i++)
		{
			try {
					bw.write(lista_cadena[i]);
					ok = true;
				
				} catch (IOException e) 
				
					{
						e.printStackTrace();
					}
			
			bw.newLine();
		}

		bw.close();	

		return ok;
	}


	public static void main(String[] args) throws IOException 
	{
		File file = null;
		file = new File ("pepe2");
		String [] array = null;
		boolean escrito = false;

		array = fromFichero2Array(file);

			for (int i=0; i< array.length; i++)
			{
				System.out.println(array[i]);
			}

		escrito = FromArray2fichero(array);
		
			if (escrito)
			{
				System.out.println("Esta escrito");
			}
			else {
				System.out.println("No esta escrito");
			}
		
		
	}
}
