/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author Garbi
 */
public class Fresco  extends Producto {
    private String fechaEnvasado, paisDeOrigen;
   
    public Fresco(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        fechaEnvasado = "Desconocido";
        paisDeOrigen = "Desconocido";
    }
   
    public void setFechaEnvasado(String fecha){
        fechaEnvasado = fecha;
    }
   
    public void setPaisDeOrigen(String pais){
        paisDeOrigen = pais;
    }
   
    public String getFechaEnvasado(){
        return fechaEnvasado;
    }
   
    public String getPaisDeOrigen(){
        return paisDeOrigen;
    }
	public void imprimirDatos(){
        imprimirInfo();
        System.out.println("Fecha de envasado: " + getFechaEnvasado() + "\nPais de origen: " + getPaisDeOrigen() + "\n");
    }
}