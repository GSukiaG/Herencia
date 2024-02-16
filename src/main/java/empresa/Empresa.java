
package empresa;

import java.util.Date;

/**
 *
 * @author Garbine
 */

  public class Empresa {
    public static void main(String[]args){
        Congelado nuggets = new Congelado("16-10-2016","L1603004");
        Fresco lechuga = new Fresco("20-10-2016","L1610005");
        Refrigerado zumo = new Refrigerado("25-10-2016","L1609006");
        Date fecha=new Date();
        fecha.getTime();
        System.out.println(fecha);
        System.out.println("Sin datos. \nProducto Congelado: ");
        System.out.println("Fecha de caducidad: " + nuggets.getFechaCaducidad() + "\nNumero de Lote: " + nuggets.getNumeroLote()
                           + "\nTemperatura Recomendada: " + nuggets.getTemperaturaRecomendada() + "C°");
        System.out.println();
        System.out.println("Producto Fresco: ");
        System.out.println("Fecha de caducidad: " + lechuga.getFechaCaducidad() + "\nNumero de Lote: " + lechuga.getNumeroLote()
                           + "\nFecha de envasado: " + lechuga.getFechaEnvasado() + "\nPais de Origen: " + lechuga.getPaisDeOrigen());
        System.out.println();
        System.out.println("Producto Refrigerado: ");
        System.out.println("Fecha de caducidad: " + zumo.getFechaCaducidad() + "\nNumero de Lote: " + zumo.getNumeroLote()
                           + "\nCodigo de supervision alimentaria: " + zumo.getCodigoSupervisionAlimentaria());
        nuggets.setTemperaturaRecomendada(-18);
        lechuga.setFechaEnvasado("03-10-2015");
        lechuga.setPaisDeOrigen("Panamá");
        zumo.setCodigoSupervisionAlimentaria("B#6745");
        System.out.println();
        System.out.println("Con datos. \nProducto Congelado: ");
        System.out.println("Fecha de caducidad: " + nuggets.getFechaCaducidad() + "\nNumero de Lote: " + nuggets.getNumeroLote()
                           + "\nTemperatura Recomendada: " + nuggets.getTemperaturaRecomendada() + "C°");
        System.out.println();
        System.out.println("Producto Fresco: ");
        System.out.println("Fecha de caducidad: " + lechuga.getFechaCaducidad() + "\nNumero de Lote: " + lechuga.getNumeroLote()
                           + "\nFecha de envasado: " + lechuga.getFechaEnvasado() + "\nPais de Origen: " + lechuga.getPaisDeOrigen());
        System.out.println();
        System.out.println("Producto Refrigerado: ");
        System.out.println("Fecha de caducidad: " + zumo.getFechaCaducidad() + "\nNumero de Lote: " + zumo.getNumeroLote()
                           + "\nCodigo de supervision alimentaria: " + zumo.getCodigoSupervisionAlimentaria());
    }
}