package edu.femxa.val.ficheros2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Contrase�a {
	
	public static String pedirNombre ()
	{
		String nombre = null;
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Introduzca su nombre: ");
			nombre = sc.nextLine();
		
		return nombre;
	}
	
	public static String pedirContrase�a ()
	{
	
		String contrase�a = null;
		Scanner sc = new Scanner (System.in);
			System.out.println("Introduzca su contrase�a: ");
			contrase�a = sc.next();
			
		return contrase�a;
	}
	
	public static boolean confirmarRegistro (String nombre, String contrase�a) throws IOException
	
	{
		boolean confirmado = false;
		String contrase�a_codif = null;
		
		File file = null;
		file = new File("user");
		File file2 = null;
		file2 = new File("contrase�a");
		
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			try {
					bw.write(nombre);
					confirmado = true;
				} 
			
				catch (IOException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
						confirmado = false;
					}
		
				
			FileWriter fw1 = new FileWriter(file2);	
			BufferedWriter bw1 = new BufferedWriter(fw1);
			
			try {
					contrase�a_codif= Codificar.codifica(contrase�a);
					bw1.write(contrase�a_codif);
					
					confirmado = true;
				} 
			
			catch (IOException e) 
				{
					e.printStackTrace();
					confirmado = false;
				}
				
		bw.close();
		fw.close();
		bw1.close();
		fw1.close();
		
		return confirmado;
	}
	
	public static boolean acceder () throws IOException 
	{
		boolean accede = false;
		String user_usuario = null;
		String user_registro = null;		
		String pass_usuario = null;
		String pass_registro = null;
		int contador = 0;
		
		
		File file = null;
		file = new File("user");

		File file2 = null;
		file2 = new File("contrase�a");
		
		FileReader fr = new FileReader(file);		
		BufferedReader br = new BufferedReader (fr);	
		
		FileReader fr2 = new FileReader(file2);
		BufferedReader br2 = new BufferedReader (fr2);
		
		try 
			{
				user_registro = br.readLine();				
			} 
		
			catch (IOException e) 
		
				{
					System.out.println("Error al leer ");
					
					e.printStackTrace();
				}
		try 
			{
				pass_registro = br2.readLine();
			} 
		
			catch (IOException e) 
		
				{
					System.out.println("Error al leer 2.");
					
					e.printStackTrace();
				}
		
		br.close();
		br2.close();
		
		pass_registro = Codificar.decodifica(pass_registro);
		
		do 
			{
				
				user_usuario = pedirNombre();
				pass_usuario = pedirContrase�a();
				
				if (user_usuario.equals(user_registro))
					{
						
						if (pass_usuario.equals(pass_registro))
							{
								System.out.println("Bienvenido " + user_usuario +"!");
								accede = true;
							}
						
						else 
						{
							System.out.println("ERROR: La contrase�a no es correcta." );
							System.out.println("Intentelo de nuevo");
						}
					}
				
				contador++;
			}
		
		while(!accede && contador < 3);
		if (contador == 3)
		{
			System.exit(1);
		}
			
			
		return accede;
	}
	
	public static void main(String[] args) throws IOException {
	
	boolean esta_creada = false;
	String user = null;
	String pass = null;
	String pass2 = null;
	String registro_usuario = null;
	boolean todo_ok = false;
	
	
	user = pedirNombre();
	pass = pedirContrase�a();
	pass2 = pedirContrase�a();
	
	if (pass.equals(pass2))
		{
		
			esta_creada = confirmarRegistro(user, pass);
			
			if (esta_creada)
				{
					System.out.println("Cuenta creada!");
				}
			
				else 
					{
						System.out.println("Error al crear la cuenta");
						System.exit(1);
					}
		}
		
	else
		{
			System.out.println("Las contrase�as no coinciden");
			System.exit(1);
		}
	
	todo_ok = acceder();
	System.out.println("Estas dentro del programa!");
	}
	
	
	
	

}
