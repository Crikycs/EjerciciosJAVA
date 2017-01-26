package edu.femxa.val.baseDatos;

public class Empleado 

{
	private int id;
	private String nombre;
	private int salario;
	private int departamento;
	private String depart_nombre;
	
		
	public String getDepart_nombre() {
		return depart_nombre;
	}

	public void setDepart_nombre(String depart_nombre) {
		this.depart_nombre = depart_nombre;
	}

	public Empleado(int id, String nombre, int salario, int departamento, String depart_nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = departamento;
		this.depart_nombre = depart_nombre;
	}
	
	public Empleado(int id2, String nombre2, int salario2) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getDepartamento() {
		return departamento;
	}
	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
	
}
