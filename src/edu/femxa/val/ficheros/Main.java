package edu.femxa.val.ficheros;

import java.io.File;

public class Main {

	/**
	 * Muestra todos los directorios, subdirectorios y sus respectivos archivos
	 * @param args
	 */
	public static void main(String[] args) 
	{
		File file = null; //declarar objeto de la clase File (ya existe)
		file = new File ("ficheros"); //crear el objeto
		
		boolean existe = file.exists(); //metodo de la clase File (boolean exists)
		
		if (existe)
			{
				System.out.println("Existe el fichero");
				
				String [] lista = null; //crear array de lista
				lista = file.list(); // lista es igual a existe
				
				for (int i = 0; i < lista.length; i++)//recorro la lista
					
					{
						System.out.println(lista[i]);
					}
			}
			
			else 
				{
					System.out.println("No existe");
				}
	}
		

}
