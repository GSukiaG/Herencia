/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

public class Masajista extends Personal {
//	private int id;
//	private String Nombre;
//	private String Apellidos;
//	private int Edad;
	private String Titulacion;
	private int añosExperiencia;

	// constructor, getter y setter

	public Masajista( int id, String nombre, String apellidos, int edad, String Titulacion, int añosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.Titulacion = Titulacion;
        this.añosExperiencia = añosExperiencia;
		
	}
    @Override
    public String toString() {
        return "Masajista{" + "nombre=" + getNombre() +"}";
    }
       @Override
   public void entrenamiento() {
      System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
   }

   public void darMasaje() {
      System.out.println("Da un Masaje");
   }
    public void Concentrarse() {
    }

	public void Viajar() {
		
	}

	
}