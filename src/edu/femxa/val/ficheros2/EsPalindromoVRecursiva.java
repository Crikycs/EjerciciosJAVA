package edu.femxa.val.ficheros2;

public class EsPalindromoVRecursiva {

	/**
	 * 
	 * 
	 * @author Val
	 *
	 *El c�digo de esta clase, es un poco misterioso. Alg�n programador Clase "C", no ha usado
	 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qu� narices hace este c�digo, 
	 *para poder usarlo en nuestro proyecto.
	 *
	 *
	 *Se pide:
	 *
	 *1) Adivinar la funcionalidad del m�todo adivinaQueHace 
	 *2) Una vez descubierto, aplicar un nombre apropiado al m�todo y a la clase
	 *3) Idear un m�todo equivalente, pero distinto. Es decir, crear un m�todo 
	 *que haga lo mismo que adivinaQueHace, pero de otra manera.
	 *4) EXTRA: S�lo si resolviste los puntos anteriores, implementa una versi�n recursiva
	 *
	 */
	/**
	 * 1) Recibe una cadena y devuelve si es pal�ndromo o no.
	 * 2) esPalindromo ser�a el nombre adecuado.
	 * 3) En la clase Palindromos est� el m�todo.
	 */
	private static boolean adivinaQueHace (String cad)
	{
		boolean bd = true;
		
		int i = 0;
		int j = cad.length()-1;
		
		while ((i<=j)&&(bd))
		{
			bd = cad.charAt(i)==cad.charAt(j);
			i++;
			j--;
		}
		
		
		return bd;
	}
	
	public static boolean esPalindromoVersionRecursiva (String cad)
	{
		boolean bd = true;
		int i = 0;
		int j = cad.length()-1;
		
			if((i<=j) && (cad.length()!=0 && cad.length()!=1))
			{
				bd = cad.charAt(i) == cad.charAt(j);
				if(bd)
					esPalindromoVersionRecursiva(cad.substring(i, j));
				i++;
				j--;
			}
			
		
		return bd;
	}
	
	public static void main(String[] args) {
		if (esPalindromoVersionRecursiva("dabale arroz a la zorra el abad"))
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
	}
}