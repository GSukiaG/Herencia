
package futbol;


public class Entrenador extends Personal {

//	private int id;
//	private String nombre;
//	private String apellidos;
//	private int edad;
	private String idFederacion;

	// constructor, getter y setter

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
		
	}
   @Override
   public void partidoFutbol() {
      System.out.println("Dirige un Partido (Clase Entrenador)");
   }

   public void planificarEntrenamiento() {
      System.out.println("Planificar un Entrenamiento");
   }
    public void Concentrarse() {
    }

	public void Viajar() {
		
	}

	public void dirigirPartido() {
			
	}

	public void dirigirEntreno() {
		
	}
    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + getNombre() +"}";
    }

    @Override
    public void entrenamiento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
