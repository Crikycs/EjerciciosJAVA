package edu.femxa.val;

public class Cadena {
	
	public static void main (String[] args)
	{
		
		int posicion_inicial = 0;
		int posicion_final = args.length;
		String palabra_actual = null;
		/*
		System.out.println("Palabra 1 = " +args [0]);
		System.out.println("Palabra 2 = " + args[1]);
		System.out.println("Palabra 3 = " + args [2]);
		*/
				
		
		for (int i = posicion_inicial; i < posicion_final; i++)
		{
			palabra_actual = args [i];
			System.out.println("La palabra " + i + " es " + palabra_actual);//imprimir lo q contiene argumento (ej 1, 2..)
		}
	}

}
