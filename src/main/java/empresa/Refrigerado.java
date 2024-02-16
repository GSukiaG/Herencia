/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author Garbi
 */
public class Refrigerado extends Producto{
    private String codigoSupervisionAlimentaria;
   
    public Refrigerado(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        codigoSupervisionAlimentaria = "Desconocido";
    }
   
    public void setCodigoSupervisionAlimentaria(String codigo){
        codigoSupervisionAlimentaria = codigo;
    }
   
    public String getCodigoSupervisionAlimentaria(){
        return codigoSupervisionAlimentaria;
    }
	public void imprimirDatos(){
        imprimirInfo();
        System.out.println("Codigo de Supervision Alimentaria: " + getCodigoSupervisionAlimentaria());
    }
}