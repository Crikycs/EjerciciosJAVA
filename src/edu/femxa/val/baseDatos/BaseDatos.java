package edu.femxa.val.baseDatos;


	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

	public class BaseDatos {
		
		public static void liberarRecursos (Connection conn, Statement stmt, ResultSet rset)
		{
			if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		}
		
		
		public static void mostrarLista (ArrayList<Empleado> lista_emp)
		{
			/*for (Empleado empleado : lista_emp)
			{
				System.out.println(empleado.getNombre());
			}*/
			
			Empleado e = null;
			Empleado nombre = null;
			
			for (int i= 0; i < lista_emp.size(); i++)
				
				{
					e = lista_emp.get(i);
					System.out.println("Nombre= " + e.getNombre() + "  Salario= " + e.getSalario() + "  Departamento= " + e.getDepartamento() + "  Nombre departamento= " + e.getDepart_nombre());
				}
		
		}
		
public static void main(String[] args) throws Exception {
			
			
			Connection conn = null;
			ResultSet rset = null;
			Statement stmt = null;//Instruccion
			
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");//obtener una conexion
  	        stmt = conn.createStatement();//por esa conexion una instruccion
			rset = stmt.executeQuery("SELECT E.FIRST_NAME, E.EMPLOYEE_ID, E.SALARY, D.DEPARTMENT_ID, D.DEPARTMENT_NAME FROM EMPLOYEES E, DEPARTMENTS D WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID ORDER BY SALARY DESC");//ejecutar consulta y me devuelve un objeto resulset
			
			ArrayList<Empleado> lista_empleado = null;
			lista_empleado = new ArrayList<Empleado>();
		
			int id = 0;
			String nombre = null;
			int salario = 0;
			int departamento = 0;
			String depart_nombre = null;
			
			
			
				while (rset.next())//mientras haya info(true)
					{
						id = rset.getInt("EMPLOYEE_ID");
						nombre = rset.getString("FIRST_NAME");
						salario = rset.getInt("SALARY");
						departamento = rset.getInt("DEPARTMENT_ID");
						depart_nombre = rset.getString("DEPARTMENT_NAME");
						//public Empleado(int id, String nombre, int salario, int departamento) 
						
						Empleado empleado = new Empleado(id, nombre, salario, departamento, depart_nombre);
						lista_empleado.add(empleado);//añadir empleado a lista.empleado
					}  
				
				mostrarLista(lista_empleado);
				
				liberarRecursos(conn, stmt, rset);
			
			
		}
			
	}	
			/*try
			{
				registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior
				Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
				conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");//obtener una conexion
	  	        stmt = conn.createStatement();//por esa conexion una instruccion
				rset = stmt.executeQuery("SELECT * from EMPLOYEES order by SALARY asc ");//conjunto de datos tras la ejecucion de una consulta. /ejecutar consulta y me devuelve un objeto resulset
				while (rset.next())//mientras haya info(true)
				{
					//System.out.println (rset.getString(1)); 				
					//System.out.println (rset.getString(2));
					String nombre = rset.getString("FIRST_NAME");
					int id = rset.getInt(1);	
					System.out.println("NOMBRE =  " + nombre + "  ID = " + id);
				}  
				   
			
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
			{
				if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
				if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
				if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
			  	   
			}   

		}*/

	
	
