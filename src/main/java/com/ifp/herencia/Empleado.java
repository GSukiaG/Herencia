package com.ifp.herencia;

/**
 * Clase Empleado: clase generica o padre 
 * 
 */

public class Empleado {
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param salario
	 */
	public Empleado(String nombre, String apellido, int edad, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
	}
	
	/**
	 * Constructor por defecto
	 */
	public Empleado() {
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.salario = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * Metodo booleano que va a aumentar el salario de un empleado siempre que tenga mas de 40 años
	 * @param sueldoPlus
	 * @return
	 */
	public boolean plus(double sueldoPlus) {
		if(this.edad > 40) {
			this.salario+=sueldoPlus;
			return true;
		}
		return false;
		
	}
}
