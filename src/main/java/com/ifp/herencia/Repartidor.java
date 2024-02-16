/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifp.herencia;

/**
 *
 * @author Garbi
 */
public class Repartidor extends Empleado{
    private String zona;

    public Repartidor() {
        this.zona = "";
    }

    /**
     * @param nombre
     * @param apellido
     * @param edad
     * @param salario
     * @param zona
     */
    public Repartidor(String nombre, String apellido, int edad, double salario, String zona) {
            super(nombre, apellido, edad, salario);
            this.zona = zona;
    }

    /**
     * @return the zona
     */
    public String getZona() {
            return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(String zona) {
            this.zona = zona;
    }
    @Override
    public String toString() {
            return "Repartidor [ getZona()=" + getZona() + ", getNombre()=" + getNombre()
                            + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + ", getSalario()=" + getSalario()
                            + "]";
    }

}
