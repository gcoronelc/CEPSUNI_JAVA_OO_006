package pe.egcc.app.prueba;

import pe.egcc.app.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {

  public static void main(String[] args) {
  
    MateService service = new MateService();
    
    System.out.println("15 + 18: " + service.sumar(15.0, 18));
    
  }
  
}
