package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.Item;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class FacturaService extends CompAbstract{

  @Override
  public Item[] procesar(double total) {
    // Variables
    double importe, impuesto, servicio, totalGeneral;
    // Proceso
    importe = total / 1.18;
    impuesto = total - importe;
    servicio = total * 0.10;
    totalGeneral = total + servicio;
    // Reporte
    Item[] repo = {
      new Item("Importe", importe),
      new Item("Impuesto", impuesto),
      new Item("Total", total),
      new Item("Servicio", servicio),
      new Item("Total General", totalGeneral)
    };
    return repo;
  }
  
}
