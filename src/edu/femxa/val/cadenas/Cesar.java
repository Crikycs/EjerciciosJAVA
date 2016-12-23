package edu.femxa.val.cadenas;

public class Cesar {
	
	public void mostrarCodChar (String cadena)
	
	{
		int longi= cadena.length();
		int numero_carac = 0;
		char caracter = 0;
		
			for (int pos = 0; pos < longi; pos++)
				
			{
				caracter = cadena.charAt(pos);
				numero_carac = (int) caracter;//casting. de caracter a entero.
				System.out.println(caracter + " = " + numero_carac);
			}
		
	}
	
	
	public String cifradoCesar (String palabra, int clave)
	
	{
		
		String cifrada = null;
		int longi= palabra.length();
		int numero_original = 0;
		char caracter_original = 0;
		int num_cifrado = 0;
		char caracter_cifrado = 0;
		
			cifrada = new String();
			
			for (int pos = 0; pos < longi; pos++)
				
				{
					caracter_original = palabra.charAt(pos);
					
					if (caracter_original != ' ')
						
					{
						
						caracter_cifrado = traduceCharCesar(caracter_original, clave);					
						cifrada = cifrada + caracter_cifrado;
					
					} else 
						
						{
							cifrada = cifrada + caracter_original;
						}
					
								
				}
			
			return cifrada;		
	}
	
	
	public char traduceCharCesar (char c, int k){
		char caracter_cifrado = 0;
		int num_caracter = 0;
		
		num_caracter = (int)c;
		num_caracter = num_caracter + k;
		caracter_cifrado = (char) num_caracter;
	
		
		return caracter_cifrado;
		
		
		
		
	}
	
	
	
	public static void main(String[] args){
		
		Cesar cesar = null;
		cesar = new Cesar ();
		String cifrada = null;
		
		cifrada = cesar.cifradoCesar("LOL IPOP", 3);
		System.out.println(cifrada);
		
		
	}

	}
