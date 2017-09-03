package pe.egcc.app.service.impl;

import java.util.Vector;
import pe.egcc.app.service.spec.VentaSpec;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class VentaImpl implements VentaSpec{
  
  @Override
  public void grabarFactura() {
    System.out.println("Factura grabada.");
  }
  
  
  public void reportProducts(){
    System.out.println("Reporte de productos ok.");
  }

}
