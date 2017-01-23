package edu.femxa.adivinanza;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		int numAdivinar = 0;
		int numPedido = 0;
		int numIntentos = 0;
		
		numAdivinar=generarNumero();
	
		System.out.println("Introduce un numero:");
		
		do {
			
			numPedido = pedirNumero ();
			compNum (numPedido, numAdivinar);
			numIntentos ++;
					
		}
		
		while ((numIntentos < 5) && (numPedido != numAdivinar));
		
			if  (numPedido != numAdivinar)	
			{
				System.out.println("Has perdido!!");
			}
		}
		
		//generar numero aleatorio
		//pedir nº
		//comparar si nº es > < = 
		//responder al usuario
		
	
	
	
	public static int generarNumero () {
	
		int numAdivinar = 0;
		numAdivinar = (int)(100 * Math.random () + 1);
	
	return numAdivinar ;
	
	}
	
	
	public static int pedirNumero () {
		
		int numPedido = 0;
		Scanner sc = null;
		
		
		
			sc = new Scanner (System.in);
			
			
			
			numPedido = sc.nextInt();
			
			
		
		return numPedido;
			
	}
	
	public static void compNum (int numero_pedido, int numero_adivinar){
		
		
			
			if (numero_pedido > numero_adivinar)
				
			{
				System.out.println("El numero es menor");
			}
			
			
			else if (numero_pedido < numero_adivinar)
			
			{
				System.out.println("El numero es mayor");
			}
			
			else
			
			{
				System.out.println("Correcto, ¡Enhorabuena!");
			}
		
	}
			 
		
		
		
		
	

}


