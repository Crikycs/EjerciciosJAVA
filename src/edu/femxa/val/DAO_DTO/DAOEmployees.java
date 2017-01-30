package edu.femxa.val.DAO_DTO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAOEmployees {
	
	public ArrayList<DTOEmpleados> recuperarEmpleadosDepart() throws SQLException
	{
		ArrayList<DTOEmpleados> lista = new ArrayList<DTOEmpleados>();
		
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		conn = DriverManager.getConnection ("jdbc:oracle:thin:@127.0.0.1:1521:xe", "HR", "password");
	    stmt = conn.createStatement();
	    
		try {
			rset = stmt.executeQuery(Consultas.CONSULTA_EMPLEADO_DEPART);
			
			
			while (rset.next())
			
				
		    {
				DTOEmpleados emp_dto = new DTOEmpleados(rset.getInt("EMPLOYEE_ID"), rset.getString("FIRST_NAME"), rset.getString("LAST_NAME"), rset.getString("EMAIL"), rset.getString("PHONE_NUMBER"));
				lista.add(emp_dto)	;		
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
		finally{
			
			if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		}
		
		return lista;
		
	}
	
	

}
