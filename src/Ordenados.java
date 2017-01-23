import java.util.Scanner;


public class Ordenados {
	
	public static void main (String[] args) {
		
				
		int a_ent_a [] = new int[10];
		int longi_array = a_ent_a.length;
		
		for (int i=0; i < longi_array; i++){
			
			a_ent_a[i] = pedirNumero();
			
		}
			
		
	}
	
	public static int pedirNumero () {
		
		int numero_pedido = 0;
		
		Scanner sc = null;
		
		System.out.println("Introduce un numero");
		
			sc= new Scanner (System.in);
			numero_pedido = sc.nextInt();
			
		return numero_pedido;
		
	}
	
	public static int compararNumero (){
		
		int num_comparado = 0;
		
	return num_comparado;	
		
	}
	
	

}

