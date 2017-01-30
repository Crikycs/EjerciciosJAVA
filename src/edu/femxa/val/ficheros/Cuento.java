package edu.femxa.val.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Cuento {
	
	public static void main(String[] args) throws Throwable  {
		
		String idioma = args[0];
		Properties propiedades = null;
		propiedades = new Properties();
		FileReader fr = null;	
		String fichero_salida = null;
		
		switch (idioma)
		
			{
			case "EN":
			try {
				fr = new FileReader ("story_en.properties");
				propiedades.load(fr);
				
							
			} catch (IOException e2) {
				e2.printStackTrace();
			}
				
				break;
				
				
			case "ES":
			try {
				
				fr = new FileReader ("story_es.properties");
				propiedades.load(fr);
			
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
				break;
				
			case "IT":				
			try {	
				
				fr = new FileReader ("story_it.properties");
				propiedades.load(fr);				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
				
				break;
				
			}			
				String start = propiedades.getProperty ("start");
				String body = propiedades.getProperty("body"); 
				String end = propiedades.getProperty("end"); 
				
				fichero_salida = propiedades.getProperty("outfile");
				
				File fichero_creado = new File (fichero_salida);

				FileWriter fw = new FileWriter(fichero_creado);
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write(start+" \n");
				bw.write(body+" \n");
				bw.write(end);
				
				
		bw.close();
		fw.close();
		fr.close();
	
		
		
		
	}

}