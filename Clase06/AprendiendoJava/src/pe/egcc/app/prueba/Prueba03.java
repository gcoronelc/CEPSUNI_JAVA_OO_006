package pe.egcc.app.prueba;

import pe.egcc.app.service.spec.VentaSpec;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {

  public static void main(String[] args) {
    
    VentaSpec venta = () -> {
      System.out.println("Hello");
    };
   
    venta.grabarFactura();
    
    System.out.println("Clase: " + venta.getClass());
    
  }
    
    
}
