/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifp.herencia;

/**
 *
 * @author Garbi
 */
public class Comercial extends Empleado {

    private double comision;

    /**
     * 
     */
    public Comercial() {
            super();
            this.comision =0;
    }

    /**
     * @param nombre
     * @param apellido
     * @param edad
     * @param salario
     */
    public Comercial(String nombre, String apellido, int edad, double salario, double comision) {
            super(nombre, apellido, edad, salario);
            this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

	@Override
	public String toString() {
		return "Comercial [getComision()=" + getComision() + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + ", getEdad()=" + getEdad() + ", getSalario()=" + getSalario() + "]";
	}
	
}
