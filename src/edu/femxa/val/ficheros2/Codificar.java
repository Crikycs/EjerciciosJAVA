package edu.femxa.val.ficheros2;

public class Codificar {
	
	public static String codifica (String cadena)
	{
		String cadena_codific = "";
		int clave = 4;
		int longi = cadena.length();
		char caracter_actual = 0;
		int numero_caracter = 0;
		char caracter_codific = 0;
		
				
			for (int pos = 0; pos < longi; pos++)
			
			{
				caracter_actual = cadena.charAt(pos);
				if (caracter_actual != ' ')
					
					{
						numero_caracter = (int)caracter_actual;
						numero_caracter = numero_caracter + clave;
						caracter_codific = (char)numero_caracter;
						cadena_codific = cadena_codific + caracter_codific;
					} 
			}
		
		return cadena_codific;
	}
	
	public static String decodifica (String cadena)
	{
		String cadena_decodific = "";
		int clave = 4;
		int longi = cadena.length();
		char caracter_actual = 0;
		int numero_caracter = 0;
		char caracter_decodific = 0;
				
		for (int pos = 0; pos < longi; pos++)
		
		{
			caracter_actual = cadena.charAt(pos);
			if (caracter_actual != ' ')
				
				{
					numero_caracter = (int)caracter_actual;
					numero_caracter = numero_caracter - clave;
					caracter_decodific = (char)numero_caracter;
					cadena_decodific = (cadena_decodific + caracter_decodific);
				} 
		}
		return cadena_decodific;
	}

	public static void main(String[] args) {
		
		
		String resultado_codif = codifica("CRISTINA");
		System.out.println(resultado_codif);
		
		String resultado_decodif = decodifica(resultado_codif);
		System.out.println(resultado_decodif);
		
	}
}
