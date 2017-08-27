package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    
    // Caso 1
    Clase2 obj1 = new Clase2();
    System.out.println("8 + 5 = " + obj1.sumar(8, 5));
    obj1.showMessage("Buena Gustavo");
        
    // Caso 2
    Clase1 obj2 = obj1; // UpCasting
    System.out.println("8 + 5 = " + obj2.sumar(8, 5));
    // obj2.showMessage("Buena Gustavo");
        
  }

}
