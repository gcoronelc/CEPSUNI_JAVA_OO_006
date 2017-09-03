package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba08 {

  public static void main(String[] args) {
    
    List<String> ciudades = new ArrayList<>();
    
    ciudades.add("Chiclayo");
    ciudades.add("Trujillo");
    ciudades.add("Arequipa");
    ciudades.add("Cuzco");
    ciudades.add("Huancayo");
    
    ciudades.stream()
            .filter(s -> s.length() > 5)
            .forEach( s -> System.out.println(s) );

    
  }
  
}
