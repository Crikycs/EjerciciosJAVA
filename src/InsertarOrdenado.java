
public class InsertarOrdenado {
	
		
		
		public static int obtenerPos (int [] ae, int n)
		{
			int pos = 0;
			int longi_array = ae.length;
			int num_aux = 0;
			
			
			//TODO haced el cuerpo del método para obtener
			//el resultado esperado			
				
			while ((pos < ae.length) && (ae[pos] < n))//mientras no llegue al final y nº sea mayor.
			
			{
				pos++;//incremento.
			}
						
		return pos;
		
		}
		
		
		public static void desplazar (int ae []){
			
			int posicion_final = ae.length-1;
			int aux= ae[posicion_final];
					
			
				for (int pos=posicion_final; pos > 0; pos--)
						
					{
						ae[pos]=ae[pos-1];
						
						System.out.println(ae[pos]);
					}
				
				ae[0] = aux;
			
				
		}
		
		public static void mostrarArray (int ae[])
		
		{
			for (int i=0; i< ae.length;i++){
				System.out.println(ae[i]);
			}
			
		}
		
		public static void main(String[] args) {
			int ae[] = new int [5];
			
			ae[0] = 1;
			ae[1] = 2;
			ae[2] = 5;
			ae[3] = 6;
			ae[4] = 7;
			
			desplazar(ae);
			mostrarArray(ae);
			
			/*int n_usuario = 3;
			
			int pos = obtenerPos(ae, n_usuario);obtener posicion del numero orde
			
			System.out.println("El numero " + n_usuario + " debe ir en " + pos);
			*/
		}

	}


