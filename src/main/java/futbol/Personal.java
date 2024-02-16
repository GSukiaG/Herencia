package futbol;

public class Personal //public abstract class Personal
{

    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    // constructor, getter y setter
    public Personal(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellidos;
        this.edad = edad;
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

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellidos) {
        this.apellido = Apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int Edad) {
        this.edad = Edad;
    }

    public Personal() {
    }

    public void viajar() {
        System.out.println("Viajar (Clase Padre)");
    }

    public void concentrarse() {
        System.out.println("Concentrarse (Clase Padre)");
    }

    public void entrenamiento() {
        System.out.println("entrenamiento (Clase Padre)");
    }
    // IMPORTANTE -> METODO ABSTRACTO => no se implementa en la clase abstracta pero si en la clases hijas
//	public abstract void entrenamiento();

    public void partidoFutbol() {
        System.out.println("Asiste al Partido de Fútbol (Clase Padre)");
    }
}
