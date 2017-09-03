package pe.egcc.app.prueba;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba09 {

  public static void main(String[] args) {
    
    Map<String,Object> persona = new HashMap<>();
    
    persona.put("DNI", "06894532");
    persona.put("EDAD", 20);
    persona.put("FECNAC", Calendar.getInstance().getTime());
    persona.put("NOMBRE", "GUSTAVO");
    persona.put("EDAD", 30);
    

    System.out.println("DNI: " + persona.get("DNI").toString());
    System.out.println("FECNAC: " + persona.get("FECNAC").toString());
    
    System.out.println("================");
    for(String key: persona.keySet() ){
      System.out.println(key + " => " + persona.get(key));
    }
  }
  
}
