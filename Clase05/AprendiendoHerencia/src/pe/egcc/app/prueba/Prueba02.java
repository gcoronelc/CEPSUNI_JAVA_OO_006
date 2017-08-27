package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase3;
import pe.egcc.app.service.Clase4;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {

  public static void main(String[] args) {
    
    Clase2 obj = new Clase2();
    
    System.out.println("Compatible con Object: " + (obj instanceof Object ));
    System.out.println("Compatible con Clase1: " + (obj instanceof Clase1 ));
    System.out.println("Compatible con Clase2: " + (obj instanceof Clase2 ));
    System.out.println("Compatible con Clase3: " + (obj instanceof Clase3 ));
    System.out.println("Compatible con Clase4: " + (obj instanceof Clase4 ));
  }
  
}
