
package futbol;

public class Futbolista extends Personal {
//	private int id;
//	private String Nombre;
//	private String Apellidos;
//	private int Edad;
	private int dorsal;
	private String demarcacion;

	// constructor, getter y setter

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }


    @Override
    public String toString() {
        return "Futbolista { Nombre=" + getNombre() +"}";
    }
    public void Concentrarse() {
    }

	public void Viajar() {
		
	}

	public void jugarPartido() {
		
	}

	public void entrenar() {
		
	}
       @Override
   public void entrenamiento() {
      System.out.println("Realiza un entrenamiento (Clase Futbolista)");
   }

   @Override
   public void partidoFutbol() {
      System.out.println("Juega un Partido (Clase Futbolista)");
   }

   public void entrevista() {
      System.out.println("Da una Entrevista");
   }
}
    

