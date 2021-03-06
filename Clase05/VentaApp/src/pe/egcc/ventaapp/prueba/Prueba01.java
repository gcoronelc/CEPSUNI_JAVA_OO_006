package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.BoletaService;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {

  
  public static void main(String[] args) {
    
    // Dato
    double total = 1000.0;
    
    // Proceso
    CompAbstract bean = new BoletaService();
    Item[] repo = bean.procesar(total);
    
    // Reporte
    for (Item item : repo) {
      System.out.println(item.getConcepto() + " - " + item.getValor());
    }
    
    
  }
  
}
