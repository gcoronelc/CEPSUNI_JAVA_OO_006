package pe.egcc.appmate.prueba;

import pe.egcc.appmate.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {

  
  public static void main(String[] args) {
    
    for (int i = 0; i < 11; i++) {
      
      long f = MateService.factorial(i);
      
      System.out.println("Factorial de " + i + " es " + f);
      
    }
    
    
  }
  
}
