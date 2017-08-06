package pe.egcc.pagodto.prueba;

import pe.egcc.pagodto.dto.PagoDto;
import pe.egcc.pagodto.service.PagoService;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    // Datos
    PagoDto dto = new PagoDto();
    dto.setDias(25);
    dto.setHoras(6);
    dto.setPago(150.0);
    
    // Proceso
    PagoService service = new PagoService();
    dto = service.procesar(dto);
    
    // Reporte
    System.out.println("Ingresos: " + dto.getIngresos());
    System.out.println("Renta: " + dto.getRenta());
    System.out.println("Neto: " + dto.getNeto());
    
  }
  
  
}
