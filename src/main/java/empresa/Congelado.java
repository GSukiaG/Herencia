package empresa;

/**
 *
 * @author Garbi
 */
public class Congelado  extends Producto {
    private double tempCongelacionRecomendada;
   
    public Congelado(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        tempCongelacionRecomendada = 0;
    }
   
    public void setTemperaturaRecomendada(double temperatura){
        tempCongelacionRecomendada = temperatura;
    }
   
    public double getTemperaturaRecomendada(){
        return tempCongelacionRecomendada;
    }
	 public void imprimirDatos(){
        imprimirInfo();
        System.out.println("Temperatura Recomendada: " + getTemperaturaRecomendada() + "\n");
    }
}