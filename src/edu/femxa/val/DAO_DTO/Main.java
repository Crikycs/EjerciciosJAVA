package edu.femxa.val.DAO_DTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
	
	public static void mostrarLista (ArrayList<DTOEmpleados> lemp)
															//DOY NOMBRE A LA LISTA
	{
		for (DTOEmpleados emp : lemp)
		{
			System.out.println(emp.getFirst_name() + " " + emp.getLast_name());
		}
	}
	
	
	public static void main(String[] args) throws SQLException 
	{
		ArrayList<DTOEmpleados> lista_empleados = null;
		
		lista_empleados = new ArrayList<DTOEmpleados>();//ME CREO UNA VARIABLE ARRAYLIST
		
		DAOEmployees empleado_dao = null; 
		empleado_dao = new DAOEmployees();//ME CREO UN OBJETO DE CLASE DAOEmployees
		
		lista_empleados = empleado_dao.recuperarEmpleadosDepart();//LO UTILIZO PARA LLAMAR AL METODO Y SE LE ASIGNO A LA lista_empleados(arrayList) 
		mostrarLista(lista_empleados);//MUESTRO LA LISTA
	}

}
