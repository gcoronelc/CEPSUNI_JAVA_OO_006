package pe.egcc.app.prueba;

import pe.egcc.app.service.impl.OperacionSpec;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba04 {

  public static void main(String[] args) {
    
    // Creación de objetos
    OperacionSpec sumar = (n1, n2) -> (n1 + n2);
    OperacionSpec resta = (n1, n2) -> (n1 - n2);
    
    // Proceso
    System.out.println("Suma: " + sumar.operar(8, 3));
    System.out.println("Resta: " + resta.operar(8, 3));
    
  }

  
}
