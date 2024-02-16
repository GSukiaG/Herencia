/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ifp.herencia;

import java.util.ArrayList;

/**
 *
 * @author Garbi
 */
public class Herencia {

    static ArrayList<Empleado> misEmpleados = new ArrayList<>();
	/**
	 * @param args
	 */
    public static void main(String[] args) {
            Repartidor repartidor = new Repartidor("Jesus", "Sanchez", 60, 1000, "Oeste");
            misEmpleados.add(repartidor);
            misEmpleados.add(new Repartidor("Antonio", "Lopez", 24, 600, "Norte"));

            misEmpleados.add(new Repartidor("Gema", "Rodriguez", 45, 700, "Sur"));



            for(int i = 0; i < misEmpleados.size(); i++) {
                    misEmpleados.get(i).plus(300);
                    System.out.println(misEmpleados.get(i));
            }

            Comercial comercial = new Comercial("Andrea", "Pinto", 32, 400, 40);

            System.out.println(comercial.toString());
    }
}
