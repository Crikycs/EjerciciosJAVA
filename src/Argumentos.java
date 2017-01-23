
public class Argumentos {
	
	public static void main (String[]args){
		
		int posicion_final = args.length;
		String palabra = null;
		
		for (int pos= 0; pos < posicion_final; pos++)
		
		{
			palabra = args[pos];
			
			if (laPalabraTieneunai(palabra)) //Si la palabra tiene una i o I
				
				{
					System.out.println(palabra);//Imprimeme la palabra
				}
			
					
		}
	}
			
		
	public static boolean laPalabraTieneunai (String palabra) {
		
		boolean palabra_coni = false;
		int pos = 0;
		int longi = palabra.length();
				
			while ((pos < longi) && (!palabra_coni))//cuando la posicion sea menor que la longitud y no tenga palabra con i
			
			{
				if ((palabra.charAt(pos)=='i')||(palabra.charAt(pos)=='I'))
					
					{
						palabra_coni = true;
					}
				
				pos++;
			}
		
		return palabra_coni;
		
		
	}
		
		
}


