package edu.femxa.val.cadenas;

	public class Palindroma {
		
		public static void main (String[] args){
			
			if (esPalindroma("poop"))
			{
				System.out.println("VERDADERO");
			} else 
			{
				System.out.println("FALSO");
			}
		}
			
	
		
		public static boolean esPalindroma (String cad){
			
			boolean es_palindroma = true;
			int carac_inicial = 0;
			int carac_final= 0;
			
			carac_final = cad.length()-1;
			
			while ((carac_inicial <= carac_final) && (es_palindroma))
				{
					if (cad.charAt(carac_inicial)==cad.charAt(carac_final))
						{
							es_palindroma = true;
						}
					
				   	else 	{
							es_palindroma = false;
							}
					
					carac_inicial++;
					carac_final--;
				} 
			
			return es_palindroma;
		}

	}


