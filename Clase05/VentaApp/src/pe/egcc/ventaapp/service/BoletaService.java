package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.Item;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class BoletaService extends CompAbstract{

  @Override
  public Item[] procesar(double total) {
    // Variables
    double servicio, totalGeneral;
    // Proceso
    servicio = total * 0.10;
    totalGeneral = total + servicio;
    // Reporte
    Item[] repo = {
      new Item("Total", total),
      new Item("Servicio", servicio),
      new Item("Total General", totalGeneral)
    };
    return repo;
  }

}
