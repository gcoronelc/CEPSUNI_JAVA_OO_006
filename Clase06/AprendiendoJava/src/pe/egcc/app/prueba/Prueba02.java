package pe.egcc.app.prueba;

import pe.egcc.app.service.impl.VentaImpl;
import pe.egcc.app.service.spec.VentaSpec;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {

  public static void main(String[] args) {
    
    VentaSpec venta = new VentaSpec() {
      @Override
      public void grabarFactura() {
        System.out.println("Hello");
      }
    };
   
    venta.grabarFactura();
    
    System.out.println("Clase: " + venta.getClass());
    
  }
    
    
}
