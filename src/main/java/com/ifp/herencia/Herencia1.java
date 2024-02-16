/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ifp.herencia;

import java.util.ArrayList;

/**
 *
 * @author Garbine
 * Ejemplo de uso de clases hijas con ArrayList de Empleados (clase padre)
 */
public class Herencia1 {

    static ArrayList<Empleado> repartidores = new ArrayList<>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Repartidor repartidor = new Repartidor("Jesus", "Sanchez", 60, 1000, "Oeste");
		
		repartidores.add(new Repartidor("Antonio", "Lopez", 24, 600, "Norte"));

		repartidores.add(new Repartidor("Gema", "Rodriguez", 45, 700, "Sur"));
		
		repartidores.add(repartidor);
                Comercial comercial = new Comercial("Andrea", "Pinto", 32, 400, 40);
		
		System.out.println(comercial.toString());
		repartidores.add(comercial);		
		for(int i = 0; i < repartidores.size(); i++) {
			repartidores.get(i).plus(300);
			System.out.println(repartidores.get(i));
		}
	}
}
